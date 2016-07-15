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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.BookingDetails;

public interface BookingService {
    public BookingDetails create(BookingDetails var1);

    public BookingDetails read(String var1);

    public void update(String var1, BookingDetails var2);

    public void delete(String var1);

    public BookingDetails getSample();

    public void addBooking(BookingDetails var1);
}