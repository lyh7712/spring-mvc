package lyh7712.springmvc;

public class Contract {

    private Long id;
    private String company;
    private double commission;
    private String commissionType;
    private String commissionCutting;

    public Contract() {
    }

    public Contract(Long id, String company, double commission, String commissionType, String commissionCutting) {
        this.id = id;
        this.company = company;
        this.commission = commission;
        this.commissionType = commissionType;
        this.commissionCutting = commissionCutting;
    }

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public double getCommission() {
        return commission;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public String getCommissionCutting() {
        return commissionCutting;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", commission=" + commission +
                ", commissionType='" + commissionType + '\'' +
                ", commissionCutting='" + commissionCutting + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public void setCommissionCutting(String commissionCutting) {
        this.commissionCutting = commissionCutting;
    }
}

