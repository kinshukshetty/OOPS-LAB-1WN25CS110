interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    public VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}


class TwoWheeler extends VehicleParking implements ParkingCharge {
    public TwoWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Two Wheeler", parkingHours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 20.0;
        } else {
            return (2 * 20.0) + ((parkingHours - 2) * 10.0);
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Type       : " + vehicleType);
        System.out.println("Vehicle Number     : " + vehicleNumber);
        System.out.println("Parking Hours      : " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
        System.out.println("----------------------------------------");
    }
}


class FourWheeler extends VehicleParking implements ParkingCharge {
    public FourWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "Four Wheeler", parkingHours);
    }

    @Override
    public double calculateCharge() {
        if (parkingHours <= 2) {
            return parkingHours * 50.0;
        } else {
            return (2 * 50.0) + ((parkingHours - 2) * 30.0);
        }
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Type       : " + vehicleType);
        System.out.println("Vehicle Number     : " + vehicleNumber);
        System.out.println("Parking Hours      : " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
        System.out.println("----------------------------------------");
    }
}


public class ParkingSystemDemo {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Parking Management System ===\n");

        ParkingCharge vehicle1 = new TwoWheeler("KA-01-AB-1234", 4);
        ParkingCharge vehicle2 = new FourWheeler("KA-05-XY-5678", 3);

        vehicle1.displayParkingDetails();
        vehicle2.displayParkingDetails();
    }
}