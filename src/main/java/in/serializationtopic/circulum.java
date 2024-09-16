package in.serializationtopic;

import java.io.Serializable;

public class circulum implements Serializable {

    private String topic;
    private String module;

    public circulum(String topic, String module) {
        this.topic = topic;
        this.module = module;
    }
}
