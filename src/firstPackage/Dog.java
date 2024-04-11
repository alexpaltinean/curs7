package firstPackage;

public class Dog extends Animal {

    public String breed;

    public void printDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Number of legs: " + this.numberOfLegs);
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.defaultField = 2;
        a.protectedField = 5;
        a.publicField = 7;
    }
}
