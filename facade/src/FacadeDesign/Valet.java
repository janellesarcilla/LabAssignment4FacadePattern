package FacadeDesign;

public class Valet implements HotelService {
    private String plateNumber;

    public void pickUpVehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        hotelServices();
    }

    @Override 
    public void hotelServices() {
        System.out.println("Valet service requested to pick up vehicle with plate number: " + plateNumber);
    }
    
}
