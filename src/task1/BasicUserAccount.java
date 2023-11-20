package task1;

public class BasicUserAccount implements UserAccount {

    private String login;
    private String password;


    @Override
    public void createAccount(String login, String password) {
    this.login = login;
    this.password = password;
    }

    @Override
    public void updateAccount(String login, String password) {
    this.login = login;
    this.password = password;
    }

    @Override
    public void deleteAccount() {
        this.login = null;
        this.password = null;

    }

    @Override
    public String toString() {
        return " login: " + login +
                "\n password: " + password;
    }
}
