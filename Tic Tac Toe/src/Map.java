public class Map {
    int map[][] = new int[][]{
            {0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0,},
            {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1,},
            {0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0,},
            {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1,},
            {0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0,},
    };

    public int getHeight() {
        return map.length;
    }

    public int getWidth() {
        return map[0].length;
    }

    public int getCoords(int x, int y) {
        return map[x][y];
    }

    public void setCoords(int x, int y, int newValue) {
        map[x][y] = newValue;
    }
}
