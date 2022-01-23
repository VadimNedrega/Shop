package com.example.PeEx.shop.controller.booking;

import com.example.PeEx.shop.controller.exception.BookingNotFoundException;
import com.example.PeEx.shop.controller.exception.CategoryNotFoundException;
import com.example.PeEx.shop.domain.Booking;
import com.example.PeEx.shop.domain.Category;
import com.example.PeEx.shop.repository.BookingRepository;
import com.example.PeEx.shop.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {
    private final BookingRepository repository;

    public BookingController(BookingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/bookings")
    List<Booking> all() {
        return repository.findAll();
    }

    @PostMapping("/bookings")
    Booking newCategory(@RequestBody Booking newBooking){
        return repository.save(newBooking);
    }

    @GetMapping("/bookings/{id}")
    Booking one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()-> new BookingNotFoundException(id));
    }

    @PutMapping("/bookings/{id}")
    Booking replaceClient(@RequestBody Booking newBooking, @PathVariable Long id) {

        return repository.findById(id)
                .map(booking -> {
                    booking.setClient(newBooking.getClient());
                    booking.setCreated(newBooking.getCreated());
                    booking.setUpdated(newBooking.getUpdated());
                    booking.setSum(newBooking.getSum());
                    booking.setStatus(newBooking.getStatus());
                    booking.setProductList(newBooking.getProductList());
                    return repository.save(booking);
                })
                .orElseGet(() -> {
                    newBooking.setId(id);
                    return repository.save(newBooking);
                });
    }

    @DeleteMapping("/bookings/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
