package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AppDao {

	public List<String> getMessages(){
		List<String> msgs = new ArrayList<String>();
		msgs.add("Hello World !!!");
		msgs.add("Good Morning !!!");
		return msgs;
	}
}
