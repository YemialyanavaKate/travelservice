package by.hotelsmenegment.yemialyanava.repository;

import by.hotelsmenegment.yemialyanava.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    @Query("SELECT h FROM Hotel h JOIN h.address a WHERE " +
            "(:name IS NULL OR LOWER(h.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
            "(:brand IS NULL OR LOWER(h.brand) LIKE LOWER(CONCAT('%', :brand, '%'))) AND " +
            "(:city IS NULL OR LOWER(a.city) LIKE LOWER(CONCAT('%', :city, '%'))) AND " +
            "(:country IS NULL OR LOWER(a.country) LIKE LOWER(CONCAT('%', :country, '%'))) AND " +
            "(:amenities IS NULL OR :amenities MEMBER OF h.amenities)")
    List<Hotel> search(@Param("name") String name,
                       @Param("brand") String brand,
                       @Param("city") String city,
                       @Param("country") String country,
                       @Param("amenities") String amenities);

    @Query("SELECT h.brand FROM Hotel h")
    List<String> countByBrand();

    @Query("SELECT a.city FROM Hotel h JOIN h.address a")
    List<String> countByCity();

    @Query("SELECT a.country FROM Hotel h JOIN h.address a")
    List<String> countByCountry();

    @Query("SELECT amenities FROM Hotel")
    List<String> countByAmenities();
}
