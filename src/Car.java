public class Car extends Vehicle {

    private int numberOfDoors;
    private BodyType bodyType;


    public Car(int yearOfManufacture, Color color, String plateNumber, int numberOfDoors, BodyType bodyType) {
        super(yearOfManufacture, color, plateNumber);
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String drive() {
        return getPlateNumber()+ " Car drive off";
    }

    public String drive(int speed) {
        return getPlateNumber()+ " Car drive off with speed" + speed + " km/h";
    }


    final public String drive(int speed, int distance) {
        return getPlateNumber()+" Car drive off with speed" + speed + " km/h for" + distance + "km";
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "\nNumber of doors: "+ numberOfDoors+ "\nBody Type"+ bodyType;
    }
}
