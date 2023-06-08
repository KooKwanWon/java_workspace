package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.kh.practice3.model.Farm;

public class FarmController {

	private HashMap<Farm, Integer> hMap = new HashMap<>(); // 마트에서 농산물 저장용
	private ArrayList<Farm> list = new ArrayList<>(); // 고객이 구매한 농산물 저장용

	public boolean addNewKind(Farm f, int amount) {

		Set<Farm> key = hMap.keySet();
//		if(hMap.containsKey(f)); hMap에 포함할 때 // for문을 쓸 필요 없음
//		f일때 key를 hMap에서 포함

		for (Farm farm : key) {
			if (farm.getName().equals(f.getName())) {
				return false;
			}
		}
		hMap.put(f, amount);
		return true;

	}

	public boolean removeKind(Farm f) {

		Set<Farm> key = hMap.keySet();

		for (Farm farm : key) {
			if (farm.getName().equals(f.getName())) {
				hMap.remove(farm);

				return true;
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

				hMap.put(f, amount); // 키 값이 같으면 중복x (덮어 씌움)
				return true;
			}
		}

		// 전달 받은 f가 hMap 안에 key로 존재할 때
		// f와 amount 저장 후 true 반환

		// 존재하지 않을 경우 false 반환

		return false;
	}

	public HashMap<Farm, Integer> printFarm() {

		Set<Farm> key = hMap.keySet();

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

		int a = 0;
		for (Farm farm : key) {
			if (farm.getName().equals(f.getName()) && hMap.get(farm) != 0) {
				a = hMap.get(farm) - 1;
				hMap.put(f, a);
//								
				list.add(f);

				return true;
			}
		}
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환

		// 존재하지 않으면 false 반환

		return false;
	}

	public boolean removeFarm(Farm f) {

		int a = 0;
		for (Farm farm : list) {
			if (farm.equals(f)) {
				list.remove(farm);
				a = hMap.get(farm) + 1;
				hMap.put(f, a);
				return true;
			}
		}

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