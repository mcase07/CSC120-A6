/* This is a stub for the Cafe class */
public class Cafe extends Building {

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        Cafe CC = new Cafe("CC", "3 College Lane", 1);
        System.out.println(CC);
    }
    
}
