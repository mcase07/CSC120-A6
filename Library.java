import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);

    this.collection = new Hashtable<String, Boolean>();

    System.out.println("You have built a library: 📖");
  }

  public void addTitle(String title){
    this.collection.put(title, true);
  }

  // do try catch instead!
  
  // this works by checking if the key exists before removing
  public void removeTitle(String title){
    if (collection.containsKey(title)) {
      this.collection.remove(title);
      System.out.println(title + " successfully removed.");
    } else{
      System.out.println("We can't remove a book we don't have!");
    }
  }

  // this works by checking if the title is available before checking out
  public void checkOut(String title){
    if (this.isAvailable(title)){
      this.collection.replace(title, false);
      System.out.println(title + " successfully checked out.");
    } else{
      System.out.println("Sorry, this book is already checked out!");
    } 
  }

  // this works by checking if the title is already checked out before returning
  public void returnBook(String title){
    if (!this.isAvailable(title)){
      this.collection.replace(title, true);
      System.out.println(title + " successfully returned.");
    } else{
      System.out.println("You can't return a book that hasn't been checked out!");
    }
    
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

  //iterates through each set of key and value using Set<Entry> and souts
  public void printCollection(){
    Set<Entry<String, Boolean>> entrySet = collection.entrySet();
    for (Entry<String, Boolean> entry : entrySet){
      System.out.println("Book : " + entry.getKey() + " \t\t Available for Checkout : " + entry.getValue());
    }
  }

  public static void main(String[] args) {
    Library Neilson = new Library("Neislon", "6 Neilson Way", 4);
    System.out.println(Neilson);
    Neilson.addTitle("Green Eggs & Ham");
    // Neilson.removeTitle("Calvin & Hobbes");
    // Neilson.removeTitle("Green Eggs & Ham");
    // System.out.println(Neilson.containsTitle("Green Eggs & Ham"));
    // System.out.println(Neilson.collection);
    // System.out.println(Neilson.containsTitle("Green Eggs & Ham"));
    // System.out.println(Neilson.isAvailable("Green Eggs & Ham"));
    Neilson.returnBook("Green Eggs & Ham"); 
    Neilson.checkOut("Green Eggs & Ham");
    Neilson.returnBook("Green Eggs & Ham"); 
    // Neilson.checkOut("Green Eggs & Ham");
    // Systemout.println(Neilson.isAvailable("Green Eggs & Ham"));
    // Neilson.addTitle("Calvin & Hobbes");
    // Neilson.printCollection();
  }

}