package Opps;

public class HospitalBillingSystem {
    public static void main() {
        //Array
        MedicalService[] services = {
                new Consultation("S001", 10, 15),
                new LaboratoryTest("S002", 8, 10),
                new Ultrasound("S003", 25, 15)
        };

        double totalBill = 0.0;

        System.out.println("Hospital Billing System..");
        //loop
        for (MedicalService service : services) {
            service.displayServiceInfo();
            totalBill += service.calculateTotalCost();
        }


    }
}

/*
1. MedicalService is abstract because it provides common service
   information but leaves the cost calculation to its subclasses.

2. No. MedicalService cannot be instantiated directly because
   it is an abstract class.

3. An abstract method has no implementation.
   A concrete method has a body containing executable code.

4. Each concrete subclass must implement calculateTotalCost()
   to provide its own cost calculation.
*/