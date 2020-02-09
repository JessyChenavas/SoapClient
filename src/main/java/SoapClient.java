package main.java;

import main.webapp.services.HotelService;
import main.webapp.services.HotelServiceService;
import main.webapp.services.Room;

import java.util.List;

public class SoapClient {

    public static void main(String[] args) {
        HotelService hotelService = (new HotelServiceService()).getHotelServicePort();

        List<Room> rooms = hotelService.getRooms();
        System.out.println(rooms.get(0).getId());
        System.out.println(rooms.get(0).getPrice());
        System.out.println(rooms.get(0).getDate());
    }
}
