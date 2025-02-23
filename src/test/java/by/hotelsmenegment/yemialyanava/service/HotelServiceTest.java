package by.hotelsmenegment.yemialyanava.service;

import by.hotelsmenegment.yemialyanava.models.Hotel;
import by.hotelsmenegment.yemialyanava.repository.HotelRepository;
import by.hotelsmenegment.yemialyanava.service.utils.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.verification.Times;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HotelServiceTest extends TestUtils {
    @Mock
    private HotelRepository hotelRepository;

    @InjectMocks
    private HotelService hotelService;

    @Test
    void findAll_then_return() {
        Hotel testHotel1 = buildHotel(1, "DoubleTree by Hilton Minsk", "The DoubleTree by Hilton Hotel Minsk offers 193 luxurious rooms in the Belorussian capital and stunning views of Minsk city from the hotel's 20th floor ...", "Hilton", null, null, null, Collections.emptyList());
        Hotel testHotel2 = buildHotel(1, "Once", "The DoubleTree by Hilton Hotel Minsk offers 193 luxurious rooms in the Belorussian capital and stunning views of Minsk city from the hotel's 20th floor ...", "Hilton", null, null, null, Collections.emptyList());
        List<Hotel> hotelList = new ArrayList<>(Arrays.asList(testHotel1,testHotel2));

        when(hotelRepository.findAll()).thenReturn(hotelList);

        List<Hotel> actual = hotelService.findAll();
        assertEquals(hotelList, actual);
        verify(hotelRepository, new Times(1)).findAll();
    }

    @Test
    void findAll_then_return_NullPointerException() {

        when(hotelRepository.findAll()).thenThrow(new NullPointerException());

        assertThrows(NullPointerException.class, () -> hotelService.findAll());

        verify(hotelRepository, new Times(1)).findAll();
    }

    @Test
    void findById_then_return_object() {
        Hotel testHotel = buildHotel(1, "DoubleTree by Hilton Minsk", "The DoubleTree by Hilton Hotel Minsk offers 193 luxurious rooms in the Belorussian capital and stunning views of Minsk city from the hotel's 20th floor ...", "Hilton", null, null, null, Collections.emptyList());
        Integer id = testHotel.getId();
        when(hotelRepository.findById(
                eq(id)
        )).thenReturn(Optional.of(testHotel));

        Hotel actual = hotelService.findById(id);

        Assertions.assertEquals(testHotel, actual);

        verify(hotelRepository, new Times(1)).findById(
              eq(id)
        );
    }

    @Test
    void findById_then_trows_NoSuchElementException() {
        Random random = new Random();
        Integer id = random.nextInt(Integer.MAX_VALUE);
        String answer = String.format("Hotel with number: %s not found", id);
        when(hotelRepository.findById(
                eq(id)
        )).thenThrow(new NoSuchElementException(answer){

        });

        assertThrows(NoSuchElementException.class, () -> hotelService.findById(id));

        verify(hotelRepository, new Times(1)).findById(
                eq(id)
        );
    }

    @Test
    void findAllByKeywordIgnoreCase() {
        Hotel testHotel = buildHotel(1, "DoubleTree by Hilton Minsk", "The DoubleTree by Hilton Hotel Minsk offers 193 luxurious rooms in the Belorussian capital and stunning views of Minsk city from the hotel's 20th floor ...", "Hilton", null, null, null, Arrays.asList("Free WiFi", "Swimming Pool"));
        List<Hotel> hotelList = Collections.singletonList(testHotel);

        when(hotelRepository.search("Test Name", "Test Brand", "Test City", "Test Country", "Free WiFi")).thenReturn(hotelList);

        List<Hotel> actual = hotelService.findAllByKeywordIgnoreCase("Test Name", "Test Brand", "Test City", "Test Country", "Free WiFi");

        Assertions.assertEquals(hotelList, actual);

        verify(hotelRepository, new Times(1)).search("Test Name", "Test Brand", "Test City", "Test Country", "Free WiFi");

    }

    @Test
    void create() {
        Hotel testHotel = buildHotel(1, "DoubleTree by Hilton Minsk", "The DoubleTree by Hilton Hotel Minsk offers 193 luxurious rooms in the Belorussian capital and stunning views of Minsk city from the hotel's 20th floor ...", "Hilton", null, null, null, Collections.emptyList());

        when(hotelRepository.save(testHotel)).thenReturn(testHotel);

        Hotel actual = hotelService.create(testHotel);

        Assertions.assertEquals(testHotel, actual);
        verify(hotelRepository, new Times(1)).save(
                eq(testHotel)
        );

    }

    @Test
    void addAmenities() {
        Hotel testHotel = buildHotel(1, "DoubleTree by Hilton Minsk", "The DoubleTree by Hilton Hotel Minsk offers 193 luxurious rooms in the Belorussian capital and stunning views of Minsk city from the hotel's 20th floor ...", "Hilton", null, null, null, Collections.emptyList());
        Integer id = testHotel.getId();
        List<String> amenities = Arrays.asList("Free parking",
                "Free WiFi",
                "Non-smoking rooms",
                "Concierge",
                "On-site restaurant",
                "Fitness center",
                "Pet-friendly rooms",
                "Room service",
                "Business center",
                "Meeting rooms");

        when(hotelRepository.findById(
                eq(id)
        )).thenReturn(Optional.of(testHotel));

        hotelService.addAmenities(id, amenities);

        Assertions.assertEquals(testHotel.getAmenities(), amenities);

        verify(hotelRepository, new Times(1)).findById(
                eq(id)
                );
    }

    @Test
    void findHistogram_by_brand() {
        List<String> listBrands = Collections.singletonList("Hilton");
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Hilton", 1);

        when(hotelRepository.countByBrand()).thenReturn(listBrands);

        Map<String, Integer> histogram = hotelService.findHistogram("brand");

        Assertions.assertEquals(testMap, histogram);

        verify(hotelRepository, new Times(1)).countByBrand();
    }

    @Test
    void findHistogram_by_country() {
        List<String> listCountry = Arrays.asList("Canada", "Canada", "Belarus");
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Canada", 2);
        testMap.put("Belarus", 1);

        when(hotelRepository.countByCountry()).thenReturn(listCountry);

        Map<String, Integer> histogram = hotelService.findHistogram("country");

        Assertions.assertEquals(testMap, histogram);

        verify(hotelRepository, new Times(1)).countByCountry();
    }
}