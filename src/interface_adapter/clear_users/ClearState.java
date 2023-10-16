package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearState {

    private String users;

    public ClearState(ClearState copy) {

    }

    public ClearState() {
    }

    public void setClearedUsers(ArrayList<String> users) {
        String newUsers = "";

        for (int i = 0; i < users.size(); i++) {
            newUsers += users.get(i);
        }

        this.users = newUsers;
    }

    public String getClearedUsers() {
        return users;
    }
}
