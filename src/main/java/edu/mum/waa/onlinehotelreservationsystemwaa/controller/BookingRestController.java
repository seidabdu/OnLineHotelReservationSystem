/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.controller;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.BookingDetails;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.freeRooms;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.BookingService;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.processOrder;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value={"rest/booking"})
public class BookingRestController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private processOrder pr;

    @RequestMapping(method={RequestMethod.POST})
    @ResponseBody
    public BookingDetails create(@RequestBody BookingDetails booking) {
        return this.bookingService.create(booking);
    }

    @RequestMapping(value={"/{BookingNumber}"}, method={RequestMethod.GET})
    @ResponseBody
    public BookingDetails read(@PathVariable(value="BookingNumber") String bookingNumber) {
        return this.bookingService.read(bookingNumber);
    }

    @RequestMapping(value={"/freeRooms/{catagoryId}"}, method={RequestMethod.GET})
    @ResponseBody
    public freeRooms readRooms(@PathVariable(value="catagoryId") String catagoryId) {
        return pr.getFreeRoomsByCatagoryId(catagoryId);
    }

    @RequestMapping(value={"/{BookingNumber}"}, method={RequestMethod.PUT})
    @ResponseStatus(value=HttpStatus.NO_CONTENT)
    public void update(@PathVariable(value="BookingNumber") String bookingNumber, @RequestBody BookingDetails booking) {
        bookingService.update(bookingNumber, booking);
    }

    @RequestMapping(value={"/{bookingNumber}"}, method={RequestMethod.DELETE})
    @ResponseStatus(value=HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value="bookingNumber") String bookingNumber) {
        bookingService.delete(bookingNumber);
    }

    @RequestMapping(value={"/add/{productId}"}, method={RequestMethod.PUT})
    @ResponseStatus(value=HttpStatus.NO_CONTENT)
    public void addIItem(@PathVariable String productId, HttpServletRequest request) {
        BookingDetails bds =bookingService.getSample();
        bookingService.update(bds.getBookingNumber(), bds);
    }

    @RequestMapping(value={"/remove/{boookingNumber}"}, method={RequestMethod.PUT})
    @ResponseStatus(value=HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String boookingNumber, HttpServletRequest request) {
        BookingDetails bookingdetailcart =bookingService.read("BN001");
        pr.freeRoom(bookingdetailcart.getRoom().getRoomNumber());
        bookingService.delete(boookingNumber);
    }
}