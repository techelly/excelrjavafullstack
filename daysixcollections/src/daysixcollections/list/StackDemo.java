package daysixcollections.list;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// Stack- is subclass of Vector. It implements LIFO data structure i.e. Stack.
		// It contains methods of Vector class and also provides like boolean
		// push(),peek() etc which defines its properties.
		List stack = new Stack();// LIFO
		Stack<Double> stackOfDoubleNum = new Stack<Double>();
		
		System.out.println("************Add data in stack using push()**********************");
		stackOfDoubleNum.push(15.50);
		stackOfDoubleNum.push(14.5);
		stackOfDoubleNum.push(11.11);
		stackOfDoubleNum.push(10.25);
		System.out.println("**********************************");
		for (Double num : stackOfDoubleNum) {
			System.out.println(num);
		}
		
		System.out.println("**********************************");
		System.out.println(stackOfDoubleNum);
		stackOfDoubleNum.pop();
		System.out.println(stackOfDoubleNum);
		
		Double[] arrDoubleNume = {55.43,46.78,99.99};
		Stack stackOfDBNum= new Stack();
		stackOfDBNum.push(arrDoubleNume);
		stackOfDBNum.push("Vector is interesting");
		stackOfDBNum.push(1555);
		System.out.println(stackOfDBNum);
		System.out.println("*****************");
		
		Integer lengOfarrDoubleNume =((Double[]) stackOfDBNum.get(0)).length;
		for(int i=0;i<lengOfarrDoubleNume;i++) {
			System.out.println(((Double[]) stackOfDBNum.get(0))[i]);
		}
		System.out.println("*****************");
		
		Double[] aDNum = (Double[]) stackOfDBNum.get(0);
		for(int i=0;i<aDNum.length;i++) {
			System.out.println(aDNum[i]);
		}
	}

}
