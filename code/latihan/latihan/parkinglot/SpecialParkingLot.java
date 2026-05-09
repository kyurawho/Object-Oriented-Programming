class SpecialParkingLot extends ParkingLot {
 
    public SpecialParkingLot(String lotName, int totalSlots) {
        super(lotName, totalSlots);
    }
 
    @Override
    public void parkVehicle(String vehicleType, String plateNumber) {
        if (vehicleType.equals("MOTORCYCLE")) {
            System.out.println("SpecialParkingLot tidak menerima motor!");
            return; 
        }
        super.parkVehicle(vehicleType, plateNumber);
    }
 
    @Override
    public void exitVehicle(String plateNumber) {
        System.out.println("[VIP] Kendaraan " + plateNumber + " keluar GRATIS.");
    }
}