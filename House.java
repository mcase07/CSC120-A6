import java.util.ArrayList;
/* This is a stub for the House class */

public class House extends Building {

  boolean hasElevator;
  boolean hasDiningRoom;
  ArrayList<String> residents;

  public House(String name, String address, int nFloors, 
              boolean hasElevator, boolean hasDiningRoom) { //don't need to pass in an empty arrayList
    super(name, address, nFloors); // calling parent's attribute; is a Building
    // with...
    this.hasElevator = hasElevator;
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();

    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    House myHouse = new House("Ninomiya", "69 Paradise Rd", 2, false, false);
    System.out.println(myHouse); // toString method comes from Building - otherwise it would return memory location 
  }

//   public String toString() { // can override inhereted stuff by rewriting
//     String desc = super.toString(); 
//     desc += this.name + " is a " + this.nFloors + "-story house located at " + this.address;
//     if (this.hasDiningRoom) {
//       desc += " It has a dining room.";

//     if (this.hasElevator) {
//       desc += "It has an elevator.";
//     }
//     // desc = desc.toString();
//     return desc;
//     }
// }

}