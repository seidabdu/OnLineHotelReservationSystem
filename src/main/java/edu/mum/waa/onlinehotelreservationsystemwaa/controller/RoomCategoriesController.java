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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.RoomCatagoryService;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.processOrder;
import java.io.PrintStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomCategoriesController {
    @Autowired
    processOrder po;
    @Autowired
    private RoomCatagoryService categoryService;

    @RequestMapping(value={"/RoomCatagories"})
    public String showCatagories(Model model) {
        List categories =categoryService.getAllRoomCatagory();
        System.out.println(((RoomCatagory)categories.get(0)).getDiscription());
        model.addAttribute("test", categories);
        return "RoomCatagories";
    }

    @RequestMapping(value={"/RoomCatagories/{categoryId}"})
    public String show(HttpServletRequest request, @RequestParam(value="id") String categoryId) {
        RoomCatagory category =categoryService.getRoomCatagoryById(categoryId);
        System.out.println(category.getCatagoryId());
        request.getSession().setAttribute("category", (Object)category);
        return "category";
    }
}