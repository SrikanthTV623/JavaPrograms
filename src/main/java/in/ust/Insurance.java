package in.ust;

public class Insurance {

    private String insurer;
    private String insured;
    private int age;
    private long phoneNo;

    public Insurance(){

    }

    public Insurance(String insurer, String insured, int age, long phoneNo) {
        this.insurer = insurer;
        this.insured = insured;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    public String getInsured() {
        return insured;
    }

    public void setInsured(String insured) {
        this.insured = insured;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insurer='" + insurer + '\'' +
                ", insured='" + insured + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
