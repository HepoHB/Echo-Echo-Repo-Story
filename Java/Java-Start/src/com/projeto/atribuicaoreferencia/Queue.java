package com.projeto.atribuicaoreferencia;

public class Queue<T>{
	private Knot<T> StackEnter;

	public Queue(){
		this.StackEnter = null;
		
	}

	public boolean isEmpty(){
		return StackEnter == null ? true : false;
		
	}
	
	public void enqueue(Knot<T> newKnot){
		newKnot.setNextKnot(StackEnter);
		StackEnter = newKnot;
		
	}
	
	public Knot<T> first(){
		if(!this.isEmpty()){
			Knot<T> firstKnot = StackEnter;
			while(true){
				if(firstKnot.getNextKnot() != null){
					firstKnot = firstKnot.getNextKnot();
					
			} else{
				break;
				
			}
				
			
			}
			
		}
		return null;
		
	}
	
	public Knot<T> dequeue(){
		if(!this.isEmpty()){
			Knot<T> firstKnot = StackEnter;
			Knot<T> auxKnot = StackEnter;
			while(true){
				if(firstKnot.getNextKnot() != null){
					auxKnot = firstKnot;
					firstKnot = firstKnot.getNextKnot();
					
				} else{
					auxKnot.setNextKnot(null);
					break;
					
				}
				
			
			}
			return firstKnot;
			
		}
		return null;
		
	}
	
	public String toString(){
		String stringReturn = "---------\n";
		stringReturn += "Queue\n"; 
		stringReturn += "---------\n";
		
		Knot<T> auxKnot = StackEnter;
			if(StackEnter != null){
				while(true){
					stringReturn += "[Knot{Data=" + auxKnot.getContent() + "}]\n";
					if(auxKnot.getNextKnot() != null){
						auxKnot = auxKnot.getNextKnot();
						
					} else {
						break;
						
					}
					
				}
				
			} else {
				stringReturn = null;
				
			}
			
		
		stringReturn += "=========\n";
		return stringReturn;
		
	}
	
}
