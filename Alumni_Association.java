public class Alumni_Association {
    public static void main(String[] args) {
        //User user = new User("Id"+"Name"+"Password"+"Address"+"Phone_Number"+"Gender");
        // System.out.println("id: "+user.getId());
        // System.out.println("name: "+user.getName());
        // System.out.println("password: "+user.getPassword());
        // System.out.println("address: "+user.getAddress());
        //System.out.println("phone_number: "+user.getPhone_number());
        // System.out.println("gender: "+user.getGender());
        String userType = "admin";
        //userFactory userfactory = new userFactory();
        //user anyuser = Id(sumaiya);
        //System.out.println("user ID:"+anyuser.getID());
        // anyuser.updateuser();
        // System.out.println("user ID:"+anyuser.getId());
        Admin admin= new Admin ( "18135","Rashed Karim","*****","Narayonganj","01624946661","Male","Teacher");
        System.out.println("Destignation: " + admin.getDestignation());
        //admin.admininfo();
        userType = "alumni";
        Alumni alumni=new Alumni("6th may","student","Software Engineering","Islam");
        System.out.println("Birthdate: "+alumni.getBirthdate());
        System.out.println("Position: "+alumni.getPosition());
        System.out.println("Department: "+alumni.getDepartment());
        System.out.println("Religion: "+alumni.getReligion());
    }
}
