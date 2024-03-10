/* This is a stub for the Library class */
public class Library extends Building {

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
    }
  
    public static void main(String[] args) {
      Library Neilson = new Library("Neislon", "6 Neilson Way", 4);
      System.out.println(Neilson);

    }
  
  }