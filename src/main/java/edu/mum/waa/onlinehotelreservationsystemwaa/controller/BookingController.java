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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.formbackingbean;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.freeRooms;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.BookingService;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.RoomCatagoryService;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.processOrder;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/Booking"})
public class BookingController {
    @Autowired
    BookingService bs;
    @Autowired
    RoomCatagoryService rcs;
    @Autowired
    processOrder or;

    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        binder.setAllowedFields(new String[]{"catagoryId", "roomNumber", "customerId", "checkin", "checkout"});
    }

    @RequestMapping
    public String get(HttpServletRequest request) {
        return "redirect:/Booking/BN001";
    }

    @RequestMapping(value={"/{cartId}"}, method={RequestMethod.GET})
    public String getCart(@PathVariable(value="cartId") String cartId, Model model) {
        model.addAttribute("cartId", (Object)cartId);
        return "Bookings";
    }

    @RequestMapping(value={"/add"}, method={RequestMethod.GET})
    public String getBookingPag(HttpServletRequest request, Model model) {
        formbackingbean newBookingDetail = new formbackingbean();
        RoomCatagory selectedRc = (RoomCatagory)request.getSession().getAttribute("category");
        newBookingDetail.setCatagoryId(selectedRc.getCatagoryId());
        freeRooms freerooms = this.or.getFreeRoomsByCatagoryId(selectedRc.getCatagoryId());
        ArrayList<String> froom = new ArrayList<String>();
        for (Room r : freerooms.getFrooms()) {
            System.out.println(r.getRoomNumber());
            froom.add(r.getRoomNumber());
        }
        newBookingDetail.setFnames(froom);
        model.addAttribute("newBooking", (Object)newBookingDetail);
        return "addBooking";
    }

    @RequestMapping(value={"/add"}, method={RequestMethod.POST})
    public String addBooking(@ModelAttribute(value="newBooking") @Valid formbackingbean bdetails, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "addBooking";
        }
        System.out.println(bdetails.getCheckout());
        BookingDetails bds = new BookingDetails();
        bds.setRoomNumber(bdetails.getRoomNumber());
        bds.setCatagoryId(bdetails.getCatagoryId());
        bds.setCustomerId(bdetails.getCustomerId());
        bds.setBookingNumber("BN001");
        LocalDate checkin = LocalDate.parse(bdetails.getCheckin());
        LocalDate checkout = LocalDate.parse(bdetails.getCheckout());
        System.out.println(checkin);
        bds.setRoom(this.or.getRoomById(bdetails.getRoomNumber()));
        bds.setCheckin(checkin);
        bds.setCheckout(checkout);
        RoomCatagory r = this.rcs.getRoomCatagoryById(bdetails.getCatagoryId());
        bds.setRC(r);
        request.getSession().setAttribute("formdata", (Object)bds);
        return "redirect:/proceedBooking";
    }

    @RequestMapping(value={"/confirm"}, method={RequestMethod.GET})
    public String Confirm(HttpServletRequest request) {
        BookingDetails bds = (BookingDetails)request.getSession().getAttribute("formdata");
        this.or.processRoom(bds.getRoomNumber());
        this.bs.addBooking(bds);
        request.getSession().setAttribute("confirm", (Object)bds);
        return "redirect:/Booking";
    }
}