public class Trailer extends Vehicle {
   String trailerID;

    public Trailer(double costInsuranceFreight, int seatingCapacity, double grossWeight, int engineCapacity, int age, String transportMode, int daysInBond, String trailerID) {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, age, transportMode, daysInBond);
        this.trailerID = trailerID;
    }

    @Override
    public void calculateTax() {
        double ImportDuty = 0.20 * getCostInsuranceFreight();
        double ValueAddedTax = 0.18 * getCostInsuranceFreight();
        double WithholdingTax = 0.06 * getCostInsuranceFreight();
        double InfrastructureLevy = 100000;
        double StampDuty = 25000;
        double FormFees = 15000;
        double ExciseDuty = 100000;

        
        double weightTax = (getGrossWeight() > 3000) ? 0.15 * getCostInsuranceFreight() : 0.07 * getCostInsuranceFreight();

        
        double ageTax = (getAge() > 10) ? 0.15 * getCostInsuranceFreight() : (getAge() >= 5) ? 0.07 * getCostInsuranceFreight() : 0.03 * getCostInsuranceFreight();

        double registration = 200000;

        double transportFees = calculateTransportFees();
        double parkingFees = calculateParkingFees();

        double totalTax = ImportDuty + ValueAddedTax + WithholdingTax + InfrastructureLevy + StampDuty + FormFees + ExciseDuty + weightTax + ageTax + registration + transportFees + parkingFees;
        System.out.println("Trailer Tax: UGX " + totalTax);
    }

    @Override
    public void printVehicleInfoAndTaxBreakdown() {
        System.out.println("Vehicle Type: Trailer");
        System.out.println("CIF: UGX " + getCostInsuranceFreight());
        System.out.println("Gross Weight: " + getGrossWeight() + " tons");
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Transport Mode: " + getTransportMode());
        System.out.println("Days in Bond: " + getDaysInBond() + " days");
    }
}