package com.google.Basics;

public class Calculator {
	
	private int num1;
	private int num2;
	private String operation;
	private Operations operation_enum;
	
	public Calculator(int number1, int number2, String operations, Operations operation2)
	{
		this.num1=number1;
		this.num2=number2;
		this.operation=operations;
		this.operation_enum=operation2;
	}
	
	
	public void calculate_ifelse()
	{
		if (operation.equalsIgnoreCase("add"))
			System.out.println(num1+num2);
		else if(operation.equalsIgnoreCase("sub"))
			System.out.println(num1-num2);
		else if(operation.equalsIgnoreCase("mul"))
			System.out.println(num1*num2);
		else if(operation.equalsIgnoreCase("div"))
			System.out.println(num1/num2);
		else
			System.out.println("Enter valid operation");
	}
	
	
	public void calculate_switch()
	{
		switch (operation) {
		case "add":
			System.out.println(num1+num2);
			break;
		case "sub":
			System.out.println(num1-num2);
			break;
		case "mul":
			System.out.println(num1*num2);
			break;
		case "div":
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Enter valid operation!");
	   	
		}
	}
	
	public void calculate_enum() {
		switch(operation_enum) {
		case ADD:
			System.out.println(num1+num2);
			break;
		case SUB:
			System.out.println(num1-num2);
			break;
		case MUL:
			System.out.println(num1*num2);
			break;
		case DIV:
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("Enter valid operation!");
			
		}
	}
	
	
	
	

	public static void main(String[] args) {

		Calculator calc=new Calculator(200,5,"div",Operations.ADD);
		calc.calculate_ifelse();
		calc.calculate_switch();
		calc.calculate_enum();

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
