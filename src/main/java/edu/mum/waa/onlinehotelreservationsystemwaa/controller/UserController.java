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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.User;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value={"/login"}, method={RequestMethod.GET})
    public String getLoingForm() {
        return "login";
    }

    @RequestMapping(value={"/login"}, method={RequestMethod.POST})
    public String authenticate(User user, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        if (userService.authenticate(user)) {
            request.getSession().setAttribute("user", user);
            redirectAttributes.addFlashAttribute("tagline", "Welcome to the one and only amazing webstore");
            return "redirect:/welcome";
        }
        throw new IllegalArgumentException("UserId and/or password invalid.");
    }

    @RequestMapping(value={"/logout"})
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }
}