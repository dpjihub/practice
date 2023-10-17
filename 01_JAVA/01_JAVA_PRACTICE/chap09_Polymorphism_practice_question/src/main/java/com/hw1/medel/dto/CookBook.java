package com.hw1.medel.dto;

public class CookBook extends Book{
    private boolean coupon; //요리학원 쿠폰 유무

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }



    @Override
    public boolean isCoupon() {
        return coupon;
    }

    @Override
    public int getAccessAge() {
        return 0;
    }

    @Override
    public void setAccessAge(int accessAge) {

    }

    @Override
    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "요리책 :" + super.toString() +
                "쿠폰 = " + coupon +
                " ";
    }
}
