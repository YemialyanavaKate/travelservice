package by.hotelsmenegment.yemialyanava.models;

public enum AmenitiesEnum {
    FREE_PARKING ("Free parking"),
    FREE_WIFI ("Free WiFi"),
    NON_SMOKING_ROOMS ("Non-smoking rooms"),
    CONCIERGE ("Concierge"),
    ON_SITE_RESTAURANT ("On-site restaurant"),
    FITNESS_CENTER ("Fitness center"),
    PET_FRIENDLY_ROOMS("Pet-friendly rooms"),
    ROOM_SERVICE ("Room service"),
    BUSINESS_CENTER ("Business center"),
    MEETING_ROOMS ("Meeting rooms");

    private String title;

    AmenitiesEnum(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
