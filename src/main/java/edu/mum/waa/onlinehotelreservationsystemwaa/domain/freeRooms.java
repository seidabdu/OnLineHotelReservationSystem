/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.domain;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.Room;
import java.util.ArrayList;
import java.util.List;

public class freeRooms {
    List<Room> frooms = new ArrayList<Room>();

    
       public freeRooms(){
       
       }

    public List<Room> getFrooms() {
        return frooms;
    }

    public void setFrooms(List<Room> frooms) {
        this.frooms = frooms;
    }
   

    void addRoom(Room r) {
        frooms.add(r);
    }
}