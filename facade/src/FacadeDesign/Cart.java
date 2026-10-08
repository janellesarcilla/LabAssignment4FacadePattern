package FacadeDesign;

public class Cart implements HotelService {
    private int numOfCarts;

    public void requestCart(int numOfCarts) {
        this.numOfCarts = numOfCarts;
        hotelServices();
    }

    @Override 
    public void hotelServices(){
        System.out.println("Cart service requested for " + numOfCarts + " carts.");
    }
   
    }
    
