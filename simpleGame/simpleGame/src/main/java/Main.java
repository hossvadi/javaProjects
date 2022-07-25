public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Moein", "knife", 100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();
        player.heal();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Player2 betterPlayer1 = new Player2("Iman", "machine gun", 80, false);
        betterPlayer1.damageByGun1();
        betterPlayer1.damageByGun2();
        betterPlayer1.heal();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Player2 betterPlayer2 = new Player2("Mamal", "machine gun", 60, true);
        betterPlayer2.damageByGun2();
        betterPlayer2.heal();
    }
}
