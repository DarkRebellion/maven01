package com.neuedu.dto;

import org.springframework.web.multipart.MultipartFile;

public class GoodsResult {
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

    public void setGsalesvolume(Integer gsalasvolume) {
        this.gsalesvolume = gsalasvolume;
    }

    public String getGremarks() {
        return gremarks;
    }

    public void setGremarks(String gremarks) {
        this.gremarks = gremarks;
    }

    public MultipartFile getGphoto() {
        return gphoto;
    }

    public void setGphoto(MultipartFile gphoto) {
        this.gphoto = gphoto;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
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
    private MultipartFile gphoto;
    private String gphotopath;

    public String getGphotopath() {
        return gphotopath;
    }

    public void setGphotopath(String gphotopath) {
        this.gphotopath = gphotopath;
    }

    private String tname;
    private Integer tid;


    public GoodsResult() {
    }

    @Override
    public String toString() {
        return "GoodsResult{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gprice=" + gprice +
                ", grepertory=" + grepertory +
                ", gsalesvolume=" + gsalesvolume +
                ", gremarks='" + gremarks + '\'' +
                ", ghoto=" + gphoto +
                ", gphotopath='" + gphotopath + '\'' +
                ", tname='" + tname + '\'' +
                ", tid=" + tid +
                '}';
    }
}
