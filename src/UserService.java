public class UserService {

    private UserDb userDb;

    public UserService(UserDb userDb){
        this.userDb=userDb;
    }

    public boolean changePassword(String username, String password){
        if (password.length()<8){
            return false;
        }
        return userDb.changePassword(username, password);
    }
}
