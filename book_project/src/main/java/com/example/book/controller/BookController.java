package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.book.dto.BookDTO;
import com.example.book.serviice.BookService;


@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/save")
	public String save() {
		System.out.println("get/save");
		return "save";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute BookDTO bookDTO) {
		System.out.println("BookDTO="+bookDTO);
		bookService.save(bookDTO);
		System.out.println("post/save");
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<BookDTO> bookDTOs = bookService.findAll();
		model.addAttribute("bookList",bookDTOs);
		System.out.println(model);
		return "list";
	}
	
}
