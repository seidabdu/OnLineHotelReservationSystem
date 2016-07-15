/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.service;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.freeRooms;
import java.time.LocalDate;

public interface processOrder {
    public void processBookingOrder(String var1, String var2, LocalDate var3, LocalDate var4);

    public freeRooms getFreeRoomsByCatagoryId(String var1);

    public Room getRoomById(String var1);

    public void processRoom(String var1);

    public void freeRoom(String var1);
}