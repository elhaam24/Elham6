public class Sedan extends Vehicle {
    String sedanID;

    public Sedan(double costInsuranceFreight, int seatingCapacity, double grossWeight, int engineCapacity, int age, String transportMode, int daysInBond, String sedanID) {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, age, transportMode, daysInBond);
        this.sedanID = sedanID;
    }

    @Override
    public void calculateTax() {
        double ImportDuty = 0.25 * getCostInsuranceFreight();
        double ValueAddedTax = 0.18 * getCostInsuranceFreight();
        double WithholdingTax = 0.06 * getCostInsuranceFreight();
        double InfrastructureLevy = 150000;
        double StampDuty = 35000;
        double FormFees = 20000;
        double ExciseDuty = 200000;


        double seatingCapacityTax = (getSeatingCapacity() > 5) ? (getSeatingCapacity()- 5) * 150000 : 0;
        double weightTax = (getGrossWeight() > 2000) ? 0.10 * getCostInsuranceFreight() : 0.02 * getCostInsuranceFreight();
        double engineTax = (getEngineCapacity() > 2000) ? 0.04 * getCostInsuranceFreight() : 0.02 * getCostInsuranceFreight();


        double ageTax = (getAge() > 10) ? 0.10 * getCostInsuranceFreight() : (getAge() >= 5) ? 0.05 * getCostInsuranceFreight() : 0.02 * getCostInsuranceFreight();
        double registration = 300000;
        double transportFees = calculateTransportFees();
        double parkingFees = calculateParkingFees();

        double totalTax = ImportDuty + ValueAddedTax + WithholdingTax + InfrastructureLevy + StampDuty + FormFees + ExciseDuty + seatingCapacityTax + weightTax + engineTax + ageTax + registration + transportFees + parkingFees;
        System.out.println("Sedan Tax: UGX " + totalTax);
    }

    @Override
    public void printVehicleInfoAndTaxBreakdown() {
        System.out.println("Vehicle Type: Sedan");
        System.out.println("CIF: UGX " + getCostInsuranceFreight());
        System.out.println("Seating Capacity: " + getSeatingCapacity());
        System.out.println("Gross Weight: " + getGrossWeight() + " tons");
        System.out.println("Engine Capacity: " + getEngineCapacity() + " CC");
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Transport Mode: " + getTransportMode());
        System.out.println("Days in Bond: " + getDaysInBond() + " days");
    }
}