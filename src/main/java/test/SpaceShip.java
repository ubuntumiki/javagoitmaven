package test;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber == null || serialNumber.isBlank()) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        if (serialNumber.length() != 8) {
            return;
        }

        this.serialNumber = serialNumber;
    }

    public void printInfo() {
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        ship.printInfo();
    }
}
