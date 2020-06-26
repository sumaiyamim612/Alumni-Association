public abstract class User {
    protected String Id;
    protected  String Name;
    protected String Password;
    protected String Address;
    protected String Phone_Number;
    protected String Gender;
    public User(){
        this.Id = Id;
        this.Name = Name;
        this.Password = Password;
        this.Address = Address;
        this.Phone_Number = Phone_Number;
        this.Gender = Gender;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    abstract void logIn(String id, String password);
    abstract void registration(String id, String password);
    abstract void updateInfo();
}


