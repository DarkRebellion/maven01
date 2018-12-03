package com.neuedu.bean;
import java.sql.Date;

public class User{
    int uid;
    String unum;
    String upwd;
    int ucondition;//状态
    int uauthority;//权限
    String uname;
    boolean usex;
    Date ubirthday;
    String receiver;
    String raddres;
    String rtelephone;
    String raids;


    public String getRaddres() {
        return raddres;
    }

    public void setRaddres(String raddres) {
        this.raddres = raddres;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", unum='" + unum + '\'' +
                ", upwd='" + upwd + '\'' +
                ", ucondition=" + ucondition +
                ", uauthority=" + uauthority +
                ", uname='" + uname + '\'' +
                ", usex=" + usex +
                ", ubirthday=" + ubirthday +
                ", receiver='" + receiver + '\'' +
                ", raddres='" + raddres + '\'' +
                ", rtelephone='" + rtelephone + '\'' +
                ", raids='" + raids + '\'' +
                ", raids='" + raids + '\'' +
                '}';
    }

    public String getRaids() {
        return raids;
    }

    public void setRaids(String raids) {
        this.raids = raids;
    }



    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUnum() {
        return unum;
    }

    public void setUnum(String unum) {
        this.unum = unum;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public int getUcondition() {
        return ucondition;
    }

    public void setUcondition(int ucondition) {
        this.ucondition = ucondition;
    }

    public int getUauthority() {
        return uauthority;
    }

    public void setUauthority(int uauthority) {
        this.uauthority = uauthority;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public boolean isUsex() {
        return usex;
    }

    public void setUsex(boolean usex) {
        this.usex = usex;
    }

    public Date getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getRadders() {
        return raddres;
    }

    public void setRadders(String radders) {
        this.raddres = radders;
    }

    public String getRtelephone() {
        return rtelephone;
    }

    public void setRtelephone(String rtelephone) {
        this.rtelephone = rtelephone;
    }

}
