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
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class formbackingbean implements Serializable {
    private String catagoryId;
    @NotNull(message="{can't be empty guys becare full}")
    private String roomNumber;
    @NotNull(message="{can't be empty guys becare full}")
    @Size(min=4, max=50, message="{Size.Product.name.validation}")
    private String customerId;
    private String checkin;
    private String checkout;
    private List<String> fnames;

 public   formbackingbean(){
    
    }

    public String getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(String catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public List<String> getFnames() {
        return fnames;
    }

    public void setFnames(List<String> fnames) {
        this.fnames = fnames;
    }
 
 
   
}