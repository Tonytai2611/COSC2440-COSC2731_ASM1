/**
 * @author <Truong Phung Tan Tai - s3974929>
 */
package Classes;

import java.util.Date;
import java.util.List;

public class Owner extends Person{
    private List<Property> ownedProperties;
    private List<Host> managingHosts;
    private List<RentalAgreement> rentalAgreements;

    public Owner(List<Property> ownedProperties, List<Host> managingHosts, List<RentalAgreement> rentalAgreements) {
        this.ownedProperties = ownedProperties;
        this.managingHosts = managingHosts;
        this.rentalAgreements = rentalAgreements;
    }

    public Owner(String fullName, String id, Date dateOfBirth, String contactInfo, List<Property> ownedProperties, List<Host> managingHosts, List<RentalAgreement> rentalAgreements) {
        super(fullName, id, dateOfBirth, contactInfo);
        this.ownedProperties = ownedProperties;
        this.managingHosts = managingHosts;
        this.rentalAgreements = rentalAgreements;
    }

    public List<Property> getOwnedProperties() {
        return ownedProperties;
    }


    public void setOwnedProperties(List<Property> ownedProperties) {
        this.ownedProperties = ownedProperties;
    }

    public List<Host> getManagingHosts() {
        return managingHosts;
    }

    public void setManagingHosts(List<Host> managingHosts) {
        this.managingHosts = managingHosts;
    }

    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    public void setRentalAgreements(List<RentalAgreement> rentalAgreements) {
        this.rentalAgreements = rentalAgreements;
    }

    @Override
    public String toString() {
        return "Owner{" +
                super.toString() +
                "ownedProperties=" + ownedProperties +
                ", managingHosts=" + managingHosts +
                ", rentalAgreements=" + rentalAgreements +
                '}';
    }
}
