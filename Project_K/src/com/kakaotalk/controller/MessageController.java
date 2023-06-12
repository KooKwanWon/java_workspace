package com.kakaotalk.controller;

import java.util.HashMap;
import java.util.Set;


import com.kakaotalk.model.Message;

public class MessageController {

	private HashMap<String, Message> MessageMap = new HashMap<>();

	
	
	public String sendMessage(String id, Message message) {

		MessageMap.put(id, message);

		return MessageMap.get(id).getMessageIndex() + "님에게 메시지를 보냈습니다.";
	}


	
	public String totalMessage(String id){
		String temp = "";
		Set<String> key = MessageMap.keySet();

		for (String string : key) {
			temp += "[받는 사람] : " + MessageMap.get(string).getMessageIndex() + " [메시지 내용] :"
					+ MessageMap.get(string).getMessagenote() + "\n";

			if(temp == "") {
				temp = "보낸 메시지가 없습니다.";
			}
		}

		return temp;
	}
	
	public boolean deleteMessage(String id){
			
		Set<String> key = MessageMap.keySet();
		MessageMap.remove(id);
		
		if(MessageMap.get(id) == null) {
			return true;
		}
		
		else
		return false;
	}
	
}