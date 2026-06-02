package com.kh.example.poly2;

public class CookBook extends Book{
	
	private boolean coupon;

	public CookBook() {
		super();
	}


	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	/**
	 * @return the coupon
	 */
	public boolean isCoupon() {
		return coupon;
	}

	/**
	 * @param coupon the coupon to set
	 */
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + "]";
	}
	
	
}
