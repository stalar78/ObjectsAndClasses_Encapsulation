public class CargoDeliv {
    private final Dimensions dimensions;
    private final int mass;
    private final String address;
    private final boolean reverse;
    private final String serialNumber;
    private final boolean fragile;

    public CargoDeliv(Dimensions dimensions, int mass, String address, boolean reverse,
                      String serialNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.address = address;
        this.reverse = reverse;
        this.serialNumber = serialNumber;
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public CargoDeliv setDimensions(Dimensions dimensions) {
        return new CargoDeliv(dimensions, mass, address, reverse, serialNumber, fragile);
    }

    public int getMass() {
        return mass;
    }

    public CargoDeliv setMass(int mass) {
        return new CargoDeliv(dimensions, mass, address, reverse, serialNumber, fragile);
    }

    public String getAddress() {
        return address;
    }

    public CargoDeliv setAddress(String address) {
        return new CargoDeliv(dimensions, mass, address, reverse, serialNumber, fragile);
    }

    public boolean isReverse() {
        return reverse;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String toString() {
        return "Габариты: " + dimensions.volume() + "\n" +
                "Масса: " + mass + "\n" +
                "Адрес: " + address + "\n" +
                "Серийный номер: " + serialNumber;
    }


}