package in.ust;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Insurance insurance = new Insurance("Medi Assist","Srikanth",
                21,79897003);
        HealthInsurance hi= new HealthInsurance(202011456,200000);
        TermInsurance ti=new TermInsurance(20234567,400000);


        //System.out.println(insurance.getInsurer()+" "+insurance.getInsured()+" "+insurance.getAge()+" "+insurance.getPhoneNo());
        //System.out.println(hi.getPolicyId()+" "+ hi.getSumassured());
        //System.out.println(ti.getPolicyId()+" "+ ti.getSumassured());

        System.out.println(insurance);
        System.out.println(hi);
        System.out.println(ti);
    }
}