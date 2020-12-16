package com.smfst.xcw.model;

public class UserMaterialLog {
    private int id;
    private int userWorkId;
    private int suppierListId;
    private int num;
    private int time;
    private int gold;
    private String suppierName;
    private String partName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserWorkId() {
        return userWorkId;
    }

    public void setUserWorkId(int userWorkId) {
        this.userWorkId = userWorkId;
    }

    public int getSuppierListId() {
        return suppierListId;
    }

    public void setSuppierListId(int suppierListId) {
        this.suppierListId = suppierListId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getSuppierName() {
        return suppierName;
    }

    public void setSuppierName(String suppierName) {
        this.suppierName = suppierName;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "UserMaterialLog{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", suppierListId=" + suppierListId +
                ", num=" + num +
                ", time=" + time +
                ", gold=" + gold +
                ", suppierName='" + suppierName + '\'' +
                ", partName='" + partName + '\'' +
                '}';
    }
}
