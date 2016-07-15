/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.repository.Impl;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.BookingDetails;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.BookingRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.Impl.InMemoryRoomCatagoryRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.Impl.InMemoryRoomRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryBookingRepository implements BookingRepository {
    Map<String, BookingDetails> bdetails = new HashMap<String, BookingDetails>();
    InMemoryRoomCatagoryRepository imrcr = new InMemoryRoomCatagoryRepository();
    InMemoryRoomRepository imrr = new InMemoryRoomRepository();

    public Map<String, BookingDetails> getBdetails() {
        return this.bdetails;
    }

    public void setBdetails(Map<String, BookingDetails> bdetails) {
        this.bdetails = bdetails;
    }

    public List<BookingDetails> getBookingList() {
        ArrayList<BookingDetails> bookinglist = new ArrayList<BookingDetails>();
        Set<String> keys = this.bdetails.keySet();
        for (String booking : keys) {
            bookinglist.add(this.bdetails.get(booking));
        }
        return bookinglist;
    }

    public BookingDetails getBookingByBookingNumber(String bookingNumber) {
        return this.bdetails.get(bookingNumber);
    }

    public BookingDetails create(BookingDetails bds) {
        if (this.bdetails.containsKey(bds.getBookingNumber())) {
            return bds;
        }
        this.bdetails.put(bds.getBookingNumber(), bds);
        return bds;
    }

    public void update(String bookingNumber, BookingDetails updatedBdetails) {
        if (!this.bdetails.containsKey(bookingNumber)) {
            this.bdetails.put(bookingNumber, updatedBdetails);
        }
    }

    public void delete(String bookingNumber) {
        this.bdetails.clear();
    }

    public BookingDetails getSample() {
        BookingDetails bds = new BookingDetails();
        bds.setBookingNumber("BN001");
        bds.setRC(this.imrcr.getRoomCatagoryById("HH1"));
        bds.setRoom(this.imrr.getRoomByRoomNumber("R002"));
        return bds;
    }

    public void addBooking(BookingDetails bds) {
        this.bdetails.put(bds.getBookingNumber(), bds);
    }
}