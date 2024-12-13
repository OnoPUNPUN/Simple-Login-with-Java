public class Main {

    public static void main(String[] args) {
        IdAndPassword ideAndPassword = new IdAndPassword();

        LoginPage loginPage = new LoginPage(ideAndPassword.getLoginInfo()); 
    }
}