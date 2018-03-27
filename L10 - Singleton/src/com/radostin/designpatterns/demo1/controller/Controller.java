package com.radostin.designpatterns.demo1.controller;

import com.radostin.designpatterns.demo1.model.Model;
import com.radostin.designpatterns.demo1.view.LoginFormEvent;
import com.radostin.designpatterns.demo1.view.LoginListener;
import com.radostin.designpatterns.demo1.view.View;

public class Controller implements LoginListener {

	private View view;
	private Model model;

	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event recieved: " + event.getName() + ";" + event.getPassword());
	}

}