import java.util.LinkedList;
import java.util.List;
class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public List<String> allStudents ;
    public SILab2() {
        allStudents=new LinkedList<>();
    }

    public boolean function (User user, List<String> allUsers) { //A1,A2
        if (user==null) {//B
            throw new RuntimeException("The user argument is not initialized!");//C
        }
        else {//D
            if (user.getUsername()==null || allUsers.contains(user.getUsername())) {//E
                throw new RuntimeException("User already exists!");//F
            }
            else {//G
                if (user.getEmail()==null)//H
                    return false;//I
                boolean atChar = false, dotChar = false; //J
                for (int i=0;i<user.getEmail().length();i++) {//K
                    if (user.getEmail().charAt(i)=='@')//L
                        atChar = true;//M
                    if (atChar && user.getEmail().charAt(i)=='.') {//N
                        dotChar = true;//O
                    }
                }//Q
                if (!atChar || !dotChar) {//P
                    return false;//I
                }
            }
        }
        return true;//R
    }
}
