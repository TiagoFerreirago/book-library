package com.library.book.unittest.mock;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.library.book.model.Book;
import com.library.book.v1.vo.BookVo;

public class MockBook {


    public Book mockEntity() {
        return mockEntity(0);
    }
    
    public BookVo mockVO() {
        return mockVO(0);
    }
    
    public List<Book> mockEntityList() {
        List<Book> books = new ArrayList<Book>();
        for (int i = 0; i < 14; i++) {
            books.add(mockEntity(i));
        }
        return books;
    }

    public List<BookVo> mockVOList() {
        List<BookVo> books = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            books.add(mockVO(i));
        }
        return books;
    }
    
    public Book mockEntity(Integer number) {
        Book book = new Book();
        book.setId(number.longValue());
        book.setAuthor("Some Author" + number);
        book.setLaunchDate(LocalDateTime.of(2024, 12, 25, 15, 30));
        book.setPrice(25D);
        book.setTitle("Some Title" + number);
        return book;
    }

    public BookVo mockVO(Integer number) {
        BookVo book = new BookVo();
        book.setKey(number.longValue());
        book.setAuthor("Some Author" + number);
        book.setLaunchDate(LocalDateTime.of(2024, 12, 25, 15, 30));
        book.setPrice(25D);
        book.setTitle("Some Title" + number);
        return book;
    }

}
