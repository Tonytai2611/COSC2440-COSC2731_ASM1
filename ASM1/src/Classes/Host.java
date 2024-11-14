package Classes;

import java.util.Date;
import java.util.List;

public class Host extends Person{
    private List<Property> managedProperties;
    private List<Owner> cooperatingOwners;
    private List<RentalAgreement> rentalAgreements;

    public Host(List<Property> managedProperties, List<Owner> cooperatingOwners, List<RentalAgreement> rentalAgreements) {
        this.managedProperties = managedProperties;
        this.cooperatingOwners = cooperatingOwners;
        this.rentalAgreements = rentalAgreements;
    }

    public Host(String fullName, String id, Date dateOfBirth, String contactInfo, List<Property> managedProperties, List<Owner> cooperatingOwners, List<RentalAgreement> rentalAgreements) {
        super(fullName, id, dateOfBirth, contactInfo);
        this.managedProperties = managedProperties;
        this.cooperatingOwners = cooperatingOwners;
        this.rentalAgreements = rentalAgreements;
    }

    public Host() {
    }

    public List<Property> getManagedProperties() {
        return managedProperties;
    }

    public void setManagedProperties(List<Property> managedProperties) {
        this.managedProperties = managedProperties;
    }

    public List<Owner> getCooperatingOwners() {
        return cooperatingOwners;
    }

    public void setCooperatingOwners(List<Owner> cooperatingOwners) {
        this.cooperatingOwners = cooperatingOwners;
    }

    public List<RentalAgreement> getRentalAgreements() {
        return rentalAgreements;
    }

    public void setRentalAgreements(List<RentalAgreement> rentalAgreements) {
        this.rentalAgreements = rentalAgreements;
    }

    @Override
    public String toString() {
        return "Host{" +
                "managedProperties=" + managedProperties +
                ", cooperatingOwners=" + cooperatingOwners +
                ", rentalAgreements=" + rentalAgreements +
                '}';
    }
}
