class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot("Parkir Merdeka", 5);

        lot.parkVehicle("CAR",        "B 1234 ABC");
        lot.parkVehicle("MOTORCYCLE", "D 5678 XYZ");
        lot.parkVehicle("TRUCK",      "F 9999 TTT");
        lot.parkVehicle("BUS",        "G 1111 BUS");

        lot.exitVehicle("B 1234 ABC");
        lot.exitVehicle("D 5678 XYZ");

        lot.printReport();

        ParkingLot special = new SpecialParkingLot("Parkir VIP", 3);
        special.parkVehicle("CAR",        "Z 0001 VIP");
        special.parkVehicle("MOTORCYCLE", "Z 0002 MTR");
        special.exitVehicle("Z 0001 VIP"); 
        System.out.println("Slot tersisa: "+ special.getAvailableSlots());

        lot.backupToCloud();
        lot.sendEmailSummary();
    }
}