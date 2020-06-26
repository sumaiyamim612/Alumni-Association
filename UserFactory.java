public class UserFactory {
    public void userFactory(String userType) {
        if (userType == null) {
            // return null;
        } else if (userType.equalsIgnoreCase("alumni")) {
            //return new alumni();
        } else if (userType.equalsIgnoreCase("admin")) {
            //return new admin();
        } else {
            //return null;
        }

    }
}
