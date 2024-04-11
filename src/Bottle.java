public class Bottle {
    private int totalCapacity;
    private double availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = totalCapacity * 0.8;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean isOpen() {
        // extra step
        return open;
    }

    public boolean hasLiquid() {
        return availableLiquid > 0;
    }

    public String open() {
        if (isOpen()) {
            return "Already opened";
        } else {
            this.open = true;
            return "Opened";
        }
    }

    public String drink(double amount) {
        if (!isOpen()) {
            return "Bottle is not opened";
        }
        if (amount < 0) {
            return "Cannot fill bottle while drinking";
        }
        if (!hasLiquid()) {
            return "Bottle is empty";
        }
        if (amount > this.availableLiquid) {
            return "Not enough liquid";
        }
        this.availableLiquid -= amount;
        return "Remaining " + this.availableLiquid;
    }

    public static void main(String[] args) {
        Bottle bottle = new Bottle(500);
        bottle.open();
//        System.out.println(bottle.drink(400));
//        System.out.println(bottle.drink(100));
        System.out.println(bottle.drink(-1000));
    }
}
