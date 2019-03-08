package com.martinlizardo.reservations.hotel.data.repository;

import com.martinlizardo.reservations.hotel.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(String number);
}
