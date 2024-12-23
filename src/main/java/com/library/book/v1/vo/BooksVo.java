package com.library.book.v1.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.github.dozermapper.core.Mapping;

public class BooksVo extends RepresentationModel<BooksVo> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Mapping("id")
	private Long key;
	
	private String autor;
	private LocalDateTime dateTime;
	private Double price;
	private String text;
	
	public BooksVo() {
		
	}

	public BooksVo(Long key, String autor, LocalDateTime dateTime, Double price, String text) {
		this.key = key;
		this.autor = autor;
		this.dateTime = dateTime;
		this.price = price;
		this.text = text;
	}

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(autor, dateTime, key, price, text);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksVo other = (BooksVo) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(dateTime, other.dateTime)
				&& Objects.equals(key, other.key) && Objects.equals(price, other.price)
				&& Objects.equals(text, other.text);
	}

	
}
	