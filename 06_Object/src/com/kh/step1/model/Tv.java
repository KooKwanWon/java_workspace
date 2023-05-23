package com.kh.step1.model;

public class Tv {
	
	public boolean power; //전원상태(on/off)
	public int channel = 20;   //채널
		
	//기능(function) : 함수, 메소드(method)
	public void power() {
		power = !power;
	} //TV를 켜거나 끄는 기능

	public void channelUp() {
		++channel;
	} // 채널을 높이는 기능
		
	public void channelDown() {
		--channel;
	} // 채널을 낮추는 기능
		
	
}
