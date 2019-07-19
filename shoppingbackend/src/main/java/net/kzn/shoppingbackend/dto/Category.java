package net.kzn.shoppingbackend.dto;

public class Category {

	private int id;
	private String name;
	private String descriprtion;
	private String imageURL;
	private boolean active = true;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescriprtion() {
		return descriprtion;
	}
	public void setDescriprtion(String descriprtion) {
		this.descriprtion = descriprtion;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}