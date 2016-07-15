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
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.BookingDetails;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.BookingRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public BookingDetails create(BookingDetails booking) {
        return this.bookingRepository.create(booking);
    }

    public BookingDetails read(String bookingNumber) {
        return this.bookingRepository.getBookingByBookingNumber(bookingNumber);
    }

    public void update(String bookingNumber, BookingDetails booking) {
        this.bookingRepository.update(bookingNumber, booking);
    }

    public void delete(String bookingNumber) {
        this.bookingRepository.delete(bookingNumber);
    }

    public BookingDetails getSample() {
        return this.bookingRepository.getSample();
    }

    public void addBooking(BookingDetails bds) {
        this.bookingRepository.addBooking(bds);
    }
}