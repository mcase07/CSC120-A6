import java.util.ArrayList;
/* This is a stub for the House class */

public class House extends Building {

  boolean hasElevator;
  private boolean hasDiningRoom;
  private ArrayList<String> residents;

  public House(String name, String address, int nFloors, 
              boolean hasElevator, boolean hasDiningRoom) { //don't need to pass in an empty arrayList
    super(name, address, nFloors); // calling parent's attribute; is a Building
    // with...
    this.hasElevator = hasElevator;
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();

    System.out.println("You have built a house: 🏠");
  }

  //accessor for dining room
  public boolean getHasDiningRoom(){
    return this.hasDiningRoom;
  }

  //accessor for number of residents
  public int getNResidents(){ 
    return residents.size();
  }

  //check to see if they live here
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true; //add name + "is a resident"?
    }
    return false; //add name + "is not a resident"?
  }

  //move someone in
  public void moveIn(String name){
    if (!residents.contains(name)){
      residents.add(name);
    }
    //throw exception
  }

  public String moveOut(String name){
    if (residents.contains(name)){
      residents.remove(name);
      return name + " has moved out.";
    }
    return name + "does not live here";
  }
  public static void main(String[] args) {
    House myHouse = new House("Ninomiya", "69 Paradise Rd", 2, false, false);
    System.out.println(myHouse); // toString method comes from Building - otherwise it would return memory location 
    System.out.println(myHouse.getHasDiningRoom());
    System.out.println(myHouse.getNResidents());
    myHouse.moveIn("Pria");
    System.out.println(myHouse.isResident("Pria"));
    System.out.println(myHouse.moveOut("Pria"));
    System.out.println(myHouse.isResident("Pria"));
    
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