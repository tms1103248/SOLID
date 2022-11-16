
public class Main {
    public static void main(String[] args) {
        PerimeterCalculator calculator = new PerimeterCalculator();
        calculator.getPerimeter(new MyFigure());
        calculator.getPerimeter(new MyBestFigure());


        SingleDriverVehicle vehicle = new Boing();
        VehicleStore store = new VehicleStore(new BmwX8());
        System.out.println(store.getFilledMass());
        if (vehicle.isFlyable()) {
            System.out.println("this vehicle is flying and has "+ vehicle.getWeight() + "mass");

        }else {
            System.out.println("this vehicle is not flying and has"+ vehicle.getWeight() + "mass");
        }

    }
}