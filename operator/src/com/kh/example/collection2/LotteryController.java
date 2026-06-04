package com.kh.example.collection2;

import java.util.HashSet;

public class LotteryController {
	
	HashSet<Lottery> lottery = new HashSet<>();
	HashSet<Lottery> win = new HashSet<>();
	
	public boolean insertObject(Lottery l) {
		if(lottery.add(l)) {
			return false;
		}
	}
	public boolean deleteObject(Lottery l) {
		if(lottery.pop()) {
			win.remove(lottery);
		}
	}
	
	HashSet<Lottery> hs = new HashSet<>();
	
	

}
