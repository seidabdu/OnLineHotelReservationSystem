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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import java.util.List;

public interface RoomRepository {
    public List<Room> getRoomList();

    public Room getRoomByRoomNumber(String var1);

    public boolean checkRoom(String var1);

    public void freeRoom(String var1);

    public void reserveRoom(String var1);

    public void addRoom(Room var1);

    public List<Room> getFreeRoomByCatagory(String var1);
}