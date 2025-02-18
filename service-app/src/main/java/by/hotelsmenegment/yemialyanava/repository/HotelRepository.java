package by.hotelsmenegment.yemialyanava.repository;

import by.hotelsmenegment.yemialyanava.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
