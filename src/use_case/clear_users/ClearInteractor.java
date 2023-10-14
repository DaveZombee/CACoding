package use_case.clear_users;

// TODO Complete me

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

    }
}
