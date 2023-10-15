package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface clearDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary
                           ) {

        this.clearDataAccessObject = clearDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        ArrayList<String> clearedUsers = clearDataAccessObject.getClearedUsers();
        clearDataAccessObject.clearUsers();
        ClearOutputData clearOutputData = new ClearOutputData(clearedUsers);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
