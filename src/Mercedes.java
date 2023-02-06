final public class Mercedes extends Car {
    private String model;
    private double engineVolume;

    private Engines engineType;

    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public Engines getEngineType() {
        return engineType;
    }



    public Mercedes(int yearOfManufacture, Color color, String plateNumber, int numberOfDoors, BodyType bodyType, String model, double engineVolume, Engines engineType) {
        super(yearOfManufacture, color, plateNumber, numberOfDoors, bodyType);
        this.model = model;
        this.engineVolume = engineVolume;
        this.engineType = engineType;
    }

    @Override
    public String drive() {
        return super.drive()+ " very fast";
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "\nModel: " + model + "\nEngine Volume "+ engineVolume+
                "\nEngine Type " + engineType;
    }
}
