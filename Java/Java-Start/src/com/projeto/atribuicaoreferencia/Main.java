package com.projeto.atribuicaoreferencia;

public class Main {
	public static void main(String[] args){
		int intA = 1;
		int intB = intA;
		
		System.out.println("IntA = " + intA + ". IntB = " + intB);
		intA = 2;
		System.out.println("IntA = " + intA + ". IntB = " + intB);
		
		MyObj myObjA = new MyObj(1);
		MyObj myObjB = myObjA;
		
		System.out.println("myObjA = " + myObjA + ". myObjB = " + myObjB);
		myObjA.SetNum(3);
		System.out.println("myObjA = " + myObjA + ". myObjB = " + myObjB);
		
		Knot<String> Knot1 = new Knot<String>("Trabalhar com Java é legal, não?");
		Knot<String> Knot2 = new Knot<String>("É mesmo muito legal. Não concorda?");
		Knot1.setNextKnot(Knot2);
		
		Knot<String> Knot3 = new Knot<String>("Concordo sim, é muito legal!");
		Knot2.setNextKnot(Knot3);
		
		Knot<String> Knot4 = new Knot<String>("É mesmo!");
		Knot3.setNextKnot(Knot4);
		
		System.out.println(Knot1);
		System.out.println(Knot1.getNextKnot());
		System.out.println(Knot1.getNextKnot().getNextKnot());
		System.out.println(Knot1.getNextKnot().getNextKnot().getNextKnot());
		System.out.println(Knot1.getNextKnot().getNextKnot().getNextKnot().getNextKnot());
		
		Stack<String> myStack = new Stack<String>();
		myStack.push(Knot1);
		myStack.push(Knot2);
		myStack.push(Knot3);
		myStack.push(Knot4);
		
		System.out.println(myStack);
		
		myStack.pop();
		System.out.println(myStack);
		
		Queue<String> myQueue= new Queue<String>();
		myQueue.enqueue(Knot1);
		myQueue.enqueue(Knot2);
		myQueue.enqueue(Knot3);
		myQueue.enqueue(Knot4);
		
		System.out.println(myQueue);
		
		myQueue.dequeue();
		System.out.println(myQueue);
		
	}

}
