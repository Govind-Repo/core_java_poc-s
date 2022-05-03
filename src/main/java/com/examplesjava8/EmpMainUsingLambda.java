package com.examplesjava8;

public class EmpMainUsingLambda {

	public static void main(String[] args) {

//		Employee emp= ()->System.out.println("Inside M1 Method Using Java 8");
//		emp.m1();
		
//	    EmployeeFunctional emp = (a,b)->System.out.println("Sum Using Java 8 is "+(a+b));
//	    emp.Sum(90, 244);
		
		EmployeeFunctional empString = (a)->a.substring(0, 4);
		System.out.println(empString.getDetails("String"));
	}

}
