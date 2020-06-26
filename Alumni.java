public class Alumni extends User{
    private String Birthdate;
    private String Position;
    private String Department;
    private String Religion;
    //public static string alumniuserserialno = 0;
    //public alumni(String , String sumaiya, String s1, String matuail, String s2, String female, String s3, String student, String software, String islam){
    // alumniuserserialno ++ ;


    //}
    public Alumni(String Birthdate, String Position, String Department, String Religion) {
        super();
        //alumniuserserialno ++ ;
        this.Birthdate = Birthdate;
        this.Position = Position;
        this.Department=Department;
        this.Religion = Religion;

    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.Birthdate = birthdate;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public String getReligion() {
        return Religion;
    }
    public void setReligion(String religion) {
        this.Religion = religion;
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
