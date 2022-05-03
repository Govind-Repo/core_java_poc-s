package com.examplesjava8;

public class ThreadWithoutJava8Main {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i=0;i<5;i++)
				{
					System.out.println("Inside Child Thread");
				}
				
			}
		});
		
		thread.start();
		
		for (int i=0;i<5;i++)
		{
			System.out.println("Inside Parent Thread");
		}
	}

}
