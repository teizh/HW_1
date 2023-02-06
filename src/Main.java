public class Main {
    public static void main(String[] args) {
        Car objectA = new Car(2012, Color.GOLD,"B1055AT" ,4, BodyType.SEDAN);
        Mercedes objectB = new Mercedes(2015, Color.BLACK, "B5750AY",4, BodyType.HATCHBACK,
                "A250", 2.0, Engines.STRAIGHT);
        Mercedes objectC = new Mercedes(2017, Color.BLUE, "B2177AY",2, BodyType.COUPE,
                "SLA", 5.3, Engines.V_SHAPE);
        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());


        System.out.println(objectA.drive());
        System.out.println(objectA.drive());
        System.out.println(objectA.drive());


        System.out.println(objectA.drive(100));
        System.out.println( objectB.drive(100));
        System.out.println( objectC.drive(100));

        System.out.println(objectA.drive(100, 40));
        System.out.println(objectB.drive(100, 40));
        System.out.println(objectC.drive(100, 40));


    }
}