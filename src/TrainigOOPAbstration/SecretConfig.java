package TrainigOOPAbstration;

public class SecretConfig {

    private String secretValue = "default";

    public String performAction() {
        return "Action with secret value: "  + secretValue;
    }
}
