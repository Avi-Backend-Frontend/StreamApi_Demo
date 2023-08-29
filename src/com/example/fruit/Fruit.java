package com.example.fruit;

public class Fruit {
	
	private String fruitname;
	private Integer qty;
	private Integer price;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String fruitname, Integer qty, Integer price) {
		super();
		this.fruitname = fruitname;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [fruitname=" + fruitname + ", qty=" + qty + ", price=" + price + "]";
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
