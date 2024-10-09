abstract class Vehicle {
   double CostInsuranceFreight;
   int seatingCapacity;
   double grossWeight;
   int engineCapacity;
   int age;
   String transportMode;
   int daysInBond;

   public Vehicle(double costInsuranceFreight, int seatingCapacity, double grossWeight, int engineCapacity, int age, String transportMode, int daysInBond) {
      this.CostInsuranceFreight = costInsuranceFreight;
      this.seatingCapacity = seatingCapacity;
      this.grossWeight = grossWeight;
      this.engineCapacity = engineCapacity;
      this.age = age;
      this.transportMode = transportMode;
      this.daysInBond = daysInBond;
   }

   public abstract void calculateTax();

   public double calculateTransportFees() {
      if ("Carrier Bed".equalsIgnoreCase(transportMode)) {
         return 0.005 * CostInsuranceFreight;
      } else if ("Driven".equalsIgnoreCase(transportMode)) {
         return 0.015 * CostInsuranceFreight;
      }
      return 0;
   }

   public double calculateParkingFees() {
      return daysInBond * 15000;
   }

   public abstract void printVehicleInfoAndTaxBreakdown();

   public double getCostInsuranceFreight() {
      return CostInsuranceFreight;
   }

   public int getAge() {
      return age;
   }

   public String getTransportMode() {
      return transportMode;
   }

   public int getDaysInBond() {
      return daysInBond;
   }

   public int getSeatingCapacity() {
      return seatingCapacity;
   }

   public double getGrossWeight() {
      return grossWeight;
   }

   public int getEngineCapacity() {
      return engineCapacity;
   }
}