package com.kh.example.abstractNInterface;

public class V40 extends SmartPhone
implements Phone, Camera, CellPhone, TouchDisplay, NotePen{
	
	
	public V40() {
	    setMaker("LG");
	}
	
	@Override
	public boolean blutoothpen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식";
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200, 1600만 트리플 카메라";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "수신 버튼을 누름";
	}

	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		String info = "V40는"+this.getMaker() +"에서 만들어졌고 제원은 다음과 같다."+
				this.makeCall()+
				this.takeCall()+
				this.picture()+
				this.charge()+
				this.touch()+
				"블루투스 펜 탑재 여부 :" + this.blutoothpen();

		return info;
	}

}
