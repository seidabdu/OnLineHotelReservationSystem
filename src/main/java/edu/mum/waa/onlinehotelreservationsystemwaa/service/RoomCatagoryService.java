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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import java.util.List;

public interface RoomCatagoryService {
    public List<RoomCatagory> getAllRoomCatagory();

    public RoomCatagory getRoomCatagoryById(String var1);
}