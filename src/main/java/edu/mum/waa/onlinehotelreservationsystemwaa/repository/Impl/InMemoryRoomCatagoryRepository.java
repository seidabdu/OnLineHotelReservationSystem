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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.RoomCatagory;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.RoomCatagoryRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryRoomCatagoryRepository implements RoomCatagoryRepository {
    List<RoomCatagory> rclist = new ArrayList<RoomCatagory>();

    public InMemoryRoomCatagoryRepository() {
        RoomCatagory rc1 = new RoomCatagory("HH1");
        rc1.setCatagoryName("ECONOMY SINGLE ROOMS");
        String description = "Spacious, bright and outward facing rooms measuring 19 m2 and totally refurbished. The room comes with Dreamax bed (manufactured and designed exclusively by Flex for Meli\u00e1 Hotels International), a modern, fully equipped bathroom finished in top quality bronze coloured ceramics and an independent entrance. It also has a home automation system which automatically regulates the temperature of the room based on guest presence or absence from the room.";
        rc1.setDiscription(description);
        rc1.setRoomPrice(1000);
        RoomCatagory rc2 = new RoomCatagory("HH2");
        rc2.setCatagoryName("PREMIUM Suite  ROOM");
        String description2 = "Spacious, bright and outward facing rooms measuring 27 m2 and totally refurbished. The room comes with double bed or twin beds with Dreamax mattress (manufactured and designed exclusively by Flex for Meli\u00e1 Hotels International), a modern, fully equipped bathroom finished in top quality bronze coloured ceramics and an independent hallway-dressing area. It also has a home automation system which automatically regulates the temperature of the room based on guest presence or absence from the room. All the rooms have a magnificent hallway-dressing area, as well as a room off the bathroom, which is independent of the room as it has double doors.";
        rc2.setRoomPrice(1500);
        rc2.setDiscription(description2);
        RoomCatagory rc3 = new RoomCatagory("HH3");
        rc3.setCatagoryName("Double bed FAMILY ROOM");
        rc3.setRoomPrice(500);
        String ds3 = "Totally refurbished and all outward facing, these rooms provide a large bedroom with a double bed or twin beds and the possibility of an extra bed and cot, as well as a modern, fully equipped bathroom decorated in top quality bronze coloured ceramics. The family room has a Dreamax mattress (manufactured and designed exclusively by Flex for Meli\u00e1 Hotels International) and a home automation system which automatically regulates the temperature of the room based on guest presence or absence from the room.";
        rc3.setDiscription(ds3);
        this.rclist.add(rc1);
        this.rclist.add(rc2);
        this.rclist.add(rc3);
    }

    public List<RoomCatagory> getRclist() {
        return this.rclist;
    }

    public void setRclist(List<RoomCatagory> rclist) {
        this.rclist = rclist;
    }

    public List<RoomCatagory> getAllCatagoryList() {
        return this.rclist;
    }

    public RoomCatagory getRoomCatagoryById(String roomCatagoryId) {
        for (RoomCatagory r : this.rclist) {
            if (!r.getCatagoryId().equals(roomCatagoryId)) continue;
            return r;
        }
        return this.rclist.get(0);
    }
}