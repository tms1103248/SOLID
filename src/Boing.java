public class Boing implements SingleDriverVehicle,Passangerable{
    @Override
    public boolean isFlyable() {
        return true;
    }

    @Override
    public int getWeight() {
        return 10000;
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
