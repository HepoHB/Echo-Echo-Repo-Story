import sqlalchemy as SQL
from sqlalchemy.orm import declarative_base, Session
from sqlalchemy.orm import relationship

Base = declarative_base()


class User(Base):
    __tablename__ = "User"
    cd_id = SQL.Column(SQL.Integer, primary_key=True)
    nm_name = SQL.Column(SQL.String)
    nm_fullname = SQL.Column(SQL.String)

    nm_mail = relationship(
        "Address", back_populates="user", cascade="all, delete-orphan"
    )

    def __repr__(self):
        return f"User(id={self.cd_id}, name={self.nm_name}, fullname={self.nm_fullname})"


class Address(Base):
    __tablename__ = "Address"
    cd_id = SQL.Column(SQL.Integer, primary_key=True)
    nm_mail = SQL.Column(SQL.String(50), nullable=False)
    cd_userId = SQL.Column(SQL.Integer, SQL.ForeignKey("User.cd_id"))

    user = relationship(
        "User", back_populates="nm_mail"
    )

    def __repr__(self):
        return f"Address(cd_id={self.cd_id}, nm_mail={self.nm_mail})"


engine = SQL.create_engine("sqlite://")

Base.metadata.create_all(engine)

inspector = SQL.inspect(engine)

print(inspector)
print(inspector.has_table("User"))
print(inspector.get_table_names())
print(inspector.default_schema_name)

with Session(engine) as session:
    nero = User(
        nm_name='Nero',
        nm_fullname='Nero Haziel',
        nm_mail=[Address(nm_mail='HazielNero@gmail.com')]

    )

    weslley = User(
        nm_name='Weslley',
        nm_fullname='Weslley Batista',
        nm_mail=[Address(nm_mail='czuyidleempire@gmail.com'),
                 Address(nm_mail='weslleybatista@yahoo.com')]

    )

    session.add_all([nero,weslley])
    session.commit()