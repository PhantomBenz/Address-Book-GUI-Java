package addressbook.controller;

public class Profile {
    public String username;
    public String password;
    public Contact root = null;

    public Profile() {
        username = null;
        password = null;
    }

    //create new Profile
    public Profile(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }


}
