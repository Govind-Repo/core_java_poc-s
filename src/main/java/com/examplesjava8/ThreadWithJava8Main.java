package com.examplesjava8;

public class ThreadWithJava8Main {

	public static void main(String[] args) {

		Thread t = new Thread(()->{
			
			for (int i=0;i<5;i++)
			{
				System.out.println("Inside Child Thread");
			}
		});
		
        t.start();
		
		for (int i=0;i<5;i++)
		{
			System.out.println("Inside Parent Thread");
		}
	}

}
