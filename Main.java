import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER GAME");
    System.out.println("Show a new monster!");

    // Playerクラスのオブジェクトを生成（new）する
    Player player = new Player();
    
    // drawMonsters()を呼び出して、モンスターを5体ドローする
    player.drawMonsters();
    
    // showDeck()を呼び出して、ドローしたモンスターのデッキ内容を表示する
    player.showDeck();
  }
}