/**
 * @author <Truong Phung Tan Tai - s3974929>
 */

package Main;

import Classes.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        //
        Property residentialProperty = new ResidentialProperty("RP001", "123 Main St", 1500, Property.PropertyStatus.AVAILABLE, 3, true, true);
        Property commercialProperty = new CommercialProperty("CP001", "456 Business Rd", 2500, Property.PropertyStatus.RENTED, "Retail", 10, 1500.5);

        // Tenant
        Tenant tenant = new Tenant("Nguyen Minh Tri", "T001", new Date(), "email@example.com", new ArrayList<>(), new ArrayList<>());

        //  Host
        Host host = new Host("Nguyen Thi Mai", "H001", new Date(), "phone@example.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        //  Owner
        Owner owner = new Owner("Tran Bao Son", "O001", new Date(), "owner@example.com", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        //  RentalAgreement
        //  RentalAgreement & RentalCycleType
        RentalAgreement rentalAgreement = new RentalAgreement(
                "RA001",                          // contractId
                tenant,                            // mainTenant
                new ArrayList<>(),                 // subTenants
                residentialProperty,               // rentedProperty
                new ArrayList<>(),                 // hosts
                RentalAgreement.RentalCycleType.MONTHLY,  // rentalCycle
                12,                                // duration (12 tháng)
                "Standard lease",                  // contractTerms
                1500,                              // rentalFee
                RentalAgreement.RentalAgreementStatus.ACTIVE // status
        );
        //  tenant, host & owner
        tenant.getRentalAgreements().add(rentalAgreement);
        host.getRentalAgreements().add(rentalAgreement);
        owner.getRentalAgreements().add(rentalAgreement);

        //  Payment
        Payment payment = new Payment("Credit Card", new Date(), 1500, tenant, "P001");

        // add tenant
        tenant.getPaymentRecords().add(payment);

        // Display
        printDivider();
        System.out.println("Residential Property:");
        printDivider();
        System.out.println(residentialProperty);

        printDivider();
        System.out.println("Commercial Property:");
        printDivider();
        System.out.println(commercialProperty);

        printDivider();
        System.out.println("Tenant Information:");
        printDivider();
        System.out.println(tenant);

        printDivider();
        System.out.println("Host Information:");
        printDivider();
        System.out.println(host);

        printDivider();
        System.out.println("Owner Information:");
        printDivider();
        System.out.println(owner);

        printDivider();
        System.out.println("Rental Agreement:");
        printDivider();
        System.out.println(rentalAgreement);

        printDivider();
        System.out.println("Payment Details:");
        printDivider();
        System.out.println(payment);
    }

    // Make it clearly
    private static void printDivider() {
        System.out.println("--------------------------------------------------");
    }
}
