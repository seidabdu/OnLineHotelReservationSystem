/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.repository;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import java.util.List;

public interface RoomCatagoryRepository {
    public RoomCatagory getRoomCatagoryById(String var1);

    public List<RoomCatagory> getAllCatagoryList();
}