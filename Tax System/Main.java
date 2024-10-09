public class Main {
    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance(8000000, 3, 3000, 1800, 12, "Driven", 5,"Ambulance");
        ambulance.calculateTax();
        ambulance.printVehicleInfoAndTaxBreakdown();
        System.out.println("-----------:");

        Estate estate = new Estate(12000000, 7, 1800, 2000, 7, "DPS", 3,"Estate");
        estate.calculateTax();
        estate.printVehicleInfoAndTaxBreakdown();
        System.out.println("------------:");

        Sedan sedan = new Sedan(6000000, 4, 1400, 1600, 4, "Transporter", 2,"Sedan");
        sedan.calculateTax();
        sedan.printVehicleInfoAndTaxBreakdown();
        System.out.println("-------------:");

        SUV suv = new SUV(8000000, 7, 6000, 2500, 8, "Carrier Bed", 3,"SUV");
        suv.calculateTax();
        suv.printVehicleInfoAndTaxBreakdown();
        System.out.println("------------:");

        Trailer trailer = new Trailer(15000000, 2, 18000, 16000, 12, "Driven", 4,"Trailer");
        trailer.calculateTax();
        trailer.printVehicleInfoAndTaxBreakdown();
    }
}
