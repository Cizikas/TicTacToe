public class GameWinner extends Tie {
    private Map map = new Map();
    private int GameWinner = 0;
    private int score = 0;
    private int nuliukai = 5;
    private int kryziukai = 6;
    private Layout Layout = new Layout();


    public void GameDecider(Map map) {
        this.map = map;
        for (int i = 0; i < map.getHeight(); i += 2) {
            for (int j = 1; j < map.getWidth(); j += 4) {
                checkAndOutput(i, j);
            }
            setGameWinner(0);
            setScore(0);
        }

        for (int j = 1; j < map.getWidth(); j += 4) {
            for (int i = 0; i < map.getHeight(); i += 2) {
                checkAndOutput(i, j);
            }
            setGameWinner(0);
            setScore(0);
        }

        if (map.getCoords(0, 1) == map.getCoords(2, 5) && map.getCoords(0, 1) == map.getCoords(4, 9) && map.getCoords(0, 1) != 0) {
            if (map.getCoords(0, 1) == getNuliukai()) {
                laimetojas("Jus laimejote");
            } else {
                laimetojas("Laimejo kryziukai");
            }
        }

        if (map.getCoords(4, 1) == map.getCoords(2, 5) && map.getCoords(4, 1) == map.getCoords(0, 9) && map.getCoords(4, 1) != 0) {
            if (map.getCoords(4, 1) == getNuliukai()) {
                laimetojas("Jus laimejote");
            } else {
                laimetojas("Laimejo kryziukai");
            }
        }
    }


    public void checkAndOutput(int i, int j) {
        if (getGameWinner() == 0) {
            setGameWinner(map.getCoords(i, j));
        } else if (map.getCoords(i, j) == getGameWinner()) {
            setScore(getScore()+1);
            if (getScore() == 2) {
                if (getGameWinner() == getKryziukai()) {
                    laimetojas("Laimejo kryziukai");
                } else {
                    laimetojas("Jus laimejote");
                }
            }
        }
    }

    public int getGameWinner() {
        return GameWinner;
    }

    public void setGameWinner(int gameWinner) {
        GameWinner = gameWinner;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNuliukai() {
        return nuliukai;
    }


    public int getKryziukai() {
        return kryziukai;
    }

    public Layout getLayout() {
        return Layout;
    }

    public void laimetojas(String laimetojas){
        getLayout().printLayout(map);
        System.out.println(laimetojas);
        System.exit(0);
    }
}
