public class Main {
    public static void main(String[] args) {
        // 最初のメッセージを出力
        System.out.println("SEMONSTER GAME");
        System.out.println("Show a new monster!");
        
        // Monsterクラスのオブジェクトを生成（召喚）
        Monster monster = new Monster();
        
        // モンスターの情報を出力
        System.out.println(monster.toString());
    }
}