package com.champion.request;

import java.util.HashSet;
import java.util.Set;

import com.champion.model.Size;

import lombok.Getter;
import lombok.Setter;



public class CreteProductRequest {
	
	private String title;
	private String description;
	private String price;
 private int discountedPrice;
 private int discountPersent;
 private int quantity;
 
 private String brand;
 
 private String color;
 
 private Set<Size> size=new HashSet<>();
 
 private String imageUrl;
 
 private String topLevelCatrgory;
 
 private String secondLevelCatrgory;
 
 private String thirdLevelCatrgory;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public int getDiscountedPrice() {
	return discountedPrice;
}

public void setDiscountedPrice(int discountedPrice) {
	this.discountedPrice = discountedPrice;
}

public int getDiscountPersent() {
	return discountPersent;
}

public void setDiscountPersent(int discountPersent) {
	this.discountPersent = discountPersent;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public Set<Size> getSize() {
	return size;
}

public void setSize(Set<Size> size) {
	this.size = size;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}

public String getTopLevelCatrgory() {
	return topLevelCatrgory;
}

public void setTopLevelCatrgory(String topLevelCatrgory) {
	this.topLevelCatrgory = topLevelCatrgory;
}

public String getSecondLevelCatrgory() {
	return secondLevelCatrgory;
}

public void setSecondLevelCatrgory(String secondLevelCatrgory) {
	this.secondLevelCatrgory = secondLevelCatrgory;
}

public String getThirdLevelCatrgory() {
	return thirdLevelCatrgory;
}

public void setThirdLevelCatrgory(String thirdLevelCatrgory) {
	this.thirdLevelCatrgory = thirdLevelCatrgory;
}
 
 
}
