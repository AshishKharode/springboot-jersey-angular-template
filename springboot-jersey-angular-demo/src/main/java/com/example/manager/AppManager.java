package com.example.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.AppDao;

@Component
public class AppManager {

	@Autowired
	private AppDao dao;
	
	public List<String> getMessages(){
		return dao.getMessages();
	}
}
