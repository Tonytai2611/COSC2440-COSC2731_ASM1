/**
 * @author <Truong Phung Tan Tai - s3974929>
 */
package Classes;

import java.io.Serializable;
import java.util.List;

public class RentalAgreement implements Serializable {
    private String contractId;
    private Tenant mainTenant;
    private List<Tenant> subTenants;
    private Property rentedProperty;
    private List<Host> hosts;
    private RentalCycleType rentalCycle;
    private int duration;
    private String leaseTerm;
    private String contractTerms;
    private double rentalFee;
    private String period;
    private RentalAgreementStatus status;

    public enum RentalAgreementStatus {
        NEW, ACTIVE, COMPLETED;
    }

    public enum RentalCycleType {
        DAILY, WEEKLY, FORTNIGHTLY, MONTHLY, YEARLY;
    }

    public RentalAgreement(String contractId, Tenant mainTenant, List<Tenant> subTenants,
                           Property rentedProperty, List<Host> hosts, RentalCycleType rentalCycle,
                           int duration, String contractTerms, double rentalFee, RentalAgreementStatus status) {
        this.contractId = contractId;
        this.mainTenant = mainTenant;
        this.subTenants = subTenants;
        this.rentedProperty = rentedProperty;
        this.hosts = hosts;
        this.rentalCycle = rentalCycle;
        this.duration = duration;  // duration là số đơn vị (ngày, tuần, tháng, v.v.)
        this.contractTerms = contractTerms;
        this.rentalFee = rentalFee;
        this.status = status;
    }

    public RentalCycleType getRentalCycle() {
        return rentalCycle;
    }

    public void setRentalCycle(RentalCycleType rentalCycle) {
        this.rentalCycle = rentalCycle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Tenant getMainTenant() {
        return mainTenant;
    }

    public void setMainTenant(Tenant mainTenant) {
        this.mainTenant = mainTenant;
    }

    public List<Tenant> getSubTenants() {
        return subTenants;
    }

    public void setSubTenants(List<Tenant> subTenants) {
        this.subTenants = subTenants;
    }

    public Property getRentedProperty() {
        return rentedProperty;
    }

    public void setRentedProperty(Property rentedProperty) {
        this.rentedProperty = rentedProperty;
    }

    public List<Host> getHost() {
        return hosts;
    }

    public void setHost(List<Host> hosts) {
        this.hosts = hosts;
    }

    public String getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(String leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public String getContractTerms() {
        return contractTerms;
    }

    public void setContractTerms(String contractTerms) {
        this.contractTerms = contractTerms;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public RentalAgreementStatus getStatus() {
        return status;
    }

    public void setStatus(RentalAgreementStatus status) {
        this.status = status;
    }








//    @Override
//    public int compareTo(RentalAgreement other) {
//        return Double.compare(this.rentalFee, other.rentalFee);
//    }

    @Override
    public String toString() {
        return "RentalAgreement{" +
                "contractId='" + contractId + '\'' +
                ", mainTenant=" + (mainTenant != null ? mainTenant.getFullName() : "No main tenant") +
                ", subTenants=" + (subTenants != null ? subTenants.size() + " sub-tenants" : "No sub-tenants") +
                ", rentedProperty=" + (rentedProperty != null ? rentedProperty.getAddress() : "No rented property") +
                ", hosts=" + (hosts != null ? hosts.size() + " hosts" : "No hosts") +
                ", leaseTerm=" + leaseTerm +
                ", contractTerms='" + contractTerms + '\'' +
                ", rentalFee=" + rentalFee +
                ", status=" + status +
                '}';

    }
}
