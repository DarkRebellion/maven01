package com.neuedu.bean;

public class BuyCar {
    Integer cid;
    Integer gid;
    Integer uid;
    Integer num;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "BuyCarDAO{" +
                "cid=" + cid +
                ", gid=" + gid +
                ", uid=" + uid +
                ", num=" + num +
                '}';
    }
}
