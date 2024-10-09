public class Estate extends Vehicle {
    String estateID;

    public Estate(double costInsuranceFreight, int seatingCapacity, double grossWeight, int engineCapacity, int age, String transportMode, int daysInBond, String estateID) {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, age, transportMode, daysInBond);
        this.estateID = estateID;
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
        double extraSeatTax = (getSeatingCapacity() > 5) ? (getSeatingCapacity() - 5) * 250000 : 0;

        double grossWeightTax = (getGrossWeight() > 2000) ? 0.10 * getCostInsuranceFreight() : ( getGrossWeight()>= 1500) ? 0.05 * getCostInsuranceFreight() : 0.02 * getCostInsuranceFreight();
        double engineTax = (getEngineCapacity() > 1800) ? 0.05 * getCostInsuranceFreight() : 0.025 * getCostInsuranceFreight();

        double ageTax = (getAge() > 10) ? 0.15 * getCostInsuranceFreight() : (getAge() >= 5) ? 0.05 * getCostInsuranceFreight() : 0.01 *getCostInsuranceFreight() ;

        double registration = ("DPS".equalsIgnoreCase(getTransportMode())) ? 700000 : 300000;
        double transportFees = calculateTransportFees();
        double parkingFees = calculateParkingFees();

        double totalTax = ImportDuty + ValueAddedTax + WithholdingTax + InfrastructureLevy + StampDuty + FormFees + ExciseDuty + extraSeatTax + ageTax + grossWeightTax + engineTax + registration + transportFees + parkingFees;
        System.out.println("Estate Tax: UGX " + totalTax);
    }

    @Override
    public void printVehicleInfoAndTaxBreakdown() {
        System.out.println("Vehicle Type: Estate");
        System.out.println("CIF: UGX " + getCostInsuranceFreight());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Transport Mode: " + getTransportMode());
        System.out.println("Days in Bond: " + getDaysInBond() + " days");
    }
}
