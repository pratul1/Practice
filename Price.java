package com.prac.basic;

public class Price {

	private String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int price;

	public Price(int p, String s) {
		this.price = p;
		this.item = s;
	}

	public int Hashcode() {
		int hashcode;

		hashcode = Integer.parseInt(item) + price;

		return hashcode;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Price) {
			Price pp = (Price) obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
		} else {
			return false;

		}

	}

}
