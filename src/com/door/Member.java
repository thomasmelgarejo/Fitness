package com.door;

public class Member extends Person {

    private boolean isBasic;
    private  String memberType;
    private int fee;

    public Member(String name, String cpr, String memberType, int fee) {
        super(name, cpr);
        this.memberType = memberType;
        this.fee = fee;
    }

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    public String getMemberType() {
        return memberType;
    }

    public int getFee() {
        return fee;
    }
}
