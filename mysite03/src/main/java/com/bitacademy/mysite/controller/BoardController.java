package com.bitacademy.mysite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bitacademy.mysite.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	public String index(value="p", required=true, defualtValue="1") 

}
