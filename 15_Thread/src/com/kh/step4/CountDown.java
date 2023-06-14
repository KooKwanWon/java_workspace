package com.kh.step4;

import javax.swing.JOptionPane;

public class CountDown implements Runnable {
	InputThreadTest pc;

	public CountDown(InputThreadTest pc) {
		this.pc = pc;
	}

	@Override
	public void run() {
		
		// 1. 데이터 입력

		pc.input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요....");
		System.out.println("입력하신 숫자는 " + pc.input + "입니다.");
	}
}
