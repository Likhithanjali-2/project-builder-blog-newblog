package model;

import java.time.LocalDate;

public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	public Blog(String title,String description,LocalDate postedOn){
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	
	public void setBlogTitle(String title) {
		this.title = title;
	}
	public void setBlogDescription(String description) {
		this.description = description;
	}
	public void setDate(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	public String getBlogTitle() {
		return this.title;
	}
	public String getBlogDescription() {
		return this.description;
	}
	public LocalDate getDate() {
		return this.postedOn;
	}
	
}
// Type your code