import java.util.HashMap;

public class IdAndPassword {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IdAndPassword() {
        loginInfo.put("Mike Ock", "Letmein12");
        loginInfo.put("C. Mike Rack", "Mimber12");
        loginInfo.put("Mike OxSmal", "Robioul12");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
