/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.repository.Impl;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.RoomRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryRoomRepository implements RoomRepository {
    public Map<String, Room> roomList = new HashMap<String, Room>();

    public InMemoryRoomRepository() {
        RoomCatagory rc1 = new RoomCatagory("HH1");
        rc1.setCatagoryName("ECONOMY SINGLE ROOMS");
        rc1.setRoomPrice(1500);
        RoomCatagory rc2 = new RoomCatagory("HH2");
        rc2.setCatagoryName("PREMIUM Suite  ROOM");
        rc2.setRoomPrice(3000);
        RoomCatagory rc3 = new RoomCatagory("HH3");
        rc2.setCatagoryName("Double bed FAMILY ROOM");
        rc2.setRoomPrice(2000);
        Room r1 = new Room("R002", 1);
        r1.setCatagory(rc1);
        Room r2 = new Room("R003", 1);
        r2.setCatagory(rc1);
        Room r3 = new Room("R004", 2);
        r3.setCatagory(rc2);
        Room r4 = new Room("R005", 2);
        r4.setCatagory(rc2);
        Room r5 = new Room("R006", 3);
        r5.setCatagory(rc3);
        Room r6 = new Room("R007", 3);
        r6.setCatagory(rc3);
        roomList.put(r1.getRoomNumber(), r1);
        roomList.put(r2.getRoomNumber(), r2);
        roomList.put(r3.getRoomNumber(), r3);
        roomList.put(r4.getRoomNumber(), r4);
        roomList.put(r5.getRoomNumber(), r5);
        roomList.put(r6.getRoomNumber(), r6);
    }

    @Override
    public List<Room> getRoomList() {
        ArrayList<Room> rlist = new ArrayList<Room>();
        Set<String> keys = this.roomList.keySet();
        for (String k : keys) {
            rlist.add(this.roomList.get(k));
        }
        return rlist;
    }

    @Override
    public Room getRoomByRoomNumber(String roomNumber) {
        return this.roomList.get(roomNumber);
    }

    @Override
    public boolean checkRoom(String roonNumber) {
        Room room = this.roomList.get(roonNumber);
        if (room.isIsBooked()) {
            return true;
        }
        return false;
    }

    @Override
    public void freeRoom(String roonNumber) {
        Room room = this.roomList.get(roonNumber);
        room.setIsBooked(false);
    }

    @Override
    public void reserveRoom(String roonNumber) {
        Room room = this.roomList.get(roonNumber);
        room.setIsBooked(true);
    }

    @Override
    public void addRoom(Room room) {
        this.roomList.put(room.getRoomNumber(), room);
    }

    @Override
    public List<Room> getFreeRoomByCatagory(String cname) {
        ArrayList<Room> resultroom = new ArrayList<Room>();
        Set<String> keys =roomList.keySet();
        for (String key : keys) {
            if (!roomList.get(key).getCatagory().getCatagoryId().equals(cname) || this.checkRoom(this.roomList.get(key).getRoomNumber())) continue;
            resultroom.add(roomList.get(key));
        }
        return resultroom;
    }
}