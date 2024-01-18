package com.example.book.serviice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.dto.BookDTO;
import com.example.book.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public void save(BookDTO bookDTO) {
		System.out.println("ser.save");
		bookRepository.save(bookDTO);
	}

	public List<BookDTO> findAll() {
		System.out.println("ser.fAll");
		return bookRepository.findAll();
	}

}
