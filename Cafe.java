/* This is a stub for the Cafe class */
public class Cafe extends Building {
    
    //attributes are all set to private so no one else can change them!
    private int nCoffeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);

        this.nCoffeOunces = 100;
        this.nSugarPackets = 200;
        this.nCreams = 200;
        this.nCups = 50;

        System.out.println("You have built a cafe: ☕");
    }

    public String getStock(){
        return "The " + this.name + " has " + this.nCoffeOunces + " ounces of coffee, " + 
        this.nSugarPackets + " packets of sugar, " + this.nCreams + " number of creams, and " + this.nCups + " cups";
    }

    private void restock(int nCoffeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeOunces = nCoffeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    
    //change back to void after testing
    public void sellCoffee(int size, int sugars, int creams){
        if (size > this.nCoffeOunces || sugars > this.nSugarPackets || creams > this.nCreams || this.nCups < 0){
            restock(100, 200, 200, 50);
            this.nCoffeOunces -= size;
            this.nSugarPackets -= sugars;
            this.nCreams -= creams;
            this.nCups -= 1;
        }
        else {
            this.nCoffeOunces -= size;
            this.nSugarPackets -= sugars;
            this.nCreams -= creams;
            this.nCups -= 1;
        }
    }

    public static void main(String[] args) {
        Cafe CC = new Cafe("CC", "3 College Lane", 1);
        System.out.println(CC);
        System.out.println(CC.getStock());
        CC.sellCoffee(12, 2, 2);
        System.out.println(CC.getStock());
        CC.sellCoffee(12, 2, 2);
        System.out.println(CC.getStock());
    }
    
}
