/**
 * @author <Truong Phung Tan Tai - s3974929>
 */
import Classes.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //  Person
        Person person1 = new Person("Alice", "P001", new Date(), "Both.a@email.com");
        Person person2 = new Person("David", "P002", new Date(), "tran.b@email.com");

        // Property
        Property property1 = new Property("PR001", "123, HTP, TP.HCM", 1500.00, "Available");
        ResidentialProperty residentialProperty = new ResidentialProperty("PR002", "456,  Nguyen Hue Street, TP.HCM", 2000.00, "Rented", 3, true, true);
        CommercialProperty commercialProperty = new CommercialProperty("PR003", " 789, Huynh Tan Phat Street" , 3500.00, "Available", "Retail Store", 10, 500.0);

        // Rental Agreement
        RentalAgreement rentalAgreement1 = new RentalAgreement("RA001", new Tenant("Tony", "T001", new Date(), "tenant1@email.com", new ArrayList<>(), new ArrayList<>()), new ArrayList<>(), property1, new Host(), "1 Year", "Valid term", 1500.00, "Active", "Weekly");

        // Payment
        Tenant tenant1 = new Tenant("SonTung MTP", "T001", new Date(), "tenant1@email.com", new ArrayList<>(), new ArrayList<>());
        Payment payment1 = new Payment("Credit card", new Date(), 1500.00, tenant1, "P001");

        // Host and owner
        Host host1 = new Host("Lucy", "H001", new Date(), "host@email.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Owner owner1 = new Owner("Henry", "O001", new Date(), "owner@email.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // tenant
        Tenant tenant2 = new Tenant("Tai Truong", "T002", new Date(), "tenant2@email.com", new ArrayList<>(), new ArrayList<>());

        // Print out
        System.out.println("Testing for Person:");
        System.out.println("ID: " + person1.getId() + ", FullName: " + person1.getFullName() + ", Date of Birth: " + person1.getDateOfBirth() + ", Contact Info: " + person1.getContactInfo());
        System.out.println("ID: " + person2.getId() + ", FullName: " + person2.getFullName() + ", Date of Birth: " + person2.getDateOfBirth() + ", Contact Info: " + person2.getContactInfo());

        System.out.println("\nTesting for Property:");
        System.out.println("Property ID: " + property1.getPropertyId() + ", Address: " + property1.getAddress() + ", Rental Price: " + property1.getPricing() + ", Status: " + property1.getStatus());
        System.out.println("Propty ID: " + residentialProperty.getPropertyId() + ", Address: " + residentialProperty.getAddress() + ", Rental Price: " + residentialProperty.getPricing() + ", Status: " + residentialProperty.getStatus() +
                ", Number of Bedrooms: " + residentialProperty.getNumBedrooms() + ", Has Garden: " + residentialProperty.isGardenAvailability() + ", Pet Friendly: " + residentialProperty.isPetFriendliness());
        System.out.println("Property ID: " + commercialProperty.getPropertyId() + ", Address: " + commercialProperty.getAddress() + ", Rental Price: " + commercialProperty.getPricing() + ", Status: " + commercialProperty.getStatus() +
                ", Business Type: " + commercialProperty.getBusinessType() + ", Parking Spaces: " + commercialProperty.getParkingSpaces() + ", Square Footage: " + commercialProperty.getSquareFootage());

        System.out.println("\nTesting Rental Agreement Information:");
        System.out.println("Contract ID: " + rentalAgreement1.getContractId() + ", Main Tenant: " + rentalAgreement1.getMainTenant().getFullName() + ", Number of Sub-Tenants: " + rentalAgreement1.getSubTenants().size() +
                ", Rented Property: " + rentalAgreement1.getRentedProperty().getPropertyId() + ", Host: " + rentalAgreement1.getHost().getFullName() + ", Lease Term: " + rentalAgreement1.getLeaseTerm() + ", Contract Terms: " + rentalAgreement1.getContractTerms() +
                ", Rental Fee: " + rentalAgreement1.getRentalFee() + ", Status: " + rentalAgreement1.getStatus() + " Period: " + rentalAgreement1.getPeriod());

        System.out.println("\nTesting Payment Information:");
        System.out.println("Payment ID: " + payment1.getPaymentId() + ", Tenant: " + payment1.getTenant().getFullName() + ", Amount: " + payment1.getAmount() + ", Payment Date: " + payment1.getDate() + ", Payment Method: " + payment1.getPaymentMethod());

        System.out.println("\nTesting Host Information:");
        System.out.println("Host Name: " + host1.getFullName() + ", Contact Address: " + host1.getContactInfo());

        System.out.println("\nTesting Owner Information:");
        System.out.println("Owner Name: " + owner1.getFullName() + ", Contact Address: " + owner1.getContactInfo());


        System.out.println("\nTesting Tenant Information:");
        System.out.println("Tenant Name: " + tenant2.getFullName() + ", Contact Address: " + tenant2.getContactInfo());
    }
}
