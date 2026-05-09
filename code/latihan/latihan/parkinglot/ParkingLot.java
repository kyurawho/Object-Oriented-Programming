import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
 
public class ParkingLot implements Manageable {
 
    private int       totalSlots;
    private int       usedSlots;
    private String[]  parkedPlates;
    private String[]  parkedTypes;
    private LocalDateTime[] entryTimes; 
    private List<String> transactionLog; 
    private double    totalRevenue;
    private String    lotName;
 
    public ParkingLot(String lotName, int totalSlots) {
        this.lotName        = lotName;
        this.totalSlots     = totalSlots;
        this.usedSlots      = 0;
        this.parkedPlates   = new String[totalSlots];
        this.parkedTypes    = new String[totalSlots];
        this.entryTimes     = new LocalDateTime[totalSlots];
        this.transactionLog = new ArrayList<>(); 
        this.totalRevenue   = 0;
    }
 
    @Override
    public void parkVehicle(String vehicleType, String plateNumber) {
        if (usedSlots >= totalSlots) {
            System.out.println("Parkir penuh! Tidak bisa masuk.");
            return;
        }
 
        if (!vehicleType.equals("CAR") &&
            !vehicleType.equals("MOTORCYCLE") &&
            !vehicleType.equals("TRUCK")) {
            System.out.println("Jenis kendaraan tidak dikenal: " + vehicleType);
            return;
        }
 
        for (int i = 0; i < totalSlots; i++) {
            if (plateNumber.equals(parkedPlates[i])) {
                System.out.println("Plat " + plateNumber + " sudah ada di dalam!");
                return;
            }
        }
 
        for (int i = 0; i < totalSlots; i++) {
            if (parkedPlates[i] == null) {
                parkedPlates[i] = plateNumber;
                parkedTypes[i]  = vehicleType;
                entryTimes[i]   = LocalDateTime.now(); 
 
                System.out.println("=============================");
                System.out.println("  STRUK MASUK - " + lotName);
                System.out.println("=============================");
                System.out.println("  Plat    : " + plateNumber);
                System.out.println("  Jenis   : " + vehicleType);
                System.out.println("  Masuk   : " + entryTimes[i]);
                System.out.println("  Slot    : " + (i + 1));
                System.out.println("=============================");
 
                transactionLog.add("MASUK | " + plateNumber + " | " + vehicleType
                    + " | " + entryTimes[i]);
                return;
            }
        }
    }
 
    @Override
    public void exitVehicle(String plateNumber) {
        for (int i = 0; i < totalSlots; i++) {
            if (plateNumber.equals(parkedPlates[i])) {
                LocalDateTime exitTime = LocalDateTime.now();
                long hours = Duration.between(entryTimes[i], exitTime).toHours() + 1;
 
                String vehicleType = parkedTypes[i];
 
                double fee;
                if (vehicleType.equals("CAR")) {
                    fee = hours * 5000;
                } else if (vehicleType.equals("MOTORCYCLE")) {
                    fee = hours * 2000;
                } else if (vehicleType.equals("TRUCK")) {
                    fee = hours * 10000;
                } else {
                    fee = hours * 5000; 
                }
 
                totalRevenue += fee;
 
                System.out.println("=============================");
                System.out.println("  STRUK KELUAR - " + lotName);
                System.out.println("=============================");
                System.out.println("  Plat    : " + plateNumber);
                System.out.println("  Jenis   : " + vehicleType);
                System.out.println("  Masuk   : " + entryTimes[i]);
                System.out.println("  Keluar  : " + exitTime);
                System.out.println("  Durasi  : " + hours + " jam");
                System.out.println("  Tarif   : Rp " + String.format("%,.0f", fee));
                System.out.println("=============================");
 
                transactionLog.add("KELUAR | " + plateNumber + " | " + vehicleType
                    + " | " + exitTime + " | Rp " + fee);
 
                parkedPlates[i] = null;
                parkedTypes[i]  = null;
                entryTimes[i]   = null;
                usedSlots--;
                return;
            }
        }
        System.out.println("Plat " + plateNumber + " tidak ditemukan.");
    }
 
    @Override
    public void printReport() {
        System.out.println("\n===== LAPORAN PARKIR =====");
        System.out.println("Nama Lot    : " + lotName);
        System.out.println("Total Slot  : " + totalSlots);
        System.out.println("Terisi      : " + usedSlots);
        System.out.println("Kosong      : " + (totalSlots - usedSlots));
        System.out.println("Total Pendapatan: Rp " + String.format("%,.0f", totalRevenue));
        System.out.println("\n--- LOG TRANSAKSI ---");
        for (String log : transactionLog) {
            System.out.println(log);
        }
        System.out.println("==========================\n");
    }
    
    @Override
    public void backupToCloud() {
        System.out.println("Not available");
    }
 
    @Override
    public void sendEmailSummary() {
        System.out.println("Not available");
    }
 
    @Override
    public void resetAllData() {
        System.out.println("Not available.");
    }
 
    public int getAvailableSlots() {
        return totalSlots - usedSlots;
    }
}