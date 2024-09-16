package in.ust;

public class HealthInsurance extends Insurance {

    private long policyId;
    private long sumassured;

    public HealthInsurance(long policyId, long sumassured) {
        this.policyId = policyId;
        this.sumassured = sumassured;
    }

    public HealthInsurance(String insurer, String insured, int age,
                           long phoneNo, long policyId, long sumassured) {
        super(insurer, insured, age, phoneNo);
        this.policyId = policyId;
        this.sumassured = sumassured;
    }

    public long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(long policyId) {
        this.policyId = policyId;
    }

    public long getSumassured() {
        return sumassured;
    }

    public void setSumassured(long sumassured) {
        this.sumassured = sumassured;
    }

    @Override
    public String toString() {
        return "HealthInsurance{" +
                "policyId=" + policyId +
                ", sumassured=" + sumassured +
                '}';
    }


}
