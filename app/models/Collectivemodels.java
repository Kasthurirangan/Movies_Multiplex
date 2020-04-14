package models;

import java.util.List;

public class Collectivemodels {
    private boolean isSuccessful;

    private List<AllModels> body;

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public List<AllModels> getBody() {
        return body;
    }

    public void setBody(List<AllModels> body) {
        this.body = body;
    }

    public  Collectivemodels(boolean isSuccessful, List<AllModels> body)
    {
        this.isSuccessful = isSuccessful;
        this.body = body;
    }

    Collectivemodels(){}


}
