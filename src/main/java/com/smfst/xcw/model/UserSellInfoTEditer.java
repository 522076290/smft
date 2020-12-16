package com.smfst.xcw.model;

public class UserSellInfoTEditer {



    private int id;
    private int userWorkId;
    private int carId;
    private int gold;
    private int time;
    private int num;
    private String carName;


    @Override
    public String toString() {
        return "UserSellInfoTEditer{" +
                "id=" + id +
                ", userWorkId=" + userWorkId +
                ", carId=" + carId +
                ", gold=" + gold +
                ", time=" + time +
                ", num=" + num +
                ", carName='" + carName + '\'' +
                '}';
    }

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

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
