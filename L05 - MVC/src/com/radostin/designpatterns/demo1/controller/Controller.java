package com.radostin.designpatterns.demo1.controller;

import com.radostin.designpatterns.demo1.model.Model;
import com.radostin.designpatterns.demo1.view.View;

public class Controller {

	private View view;
	private Model model;

	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}

}
