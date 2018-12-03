import java.util.Random;

public class ComputerMove {

        int n;
        boolean repeat;
        int kryziukai = 6;
        Map map = new Map();


        public void ComputerMove (Map map) {
            this.map = map;
            do {
                int rn = randomNumber(9);
                switch (rn) {
                    case 0:
                        if (map.getCoords(0,1) == 0) {
                            map.setCoords(0,1,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 1:
                        if (map.getCoords(0,5) == 0) {
                            map.setCoords(0,5,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 2:
                        if (map.getCoords(0,9) == 0) {
                            map.setCoords(0,9,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 3:
                        if (map.getCoords(2,1) == 0) {
                            map.setCoords(2,1,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 4:
                        if (map.getCoords(2,5) == 0) {
                            map.setCoords(2,5,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 5:
                        if (map.getCoords(2,9) == 0) {
                            map.setCoords(2,9,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 6:
                        if (map.getCoords(4,1) == 0) {
                            map.setCoords(4,1,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 7:
                        if (map.getCoords(4,5) == 0) {
                            map.setCoords(4,5,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 8:
                        if (map.getCoords(4,9) == 0) {
                            map.setCoords(4,9,kryziukai);
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                }
            }while (repeat);
        }

    private static int randomNumber(int iki) {

        Random r = new Random();
        return r.nextInt(iki);

    }
}
