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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    public String bookingNum = "BN" + (int)(Math.random() * 20.0) + 1;

    @RequestMapping(value={"/"})
    public String start() {
        return "redirect:/welcome";
    }

    @RequestMapping(value={"/welcome"})
    public String welcome(HttpServletRequest request) {
        request.getSession().setAttribute("bookingNumber", "BN001");
        return "welcome";
    }

    @RequestMapping(value={"/proceedBooking"})
    public String getproceed() {
        return "proceedBooking";
    }
}