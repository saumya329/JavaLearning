package com.google.Basics;

public class MultiplicationTable {
	private int number;
	
	public MultiplicationTable(int num)
	{
		this.number=num;
	}
	
	public void multiply()
	{
		for (int i=1;i<=10;i++)
			System.out.println(number+"*"+i+"= "+number*i);
	}

	public static void main(String[] args) {
	       MultiplicationTable table=new MultiplicationTable(Integer.parseInt(args[0]));
	       table.multiply();

	}

}
