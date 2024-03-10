import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);

    this.collection = new Hashtable<String, Boolean>();

    System.out.println("You have built a library: 📖");
  }

  // need to add throwing exceptions for these methods!
  public void addTitle(String title){
    this.collection.put(title, true);
  }
  
  public void removeTitle(String title){
    this.collection.remove(title);
  }

  public void checkOut(String title){
    this.collection.replace(title, false);
  }

  public void returnBook(String title){
    this.collection.replace(title, true);
  }

  public boolean containsTitle(String title){
    if(this.collection.containsKey(title)){
      return true;
    }
    return false;
  }

  public boolean isAvailable(String title){
    if(this.collection.get(title).equals(true)){
      return true;
    }
    return false;
  }

  //need to format better & figure out a way to store checkout status
  public void printCollection(){
    System.out.println(collection.toString());
    // String printCollection;
    // for (int i = 0; i < this.collection.size(); i++){
    //   printCollection += key + value + 
    // }
  }
  public static void main(String[] args) {
    Library Neilson = new Library("Neislon", "6 Neilson Way", 4);
    System.out.println(Neilson);
    Neilson.addTitle("Green Eggs & Ham");
    System.out.println(Neilson.containsTitle("Green Eggs & Ham"));
    System.out.println(Neilson.collection);
    System.out.println(Neilson.containsTitle("Green Eggs & Ham"));
    System.out.println(Neilson.isAvailable("Green Eggs & Ham")); 
    Neilson.checkOut("Green Eggs & Ham");
    System.out.println(Neilson.isAvailable("Green Eggs & Ham"));
    Neilson.addTitle("Calvin & Hobbes");
    Neilson.printCollection();
  }

}