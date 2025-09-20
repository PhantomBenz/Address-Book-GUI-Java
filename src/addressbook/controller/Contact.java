package addressbook.controller;

public class Contact implements Comparable<Contact>{
    private String name;
    private String mobile;
    private String address;
    private String email;

    public Contact left;
    public Contact right;
    public int height;

    public Contact (String name, String mobile, String address, String email) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.left = null;
        this.right = null;
        this.height = 1;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData(Contact temp) {
        this.name = temp.name;
        this.mobile = temp.mobile;
        this.address = temp.address;
        this.email = temp.email;
    }

    public String getName() {
        return this.name;
    }
        
    public String getMobile() {
        return this.mobile;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public int compareTo (Contact c2) {
        return this.name.compareToIgnoreCase(c2.name);
    }

    public int compareTo (String cname) {
		return this.name.compareToIgnoreCase(cname);
	}

	public boolean compareToUtil (String test) {
		return name.substring(0,test.length()).equalsIgnoreCase(test);
	}
}
