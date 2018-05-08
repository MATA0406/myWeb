package com.j.myapp;

public class ModelVO {
	private String id;
	private String title;
	private Integer min;
	private Integer max;
	
	@Override
	public String toString() {
		return "ModelVO [id=" + id + ", title=" + title + ", min=" + min + ", max=" + max + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	
	
	
}
