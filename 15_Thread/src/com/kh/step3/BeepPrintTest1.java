package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		
		BeepPrintThread bpt = new BeepPrintThread();
		Thread bpThread = new Thread(bpt, "BeepPrintThread");
		
		bpThread.start();
		
		
		for(int i = 0; i < 5; i++) {
			tool.beep();
			try {
				System.out.println(i);
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {}
			
		
		
		
		
		
//		ComeThread come = new ComeThread();
//		GoThread go = new GoThread();
//		
//		Thread tcome = new Thread(come, "ComeThread");
//		Thread tgo = new Thread(go, "GoThread");
//		
//		tcome.start();
//		tgo.start();
	}
	
	
	
	}
}
