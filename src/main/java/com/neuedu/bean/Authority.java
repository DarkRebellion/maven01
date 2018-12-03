package com.neuedu.bean;

public class Authority {
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIfdelete() {
        return ifdelete;
    }

    public void setIfdelete(Integer ifdelete) {
        this.ifdelete = ifdelete;
    }

    public String getTstyle() {
        return tstyle;
    }

    public void setTstyle(String tstyle) {
        this.tstyle = tstyle;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "aid=" + aid +
                ", acontent='" + acontent + '\'' +
                ", url='" + url + '\'' +
                ", ifdelete=" + ifdelete +
                ", tstyle='" + tstyle + '\'' +
                '}';
    }

    private Integer aid;
    private String acontent;
    private String url;
    private Integer ifdelete;
    private String tstyle;
}
