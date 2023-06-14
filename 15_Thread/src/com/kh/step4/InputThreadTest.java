package com.kh.step4;

public class InputThreadTest {
	
	public String input = "0";
	
	public static void main(String[] args) {
		
		InputThreadTest pc = new InputThreadTest(); 
		
		CountDown cd = new CountDown(pc);
		Input ip = new Input(pc);

		
		Thread tcd = new Thread(cd);
		Thread tip = new Thread(ip);
		
		tcd.start();
		tip.start();

	}
	public int getNum() {
		
		return Integer.parseInt(input);
	}
	
}
