package interfaces;

public class House {
    private int occupants;
    private FoodProvider favouriteRestaurant;

    public House(int occupants, FoodProvider favouriteRestaurant) {
        this.occupants = occupants;
        this.favouriteRestaurant = favouriteRestaurant;
    }

    public void changeFavouriteRestaurant(FoodProvider foodProvider){
        this.favouriteRestaurant = foodProvider;
    }

    public void orderFood() {
        for (int i = 0; i < occupants; i++) {
            System.out.println(favouriteRestaurant.deliverFood());
        }
    }
}
