package com.library.book.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.book.exceptions.RequiredObjectIsNullException;
import com.library.book.exceptions.ResourceNotFoundException;
import com.library.book.mapper.DozerMapper;
import com.library.book.model.Book;
import com.library.book.repository.BookRepository;
import com.library.book.v1.vo.BookVo;

@Service
public class BookServices {
	
	private Logger logger = Logger.getLogger(BookServices.class.getName());
	
	@Autowired
	public BookRepository repository;

	public List<BookVo> findAll() {

		logger.info("Finding all book!");

		var books = DozerMapper.parseListsObjects(repository.findAll(), BookVo.class);
		
		return books;
	}

	public BookVo findById(Long id) {
		
		logger.info("Finding one book!");
		
		var entity = repository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		var vo = DozerMapper.parseObject(entity, BookVo.class);
		return vo;
	}
	
	public BookVo create(BookVo book) {

		if (book == null) throw new RequiredObjectIsNullException();
		
		logger.info("Creating one book!");
		var entity = DozerMapper.parseObject(book, Book.class);
		var vo =  DozerMapper.parseObject(repository.save(entity), BookVo.class);
		return vo;
	}
	
	public BookVo update(BookVo book) {

		if (book == null) throw new RequiredObjectIsNullException();
		
		logger.info("Updating one book!");
		
		var entity = repository.findById(book.getKey())
			.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

		entity.setAuthor(book.getAuthor());
		entity.setLaunchDate(book.getLaunchDate());
		entity.setPrice(book.getPrice());
		entity.setTitle(book.getTitle());
		
		var vo =  DozerMapper.parseObject(repository.save(entity), BookVo.class);
		return vo;
	}
	
	public void delete(Long id) {
		
		logger.info("Deleting one book!");
		
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		repository.delete(entity);
	}
}
