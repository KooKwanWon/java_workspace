package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.kh.practice3.model.Farm;

public class FarmController {

	private HashMap<Farm, Integer> hMap = new HashMap<>(); // 마트에서 농산물 저장용
	private ArrayList<Farm> list = new ArrayList<>(); // 고객이 구매한 농산물 저장용

	public boolean addNewKind(Farm f, int amount) {

		hMap.put(f, amount);

		if (true) {

			return true;
		}

		return false;

	}

	public boolean removeKind(Farm f) {

		Set<Farm> key = hMap.keySet();

		for (Farm farm : key) {
			if (farm.getName().equals(f.getName())) {
				hMap.remove(farm);
				System.out.println("농산물 삭제에 성공하였습니다.");
			}
		}

		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// hMap에 f 삭제 후 true 반환

		// 존재하지 않을 경우 false 반환

		return false;
	}

	public boolean changeAmount(Farm f, int amount) {

		Set<Farm> key = hMap.keySet();

		for (Farm farm : key) {
			if (farm.getName().equals(f.getName())) {
				hMap.remove(farm);
				hMap.put(f, amount);
				System.out.println("농산물 수량이 수정되었습니다.");
				return true;
			}
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
		}
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// f와 amount 저장 후 true 반환

		// 존재하지 않을 경우 false 반환

		return false;
	}

	public HashMap<Farm, Integer> printFarm() {

		Set<Farm> key = hMap.keySet();

		Collection<Integer> value = hMap.values();

		Iterator<Farm> it = key.iterator();
		while (it.hasNext()) {
			Farm name = it.next();
			System.out.println(name.getKind() + " : " + name.getName() + "(" + hMap.get(name) + "개)");
		}

		return hMap;
	}

	// 고객 관련 기능 ------------------------------------------------------------

	public boolean buyFarm(Farm f) {

		Set<Farm> key = hMap.keySet();

		Collection<Integer> value = hMap.values();
		
		int a = 0;
		int i = 0;
		for (Farm farm : key) {
			if (farm.getName().equals(f.getName()) && hMap.get(farm)!=0) {
				a = hMap.get(farm) -1 ;
				hMap.put(f, a); 
//								
				list.add(f);
				i++;
				
				return true;
			}
		}
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환

		// 존재하지 않으면 false 반환

		return false;
	}

	public boolean removeFarm(Farm f) {

		// 전달 받은 f가 list에 존재할 때
		// list에 f 삭제, 그리고 hMap에 f 수량 1 증가, true 반환

		// 아니면 false 반환

		return false;
	}

	public ArrayList<Farm> printBuyFarm() {
		
		for (Farm farm : list) {
			System.out.println(farm); 
		}
		
		return list;
	}
}
