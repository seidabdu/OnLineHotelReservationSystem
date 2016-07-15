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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;

public class Room {
    private String roomNumber;
    private RoomCatagory catagory;
    private int floor;
    private boolean isBooked = false;

    public Room(String RN, int fnum) {
        this.roomNumber = RN;
        this.floor = fnum;
    }

    public Room() {
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomCatagory getCatagory() {
        return this.catagory;
    }

    public void setCatagory(RoomCatagory catagory) {
        this.catagory = catagory;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isIsBooked() {
        return this.isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
}