public class Main {
    public static void main(String[] args) {
        Account hosseinAccount = new Account("123456", 0.0, "Hossein",
                "hossvadi@gmail.com", "09192376076");

        hosseinAccount.depositMoney(500);
        hosseinAccount.depositMoney(90);
        hosseinAccount.withdrawMoney(560);

    }
}
