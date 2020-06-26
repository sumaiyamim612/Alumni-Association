public class Admin extends User {
    private String Destignation;
    public Admin(String id, String name, String password, String address, String phone_number, String gender, String destignation) {
        super();
        this.Destignation = Destignation;
    }
    public  String getDestignation() {
        return Destignation;
    }
    public void setDestignation(String Destignation) {
        this.Destignation = Destignation;
    }
    @Override
    void logIn(String id, String password) {

    }

    @Override
    void registration(String id, String password) {

    }
    @Override
    void updateInfo(){

    }
}

