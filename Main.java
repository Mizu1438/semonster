public class Main {
    public static void main(String[] args) {
        System.out.println("SEMonster!");

        // Playerオブジェクトの追加とメソッド呼び出し
        Player player = new Player();
        player.drawMonsters();
        player.showDeck();
    }
}