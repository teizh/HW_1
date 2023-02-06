public class Vehicle {
    private String plateNumber;
    private int yearOfManufacture;
    private Color color;

    public Vehicle(int yearOfManufacture, Color color, String plateNumber) {
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.plateNumber = plateNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Color getColor() {
        return color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getInfo() {

        return "\nYear of Manufacture : " + yearOfManufacture +
                "\nColor: " + color + "\nPlate Number: " +plateNumber;

    }

}
