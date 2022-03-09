package demo;

public class Car {
private String brand;
private String make;
private String honk;
public boolean engineOn;
private Driver driver1;

  void setDriver1(Driver b){
  driver1 = b;
  }
  public Driver getDriver1(){
  return driver1;
  }
  void setEngine(boolean a){
   // if (setDriver1(Driver) == true){
   //
   // }
    engineOn = a;
  }
  Boolean getEngine(){
    return engineOn;
  }
  void setBrand(String b){
    this.brand = b;
  }
  String getBrand(){
  return brand;
  }
  void setMake(String c){
    make = c;
  }
  String getMake(){
    return make;
  }
  void setHonk(String d){
    honk = d;
  }
  String getHonk(){
    return honk;
  }

  Car(String brand, String make, String honk, boolean a, Driver b){
    setBrand(brand);
    setMake(make);
    setHonk(honk);
    setEngine(a);
    setDriver1(b);
  }
  public String sound(){
    return getHonk();
  }
  public String drive(){
    return getBrand() + " " + getMake() + " is driving.";
  }
  public String park(){
    return getBrand() + " " + getMake() + " is parked.";
  }
  public Driver thatDriver(){
    return getDriver1();
  }
  public boolean turnEngineOn(){
    setEngine(true);
    return getEngine();
  }
  public boolean turnEngineOff(){
    setEngine(false);
    return getEngine();
  }
}
