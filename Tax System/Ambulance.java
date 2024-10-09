public class Ambulance extends Vehicle {
    String ambulanceID;

    public Ambulance(double costInsuranceFreight, int seatingCapacity, double grossWeight, int engineCapacity, int age, String transportMode, int daysInBond, String ambulanceID) {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, age, transportMode, daysInBond);
        this.ambulanceID = ambulanceID;
    }

    @Override
    public void calculateTax() {
        double InfrastructureLevy = (getAge() > 10) ? 0.15 * getCostInsuranceFreight() : 150000;
        double StampDuty = 35000;
        double FormFees = 20000;
        double ExciseDuty = 200000;
        double registration = 700000;

        double transportFees = calculateTransportFees();
        double parkingFees = calculateParkingFees();

        double totalTax = InfrastructureLevy + StampDuty + FormFees + ExciseDuty + registration + transportFees + parkingFees;
        System.out.println("Ambulance Tax: UGX " + totalTax);
    }

    @Override
    public void printVehicleInfoAndTaxBreakdown() {
        System.out.println("Vehicle Type: Ambulance");
        System.out.println("CIF: UGX " + getCostInsuranceFreight());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Transport Mode: " + getTransportMode());
        System.out.println("Days in Bond: " + getDaysInBond() + " days");
        System.out.println("Individual Taxes and Fees:");
        System.out.println("Infrastructure Levy (IL): UGX " + ((getAge() > 10) ? 0.15 * getCostInsuranceFreight() : 150000));
        System.out.println("Stamp Duty (SD): UGX 35000");
        System.out.println("Form Fees (FF): UGX 20000");
        System.out.println("Excise Duty (ED): UGX 200000");
        System.out.println("Registration Fee: UGX 700000");
        System.out.println("Transport Fees: UGX " + calculateTransportFees());
        System.out.println("Parking Fees: UGX " + calculateParkingFees());
    }
}