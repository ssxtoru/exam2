package task1;

public class UserAccountManager {
    public static void main(String[] args) {
        BasicUserAccount basicUserAccount = new BasicUserAccount();
        BasicUserAccount basicUserAccount2 = new BasicUserAccount();
        BasicUserAccount basicUserAccount3 = new BasicUserAccount();


        basicUserAccount.createAccount("Altai","altai240506");
        basicUserAccount2.updateAccount("PotatoChip 2008", "supermario2008");
        basicUserAccount3.deleteAccount();

        System.out.println();
        System.out.println("----------------------");
        System.out.println(basicUserAccount);
        System.out.println();
        System.out.println("----------------------");
        System.out.println(basicUserAccount2);
        System.out.println();
        System.out.println("----------------------");
        System.out.println(basicUserAccount3);
    }
}
