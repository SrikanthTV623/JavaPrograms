package in.serializationtopic;

import java.io.Serializable;

public class Trainee implements Serializable {

    private String employeeId;
    private String emailId;
    private String fullName;
    private circulum circulum;

    public Trainee(String employeeId, String emailId, String fullName, in.serializationtopic.circulum circulum) {
        this.employeeId = employeeId;
        this.emailId = emailId;
        this.fullName = fullName;
        this.circulum = circulum;
    }
}
