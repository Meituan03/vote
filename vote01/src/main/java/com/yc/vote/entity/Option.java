package com.yc.vote.entity;

public class Option {
    private int voId;

    private String vooption;

    private int voorder;

    public int getVoid() {
        return voId;
    }

    public void setVoid(int voId) {
        this.voId = voId;
    }

    public String getVooption() {
        return vooption;
    }

    public void setVooption(String vooption) {
        this.vooption = vooption == null ? null : vooption.trim();
    }


    public int getVoorder() {
        return voorder;
    }

    public void setVoorder(int voorder) {
        this.voorder = voorder;
    }

	@Override
	public String toString() {
		return "\nOption [voId=" + voId + ", vooption=" + vooption + ", voorder="
				+ voorder + "]";
	}
    
}
