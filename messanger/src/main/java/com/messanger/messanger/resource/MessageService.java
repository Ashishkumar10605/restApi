package com.messanger.messanger.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageService {

	public List<Message> getAllMessgges()
	{
		Message m1 = new Message();
		m1.setId(100);
		m1.setMessage("hello ashish");
		m1.setCreated(new Date());
		m1.setAuther("ashish");
		
		Message m2 = new Message();
		m2.setId(101);
		m2.setMessage("hello aayush");
		m2.setCreated(new Date());
		m2.setAuther("aayush");
		
		List<Message> ll = new ArrayList<>();
		ll.add(m1);
		ll.add(m2);
		
		return ll;
	}
}
