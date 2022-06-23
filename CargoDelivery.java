public class CargoDelivery {
    private final int weight; //
    private final String dimensions; //
    private final String address; //
    private final String regNumb;
    private final boolean turnOver;
    private final boolean fragile;


    public CargoDelivery(int weight, String dimensions, String address, String regNumb, boolean turnOver, boolean fragile) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.address = address;
        this.regNumb = regNumb;
        this.turnOver = turnOver;
        this.fragile = fragile;
    }

    public CargoDelivery setWeight(int weight){
        return new CargoDelivery(weight, dimensions, address, regNumb, turnOver, fragile);
    }
    public CargoDelivery setDimensions(String dimensions){
        return new CargoDelivery(weight, dimensions, address, regNumb, turnOver, fragile);
    }
    public CargoDelivery setAddress(String address){
        return new CargoDelivery(weight, dimensions, address, regNumb, turnOver, fragile);
    }

    public int getWeight() {
        return weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getAddress() {
        return address;
    }

    public String getRegNumb() {
        return regNumb;
    }


    public boolean isTurnOver() {
        return turnOver;
    }


    public boolean isFragile() {
        return fragile;
    }

    public void dimensions (int width, int height, int length) {
        System.out.println("w = " + width + " m, h = "+ height+ " m, l = "+ length+ " m");
        int volume = width * height * length;
        System.out.println("v = "+ volume+" m");
    }
    public void DeliveryInfo(){
        System.out.println("Weight = "+ weight+ "; Dimensions = "+ dimensions+ "; Address: " + address );
    }


}

//width height length = volume