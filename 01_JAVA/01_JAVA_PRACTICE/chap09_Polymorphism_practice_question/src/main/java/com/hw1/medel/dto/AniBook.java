package com.hw1.medel.dto;

public class AniBook extends Book{

    private int accessAge; //제한 나이

    public AniBook(){

    }

    @Override
    public boolean isCoupon() {
        return false;
    }


    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }
    @Override
    public int getAccessAge() {
        return accessAge;
    }
    @Override
    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public void setCoupon(boolean coupon) {

    }

    @Override
    public String toString() {
        return "만화책 :" + super.toString() +
                "제한나이 =" + accessAge +
                " ";
    }
}
