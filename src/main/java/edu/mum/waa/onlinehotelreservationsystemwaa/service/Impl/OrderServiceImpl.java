/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.service.Impl;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.BookingDetails;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.freeRooms;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.BookingRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.RoomCatagoryRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.RoomRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.processOrder;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements processOrder {
    @Autowired
    RoomCatagoryRepository RCR;
    @Autowired
    RoomRepository rp;
    @Autowired
    BookingRepository br;

    public void processBookingOrder(String roomnumber, String Catagory, LocalDate checkin, LocalDate checkout) {
        RoomCatagory rc = this.RCR.getRoomCatagoryById(Catagory);
        Room room = this.rp.getRoomByRoomNumber(roomnumber);
        BookingDetails bds = new BookingDetails();
        bds.setRoom(room);
        bds.setRC(rc);
        if (room != null) {
            if (this.rp.checkRoom(roomnumber)) {
                this.rp.reserveRoom(roomnumber);
                this.br.create(bds);
            } else {
                throw new IllegalArgumentException(String.format("Order Room Avaialability is greater than or equal to availabe quantity %d", new Object[0]));
            }
        }
    }

    public freeRooms getFreeRoomsByCatagoryId(String id) {
        freeRooms frs = new freeRooms();
        frs.setFrooms(this.rp.getFreeRoomByCatagory(id));
        return frs;
    }

    public Room getRoomById(String id) {
        return this.rp.getRoomByRoomNumber(id);
    }

    public void processRoom(String id) {
        this.rp.getRoomByRoomNumber(id).setIsBooked(true);
    }

    public void freeRoom(String id) {
        this.rp.freeRoom(id);
    }
}