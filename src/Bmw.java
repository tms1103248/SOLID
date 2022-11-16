public class Bmw implements SingleDriverVehicle,Passangerable{
    @Override
    public boolean isFlyable() {
        return false;
    }

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public String getColour() {
        return null;
    }


    @Override
    public int getPassangerable() {
        return 0;
    }
}
