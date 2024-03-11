import java.util.ArrayList;
/* This is a stub for the House class */

public class House extends Building {

  private boolean hasElevator;
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

  //accessor for elevator
  public boolean getHasElevator(){
    return this.hasElevator;
  }

  //tells user if there's an elevator using accessor
  public void outHasElevator(){
    if (this.getHasElevator()){
      System.out.println(this.name + " has an elevator.");
    }else{
      System.out.println(this.name + " does not have an elevator.");
    }
  }

  //accessor for dining room
  public boolean getHasDiningRoom(){
    return this.hasDiningRoom;
  }

  //tells user if there's a dining room using accessor
  public void outHasDiningRoom(){
    if (this.getHasDiningRoom()){
      System.out.println(this.name + " has a dining room!");
    }else{
      System.out.println(this.name + " does not have a dining room.");
    }
  }

  //accessor for number of residents
  public int getNResidents(){ 
    return residents.size();
  }

  //tells user how many residents in the house using accessor
  public void outNResidents(){
    if (this.getNResidents() == 0 || this.getNResidents() > 1){
      System.out.println(this.name + " has " + this.getNResidents() + " residents.");
    }else if (this.getNResidents() == 1){
      System.out.println(this.name + " has 1 resident.");
    }
  }

  //check to see if they live here
  public boolean isResident(String person){
    if (residents.contains(person)){
      return true; //add name + "is a resident"?    
    }
    return false; //add name + "is not a resident"?
  }

  //tells user if someone lives in the house using the method above
  public void outIsResident(String person){
    if (this.isResident(person)){
      System.out.println(person + " is a resident of this house.");
    }else{
      System.out.println(person  + " is not a resident of this house.");
    }
  }

  //move someone in
  public void moveIn(String name){
    if (!residents.contains(name)){
      residents.add(name);
    }
  }

  //move someone out 
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
    
    myHouse.outNResidents();
    myHouse.moveIn("Pria");
    myHouse.outNResidents();

    myHouse.outHasDiningRoom();

    myHouse.outIsResident("Pria");
    myHouse.outIsResident("Mack");

    System.out.println(myHouse.moveOut("Pria"));
    myHouse.outIsResident("Pria");

    myHouse.outHasElevator();
    
  }

}