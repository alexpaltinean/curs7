package interfaces;

public class Main {
    public static void main(String[] args) {
//        KFC kfc = new KFC();
//        System.out.println(kfc.getDeliveredQuantity());
//        System.out.println(kfc.deliverFood());
//        System.out.println(kfc.deliverFood());
//        System.out.println(kfc.deliverFood());
//        System.out.println(kfc.deliverFood());
//        System.out.println(kfc.deliverFood());
//        System.out.println(kfc.getDeliveredQuantity());
//        kfc.resetMonth();
//        System.out.println(kfc.getDeliveredQuantity());
//        System.out.println("1. No of empl: "+kfc.getNumberOfEmployees());
//        kfc.hire("Ana");
//        System.out.println("2. No of empl: "+kfc.getNumberOfEmployees());
//
//        Company c = kfc;
//        c.hire("Alex");
//        System.out.println("3. No of empl: " + c.getNumberOfEmployees());
//        System.out.println("4. No of empl: " + kfc.getNumberOfEmployees());
//
//        FoodProvider foodProvider = kfc;
//        System.out.println(foodProvider.deliverFood());
//        System.out.println(foodProvider.getDeliveredQuantity());
//        System.out.println(kfc.getDeliveredQuantity());
//
//        Company c2 = new KFC();

//        House myHouse = new House(5, new KFC());
//
//        myHouse.orderFood();
//        myHouse.changeFavouriteRestaurant(new McDonalds());
//        // change of mind
//        myHouse.orderFood();

        KFC first = new KFC();
        KFC second = new KFC();

        System.out.println(KFC.getNumberOfRestaurants());
        KFC.numberOfRestaurants++;
        KFC.numberOfRestaurants++;

        System.out.println(KFC.numberOfRestaurants);
    }
}
