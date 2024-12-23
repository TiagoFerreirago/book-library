package com.library.book.v1.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.github.dozermapper.core.Mapping;

public class BookVo extends RepresentationModel<BookVo> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Mapping("id")
	private Long key;
	
	private String author;
	private LocalDateTime launchDate;
	private Double price;
	private String title;
	
	public BookVo() {
		
	}

	public BookVo(Long key, String author, LocalDateTime launchDate, Double price, String title) {
		this.key = key;
		this.author = author;
		this.launchDate = launchDate;
		this.price = price;
		this.title = title;
	}

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDateTime getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDateTime launchDate) {
		this.launchDate = launchDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(author, key, launchDate, price, title);
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
		BookVo other = (BookVo) obj;
		return Objects.equals(author, other.author) && Objects.equals(key, other.key)
				&& Objects.equals(launchDate, other.launchDate) && Objects.equals(price, other.price)
				&& Objects.equals(title, other.title);
	}

	
}
	