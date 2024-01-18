package com.example.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.book.dto.BookDTO;
import com.example.book.serviice.BookService;


@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
