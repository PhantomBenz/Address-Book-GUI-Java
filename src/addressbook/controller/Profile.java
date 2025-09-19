package addressbook.controller;

public class Profile {
    public String username;
    public String password;

    public Profile() {
        
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
