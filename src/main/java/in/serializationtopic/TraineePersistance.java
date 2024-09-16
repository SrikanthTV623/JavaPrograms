package in.serializationtopic;

import java.io.*;

public class TraineePersistance {

    public void serialize(Trainee trainee) throws IOException {
        FileOutputStream fout = new FileOutputStream("trainee");
        ObjectOutputStream ser = new ObjectOutputStream(fout);
        ser.writeObject(trainee);
        ser.flush();
        fout.close();
    }

    public Trainee deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("trainee");
        ObjectInputStream ser = new ObjectInputStream(fin);
        var trainee = (Trainee) ser.readObject();
        ser.close();
        fin.close();

        return trainee;
    }
}
