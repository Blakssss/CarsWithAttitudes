package demo;

public class Test {
  public static void main(String[] args) {
    Car myCar = new Car("AUDI", "2000XXX", "HEIL!", false, new Driver("Your chauffeur is here"));
    Driver myDriver = new Driver("Mathias");
   // System.out.println(myCar.getBrand());
   // System.out.println(myCar.getHonk());
   // System.out.println(myCar.getMake());
    System.out.println(myDriver.getName() + " is in the car.");
    System.out.println(myCar.sound());
    System.out.println(myCar.park());
    System.out.println(myCar.drive());
    System.out.println(myCar.thatDriver());
    System.out.println(myCar.turnEngineOff());
    System.out.println(myCar.turnEngineOn());

  }

}
