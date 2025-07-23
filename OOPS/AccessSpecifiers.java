public class AccessSpecifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.name = "Yuvraj";
        System.out.println(myAcc.name);
        myAcc.ChangePwd("abcdefghijkl");
    }
}

class BankAccount{
    public String name;
    private String password;
    public void ChangePwd(String pwd){
        password = pwd;
    }
}
