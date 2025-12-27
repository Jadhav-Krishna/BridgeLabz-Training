import java.util.*;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    // Use default, parameterized, and copy constructors to initialize bookings.
    // Default constructor
    public HotelBooking() {
        this.guestName = "John Doe";
        this.roomType = "Standard";
        this.nights = 2;
    }
    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
}