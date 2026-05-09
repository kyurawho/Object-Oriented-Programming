interface Manageable {
    void parkVehicle(String vehicleType, String plateNumber);
    void exitVehicle(String plateNumber);
    void printReport();
    void backupToCloud();
    void sendEmailSummary();
    void resetAllData();
}