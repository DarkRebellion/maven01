package com.neuedu.bean;

import com.neuedu.dto.GoodsResult;

public class Goods {
    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gprice=" + gprice +
                ", grepertory=" + grepertory +
                ", gsalesvolume=" + gsalesvolume +
                ", gremarks='" + gremarks + '\'' +
                ", ghoto='" + gphoto + '\'' +
                ", tid=" + tid +
                '}';
    }

    public Goods(GoodsResult goodsResult) {
        this.gid = goodsResult.getGid();
        this.gname = goodsResult.getGname();
        this.gprice = goodsResult.getGprice();
        this.grepertory = goodsResult.getGrepertory();
        this.gsalesvolume = goodsResult.getGsalesvolume();
        this.gremarks = goodsResult.getGremarks();
//        this.gphoto = gphoto;
        this.tid = goodsResult.getTid();
    }

    public Goods() {
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getGprice() {
        return gprice;
    }

    public void setGprice(Integer gprice) {
        this.gprice = gprice;
    }

    public Integer getGrepertory() {
        return grepertory;
    }

    public void setGrepertory(Integer grepertory) {
        this.grepertory = grepertory;
    }

    public Integer getGsalesvolume() {
        return gsalesvolume;
    }

    public void setGsalesvolume(Integer gsalesvolume) {
        this.gsalesvolume = gsalesvolume;
    }

    public String getGremarks() {
        return gremarks;
    }

    public void setGremarks(String gremarks) {
        this.gremarks = gremarks;
    }

    public String getGhoto() {
        return gphoto;
    }

    public void setGhoto(String gphoto) {
        this.gphoto = gphoto;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }


    private Integer gid;
    private String gname;
    private Integer gprice;
    private Integer grepertory;
    private Integer gsalesvolume;
    private String gremarks;
    private String gphoto;
    private Integer tid;
}
