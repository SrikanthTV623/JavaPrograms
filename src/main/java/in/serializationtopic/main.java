package in.serializationtopic;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee("EMP01","sri@ust.com",
                "Srikanth", new circulum("Object Serialization","JAVA"));
        TraineePersistance persistance = new TraineePersistance();
        try{
            persistance.serialize(trainee);
            Trainee trainees = persistance.deserialize();
            //String str = traineede.toString();
            System.out.println(trainees.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error while serializing");
            System.err.println(e.getMessage());
        }
    }
}
