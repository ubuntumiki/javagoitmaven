package test;

public class Tanker {
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getFuelType() {
        return "A500";
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() + ", tanker serial number is " + serialNumber);
    }

    public static void main(String[] args) {
        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);

        Tanker tanker2 = new XFuelTanker();
        tanker2.setSerialNumber("SN504030");
        tanker2.refuel(300);

        Tanker tanker3 = new MX200Tanker();
        tanker3.setSerialNumber("SN504030");
        tanker3.refuel(300);
    }
}

class XFuelTanker extends Tanker {

    @Override
    protected String getFuelType() {
        return "XFuel";
    }
}

class MX200Tanker extends Tanker {

    @Override
    protected String getFuelType() {
     return "MX200";
    }
}