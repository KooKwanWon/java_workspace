package com.kh.step4;

public class Input implements Runnable {

	InputThreadTest pc;
	
	public Input(InputThreadTest pc) {
		this.pc = pc;
	}

	@Override
	public void run() {

		CountDown cd = new CountDown(pc);
		
		for (int i = 10; i > 0; i--) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			System.out.println(i);
			if (pc.getNum() == i) {
				System.out.println("입력하신 숫자 도달하였습니다.");
				break;
			} else if (i == 1) {
				System.out.println("숫자를 입력하지 않았습니다.");
			}
		}

	}
}
