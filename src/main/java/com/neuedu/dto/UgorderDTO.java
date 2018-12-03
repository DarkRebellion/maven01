package com.neuedu.dto;

import java.sql.Date;

public class UgorderDTO {
    Integer oid ;
    String oNum;
    Integer uid;
    Integer gid;
    String  gnum;
    Date ocreatedate;
    String condition;

    @Override
    public String toString() {
        return "UgorderDTO{" +
                "oid=" + oid +
                ", oNum='" + oNum + '\'' +
                ", uid=" + uid +
                ", gid=" + gid +
                ", gnum='" + gnum + '\'' +
                ", ocreatedate=" + ocreatedate +
                ", condition='" + condition + '\'' +
                '}';
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getoNum() {
        return oNum;
    }

    public void setoNum(String oNum) {
        this.oNum = oNum;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGnum() {
        return gnum;
    }

    public void setGnum(String gnum) {
        this.gnum = gnum;
    }

    public Date getOcreatedate() {
        return ocreatedate;
    }

    public void setOcreatedate(Date ocreatedate) {
        this.ocreatedate = ocreatedate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
