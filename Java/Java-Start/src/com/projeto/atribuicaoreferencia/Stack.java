package com.projeto.atribuicaoreferencia;

public class Stack<T>{
	private Knot<T> StackEnter;
	
	public Stack(){
		this.StackEnter = null;
		
	}
	
	public void push(Knot<T> newKnot){
		Knot<T> auxRef = StackEnter;
		StackEnter = newKnot;
		StackEnter.setNextKnot(auxRef);
		
	}
	
	public Knot<T> top(){
		return StackEnter;
		
	}
	
	public Knot<T> pop(){
		if(!this.isEmpty()){
			Knot<T> poppedKnot = StackEnter;
			StackEnter = StackEnter.getNextKnot();
			return poppedKnot;
			
		}
		return null;
		
	}
	
	public boolean isEmpty(){
		return StackEnter == null ? true : false;
		
	}
	
	@Override
	public String toString(){
		String stringReturn = "---------\n";
		stringReturn += "Stack\n"; 
		stringReturn += "---------\n";
		
		Knot<T> auxKnot = StackEnter;
		while(true){
			if(auxKnot != null){
				stringReturn += "[Knot{Data=" + auxKnot.getContent() + "}]\n";
				auxKnot = auxKnot.getNextKnot();
				
			} else {
				break;
				
			}
			
		}
		
		stringReturn += "=========\n";
		return stringReturn;
		
	}

}
