package com.library.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.book.service.BookService;
import com.library.book.v1.vo.BookVo;

@RestController
@RequestMapping("/api/book/v1")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping
	public List<BookVo> findAll() {
		return service.findAll();
	}
	
	@GetMapping
	public BookVo findById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public BookVo create(@RequestBody BookVo book) {
		return service.create(book);
	}
	
	@PutMapping
	public BookVo update(@RequestBody BookVo book) {
		return service.update(book);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}