public class VehicleStore {
    private SingleDriverVehicle vehicle;

    public VehicleStore (SingleDriverVehicle vehicle) {
        this.vehicle =vehicle;
    }

    public int getFilledMass () {
        return vehicle.getWeight();
    }
}
