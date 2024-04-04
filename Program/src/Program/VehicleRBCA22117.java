package Program;

public class VehicleRBCA22117 {
    private int horsepower;

    public VehicleRBCA22117 (int horsepower) {
        this.horsepower = horsepower;
    }

    public void drive() {
        System.out.println("Vehicle is being driven");

}


public int getHorsepower() {
    return horsepower;
}

//Car


public class CarRBCA22117 extends VehicleRBCA22117 {
private String make;

public CarRBCA22117 (int horsepower, String make) {
    super(horsepower);
    this.make = make;
}

public void drive() {
    super.drive();
    System.out.println("Car is being driven");
}

public String getMake() {
    return make;
}}}


   