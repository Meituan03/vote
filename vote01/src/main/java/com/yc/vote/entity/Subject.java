package com.yc.vote.entity;

public class Subject {
    private int vsid;

    private String vstitle;

    private Integer vstype;

    public int getVsid() {
        return vsid;
    }

    public void setVsid(int vsid) {
        this.vsid = vsid;
    }

    public String getVstitle() {
        return vstitle;
    }

    public void setVstitle(String vstitle) {
        this.vstitle = vstitle == null ? null : vstitle.trim();
    }

    public Integer getVstype() {
        return vstype;
    }

    public void setVstype(Integer vstype) {
        this.vstype = vstype;
    }
}