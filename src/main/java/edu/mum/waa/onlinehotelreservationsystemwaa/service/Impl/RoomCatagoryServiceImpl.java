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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.RoomCatagoryRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.RoomCatagoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomCatagoryServiceImpl
implements RoomCatagoryService {
    @Autowired
    RoomCatagoryRepository rcp;

    public List<RoomCatagory> getAllRoomCatagory() {
        return this.rcp.getAllCatagoryList();
    }

    public RoomCatagory getRoomCatagoryById(String id) {
        return this.rcp.getRoomCatagoryById(id);
    }
}