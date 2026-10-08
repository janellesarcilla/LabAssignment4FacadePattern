package FacadeDesign;

public class FrontDesk {
    private Valet valet;
    private Cart cart;
    private HouseKeeping houseKeeping;
    
    public FrontDesk () {
        this.valet = new Valet();
        this.cart = new Cart();
        this.houseKeeping = new HouseKeeping();
    }
    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}


