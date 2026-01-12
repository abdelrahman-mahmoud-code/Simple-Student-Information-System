package JavaTraining5.StudentInformationSystem;
import java.util.HashMap;

public class IDandPasswords {
    
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    
    IDandPasswords(){
        loginInfo.put("Abdelr@hm@n M@hmoud", "123");
        loginInfo.put("Bro", "pizza");
        loginInfo.put("admin", "admin");
    }
    
    
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
