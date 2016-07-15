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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import java.io.Serializable;
import java.time.LocalDate;

public class BookingDetails implements Serializable {
    private RoomCatagory RC;
    private String catagoryId;
    private String roomNumber;
    private int price;
    private Room room;
    private String customerId;
    private String bookingNumber;
    private LocalDate checkin;
    private LocalDate checkout;
    private int totoalDays;
    private double grandTotal;

    public int getPrice() {
        return this.RC.getRoomPrice();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCheckin() {
        return this.checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return this.checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

 

    public String getCatagoryId() {
        return this.catagoryId;
    }

    public void setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId;
    }

    public RoomCatagory getRC() {
        return this.RC;
    }

    public void setRC(RoomCatagory RC) {
        this.RC = RC;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getBookingNumber() {
        return this.bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getTotoalDays() {
        return 10;
    }

    public void setTotoalDays(int totoalDays) {
        this.totoalDays = totoalDays;
    }

    public double getGrandTotal() {
        this.grandTotal = this.getTotoalDays() * this.RC.getRoomPrice();
        return this.grandTotal;
    }
}