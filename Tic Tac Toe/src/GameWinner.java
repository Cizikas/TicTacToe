public class GameWinner {
    Map map = new Map();
    int GameWinner = 0;
    int score = 0;
    int nuliukai = 5;
    int kryziukai = 6;
    Layout Layout = new Layout();



    public void GameDecider(Map map){
        this.map = map;
        for (int i = 0; i < map.getHeight(); i += 2) {
            for (int j = 1; j < map.getWidth(); j += 4) {
                checkAndOutput(i,j);
            }
            GameWinner = 0;
            score = 0;
        }

        for (int j = 1; j < map.getWidth(); j += 4) {
            for (int i = 0; i < map.getHeight(); i += 2) {
                checkAndOutput(i,j);
            }
            GameWinner = 0;
            score = 0;
        }

        if (map.getCoords(0,1) == map.getCoords(2,5) && map.getCoords(0,1) == map.getCoords(4,9) && map.getCoords(0,1) != 0) {
            if (map.getCoords(0,1) == nuliukai) {
                Layout.printLayout(map);
                System.out.println("Jus laimejote");
                System.exit(0);
            } else {
                Layout.printLayout(map);
                System.out.println("Laimejo kryziukai");
                System.exit(0);
            }
        }

        if (map.getCoords(4,1) == map.getCoords(2,5) && map.getCoords(4,1) == map.getCoords(0,9) && map.getCoords(4,1) != 0) {
            if (map.getCoords(4,1) == nuliukai) {
                Layout.printLayout(map);
                System.out.println("Jus laimejote");
                System.exit(0);
            } else {
                Layout.printLayout(map);
                System.out.println("Laimejo kryziukai");
                System.exit(0);
            }
        }
    }

    public void tie(int sk){
        if (sk == 5) {
            System.out.println("Tie");
            System.exit(0);
        }
    }

    public void checkAndOutput(int i, int j){
        if (GameWinner == 0) {
            GameWinner = map.getCoords(i,j);
        } else if (map.getCoords(i,j) == GameWinner) {
            score++;
            if (score == 2) {
                if (GameWinner == kryziukai) {
                    Layout.printLayout(map);
                    System.out.println("Laimejo kryziukai");
                    System.exit(0);
                } else {
                    Layout.printLayout(map);
                    System.out.println("Jus laimejote");
                    System.exit(0);
                }
            }
        }
    }
}
