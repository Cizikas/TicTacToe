public class Layout {
    private Map map;
    int nuliukai = 5;
    int kryziukai = 6;

    public void printLayout(Map map) {
        this.map = map;

        System.out.println("Indeksu numeracija");
        for (int l = 0; l < 2; l++) {
            int index = 1;
            for (int i = 0; i < map.getHeight(); i++) {
                for (int j = 0; j < map.getWidth(); j++) {
                    if (l == 0 && ((i == 0 && j == 1) || (i == 0 && j == 5) || (i == 0 && j == 9) || (i == 2 && j == 1) || (i == 2 && j == 5) || (i == 2 && j == 9) || (i == 4 && j == 1) || (i == 4 && j == 5) || (i == 4 && j == 9))) {
                        System.out.print(index);
                        index++;
                    } else if (map.getCoords(i, j) == 1) {
                        System.out.print("-");
                    } else if (map.getCoords(i, j) == 2) {
                        System.out.print("+");
                    } else if (map.getCoords(i, j) == 0) {
                        System.out.print(" ");
                    } else if (map.getCoords(i, j) == 3) {
                        System.out.print("|");
                    } else if (map.getCoords(i, j) == nuliukai) {
                        System.out.print("O");
                    } else if (map.getCoords(i, j) == kryziukai) {
                        System.out.print("X");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}