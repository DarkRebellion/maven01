package com.neuedu.bean;

import java.sql.Date;
//订单

public class Ugorder {
    Integer oid ;
    String oNum;
    Integer uid;
    Integer gid;
    String  gnum;
    Date ocreatedate;
    Boolean oifpay;
    Date paydate;//付款
    Boolean oifdelivery;
    Date deliverydate;//发货
    Boolean oiffinish;
    Date finishdate;//完成
    Boolean oifreturnorder;//取消情况
    Boolean oifreturn;// 退货情况
    Boolean oifmoney;//退款情况
    Date oifreturndate;//退款时间

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

    public Boolean getOifpay() {
        return oifpay;
    }

    public void setOifpay(Boolean oifpay) {
        this.oifpay = oifpay;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Boolean getOifdelivery() {
        return oifdelivery;
    }

    public void setOifdelivery(Boolean oifdelivery) {
        this.oifdelivery = oifdelivery;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Boolean getOiffinish() {
        return oiffinish;
    }

    public void setOiffinish(Boolean oiffinish) {
        this.oiffinish = oiffinish;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public Boolean getOifreturnorder() {
        return oifreturnorder;
    }

    public void setOifreturnorder(Boolean oifreturnorder) {
        this.oifreturnorder = oifreturnorder;
    }

    public Boolean getOifmoney() {
        return oifmoney;
    }

    public void setOifmoney(Boolean oifmoney) {
        this.oifmoney = oifmoney;
    }

    public Boolean getOifreturn() {
        return oifreturn;
    }

    public void setOifreturn(Boolean oifreturn) {
        this.oifreturn = oifreturn;
    }

    public Date getOifreturndate() {
        return oifreturndate;
    }

    public void setOifreturndate(Date oifreturndate) {
        this.oifreturndate = oifreturndate;
    }

    @Override
    public String toString() {
        return "Ugorder{" +
                "oid=" + oid +
                ", oNum='" + oNum + '\'' +
                ", uid=" + uid +
                ", gid=" + gid +
                ", gnum='" + gnum + '\'' +
                ", ocreatedate=" + ocreatedate +
                ", oifpay=" + oifpay +
                ", paydate=" + paydate +
                ", oifdelivery=" + oifdelivery +
                ", deliverydate=" + deliverydate +
                ", oiffinish=" + oiffinish +
                ", finishdate=" + finishdate +
                ", oifreturnorder=" + oifreturnorder +
                ", oifreturn=" + oifreturn +
                ", oifmoney=" + oifmoney +
                ", oifreturndate=" + oifreturndate +
                '}';
    }
}
