/**
 * @author <Truong Phung Tan Tai - s3974929>
 */
package Classes;

import java.util.List;

public class RentalAgreement {
    private String contractId;
    private Tenant mainTenant;
    private List<Tenant> subTenants;
    private Property rentedProperty;
    private Host host;
    private String leaseTerm;
    private String contractTerms;
    private double rentalFee;
    private String period;
    private String status;

    public RentalAgreement(String contractId, Tenant mainTenant, List<Tenant> subTenants, Property rentedProperty, Host host, String leaseTerm, String contractTerms, double rentalFee, String status, String period) {
        this.contractId = contractId;
        this.mainTenant = mainTenant;
        this.subTenants = subTenants;
        this.rentedProperty = rentedProperty;
        this.host = host;
        this.leaseTerm = leaseTerm;
        this.contractTerms = contractTerms;
        this.rentalFee = rentalFee;
        this.status = status;
        this.period = period;
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

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "RentalAgreement{" +
                "contractId='" + contractId + '\'' +
                ", mainTenant=" + mainTenant +
                ", subTenants=" + subTenants +
                ", rentedProperty=" + rentedProperty +
                ", host=" + host +
                ", leaseTerm='" + leaseTerm + '\'' +
                ", contractTerms='" + contractTerms + '\'' +
                ", rentalFee=" + rentalFee +
                ", status='" + status + '\'' +
                ", period='" + period + '\'' +
                '}';
    }
}
