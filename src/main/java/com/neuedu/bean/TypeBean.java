package com.neuedu.bean;

public class TypeBean {
    private Integer tid;
    private String tname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "TypeBean{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
