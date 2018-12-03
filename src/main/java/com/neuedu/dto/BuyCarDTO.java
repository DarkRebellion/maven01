package com.neuedu.dto;

public class BuyCarDTO {
    Integer cid;
    Integer gid;
    Integer uid;
    Integer num;
    Integer gprice;

    @Override
    public String toString() {
        return "BuyCarDTO{" +
                "cid=" + cid +
                ", gid=" + gid +
                ", uid=" + uid +
                ", num=" + num +
                ", gprice=" + gprice +
                '}';
    }

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

    public Integer getGprice() {
        return gprice;
    }

    public void setGprice(Integer gprice) {
        this.gprice = gprice;
    }
}
