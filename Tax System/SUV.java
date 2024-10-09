public class SUV extends Vehicle {
    String SUVID;

    public SUV(double costInsuranceFreight, int seatingCapacity, double grossWeight, int engineCapacity, int age, String transportMode, int daysInBond, String SUVID) {
        super(costInsuranceFreight, seatingCapacity, grossWeight, engineCapacity, age, transportMode, daysInBond);
        this.SUVID = SUVID;
    }

    @Override
    public void calculateTax() {
        double ImportDuty = 0.30 * getCostInsuranceFreight();
        double ValueAddedTax = 0.18 * getCostInsuranceFreight();
        double WithholdingTax = 0.06 * getCostInsuranceFreight();
        double InfrastructureLevy = 250000;
        double StampDuty = 50000;
        double FormFees = 30000;
        double ExciseDuty = 300000;


        double seatingCapacityTax = (getSeatingCapacity() > 5) ? (getSeatingCapacity() - 5) * 300000 : 0;
        double weightTax = (getGrossWeight() > 2500) ? 0.12 * getCostInsuranceFreight() : 0.05 * getCostInsuranceFreight();
        double engineTax = (getEngineCapacity() > 2500) ? 0.06 * getCostInsuranceFreight() : 0.03 * getCostInsuranceFreight();


        double ageTax = (getAge() > 10) ? 0.20 * getCostInsuranceFreight() : (getAge() >= 5) ? 0.10 * getCostInsuranceFreight() : 0.05 * getCostInsuranceFreight();

        double registration = 500000;

        double transportFees = calculateTransportFees();
        double parkingFees = calculateParkingFees();

        double totalTax = ImportDuty + ValueAddedTax + WithholdingTax + InfrastructureLevy + StampDuty + FormFees + ExciseDuty + seatingCapacityTax + weightTax + engineTax + ageTax + registration + transportFees + parkingFees;
        System.out.println("SUV Tax: UGX " + totalTax);
    }

    @Override
    public void printVehicleInfoAndTaxBreakdown() {
        System.out.println("Vehicle Type: SUV");
        System.out.println("CIF: UGX " + getCostInsuranceFreight());
        System.out.println("Seating Capacity: " + getSeatingCapacity());
        System.out.println("Gross Weight: " + getGrossWeight() + " tons");
        System.out.println("Engine Capacity: " + getEngineCapacity() + " CC");
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Transport Mode: " + getTransportMode());
        System.out.println("Days in Bond: " + getDaysInBond() + " days");
    }
}