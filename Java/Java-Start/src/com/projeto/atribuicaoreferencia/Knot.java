package com.projeto.atribuicaoreferencia;

public class Knot<T>{
	private T content;
	private Knot<T> nextKnot;
	
	public Knot(T content){
		this.nextKnot = null;
		this.content = content;
		
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Knot<T> getNextKnot() {
		return nextKnot;
	}

	public void setNextKnot(Knot<T> nextKnot) {
		this.nextKnot = nextKnot;
	}

	@Override
	public String toString() {
		return "Knot [content=" + content + "]";
	}

	
	
}
