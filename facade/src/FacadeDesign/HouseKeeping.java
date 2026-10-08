package FacadeDesign;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public void cleanRoom (int roomNumber) { 
        this.roomNumber = roomNumber;
        hotelServices();
    }
    @Override 
    public void hotelServices() {
        System.out.println("Housekeeping service requested for room " + roomNumber);
    }
    
}
