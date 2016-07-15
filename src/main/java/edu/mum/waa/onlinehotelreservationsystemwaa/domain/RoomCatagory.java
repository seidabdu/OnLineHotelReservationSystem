/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.domain;

/**
 *
 * @author seidabdu
 */
import java.io.Serializable;

public class RoomCatagory
implements Serializable {
    private String catagoryId;
    private int roomPrice;
    private String catagoryName;
    private String discription;

    public RoomCatagory(String catagoryId) {
        this.catagoryId = catagoryId;
    }

    public RoomCatagory() {
    }

    public String getCatagoryId() {
        return this.catagoryId;
    }

    public void setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId;
    }

    public int getRoomPrice() {
        return this.roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getCatagoryName() {
        return this.catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }

    public String getDiscription() {
        return this.discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}