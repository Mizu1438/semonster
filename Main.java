public class Main {
    public static void main(String[] args) {
        System.out.println("SEMONSTER GAME");
        System.out.println("Show draw monsters!");

        Player player = new Player();
        player.drawMonsters();
        player.showDeck();
    }
}