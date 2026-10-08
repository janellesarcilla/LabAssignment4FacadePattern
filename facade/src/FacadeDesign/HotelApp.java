package FacadeDesign;

public class HotelApp {
    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();
        frontDesk.pickUpVehicle("ABC-1234");
        frontDesk.cleanRoom(205);
        frontDesk.requestCart(2);
    }
}
