package com.library.book.unittest.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.library.book.mapper.DozerMapper;
import com.library.book.model.Book;
import com.library.book.unittest.mock.MockBook;
import com.library.book.v1.vo.BookVo;

public class DozerConverterTest {
    
    MockBook inputObject;

    @BeforeEach
    public void setUp() {
        inputObject = new MockBook();
    }

    @Test
    public void parseEntityToVOTest() {
        BookVo output = DozerMapper.parseObject(inputObject.mockEntity(), BookVo.class);
        assertEquals(Long.valueOf(0L), output.getKey());
        assertEquals("Some Author0", output.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), output.getLaunchDate());
        assertEquals(25, output.getPrice());
        assertEquals("Some Title0", output.getTitle());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<BookVo> outputList = DozerMapper.parseListsObjects(inputObject.mockEntityList(), BookVo.class);
        BookVo outputZero = outputList.get(0);
        
        assertEquals(Long.valueOf(0L), outputZero.getKey());
        assertEquals("Some Author0", outputZero.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), outputZero.getLaunchDate());
        assertEquals(25, outputZero.getPrice());
        assertEquals("Some Title0", outputZero.getTitle());
        
        BookVo outputSeven = outputList.get(7);
        
        assertEquals(Long.valueOf(7L), outputSeven.getKey());
        assertEquals("Some Author7", outputSeven.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), outputSeven.getLaunchDate());
        assertEquals(25, outputSeven.getPrice());
        assertEquals("Some Title7", outputSeven.getTitle());
        
        BookVo outputTwelve = outputList.get(12);
        
        assertEquals(Long.valueOf(12L), outputTwelve.getKey());
        assertEquals("Some Author12", outputTwelve.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), outputTwelve.getLaunchDate());
        assertEquals(25, outputTwelve.getPrice());
        assertEquals("Some Title12", outputTwelve.getTitle());
        
    }

    @Test
    public void parseVOToEntityTest() {
    	Book output = DozerMapper.parseObject(inputObject.mockVO(), Book.class);
        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("Some Author0", output.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), output.getLaunchDate());
        assertEquals(25, output.getPrice());
        assertEquals("Some Title0", output.getTitle());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Book> outputList = DozerMapper.parseListsObjects(inputObject.mockVOList(), Book.class);
        Book outputZero = outputList.get(0);
        
        assertEquals(Long.valueOf(0L), outputZero.getId());
        assertEquals("Some Author0", outputZero.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), outputZero.getLaunchDate());
        assertEquals(25, outputZero.getPrice());
        assertEquals("Some Title0", outputZero.getTitle());
        
        Book outputSeven = outputList.get(7);
        
        assertEquals(Long.valueOf(7L), outputSeven.getId());
        assertEquals("Some Author7", outputSeven.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), outputSeven.getLaunchDate());
        assertEquals(25, outputSeven.getPrice());
        assertEquals("Some Title7", outputSeven.getTitle());
        
        Book outputTwelve = outputList.get(12);
        
        assertEquals(Long.valueOf(12L), outputTwelve.getId());
        assertEquals("Some Author12", outputTwelve.getAuthor());
        assertEquals(LocalDateTime.of(2024,12,25,15,30), outputTwelve.getLaunchDate());
        assertEquals(25, outputTwelve.getPrice());
        assertEquals("Some Title12", outputTwelve.getTitle());
    }
}
