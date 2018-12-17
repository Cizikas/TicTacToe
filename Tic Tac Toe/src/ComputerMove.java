import java.util.Random;

public class ComputerMove {

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    private boolean repeat;
    private int kryziukai = 6;
    private Map map = new Map();

    public boolean isRepeat() {
        return repeat;
    }

    public int getKryziukai() {
        return kryziukai;
    }


    public void ComputerMove(Map map) {
        this.map = map;
        do {
            int rn = randomNumber(9);
            switch (rn) {
                case 0:
                    caseSalyga(0,1);
                    break;
                case 1:
                    caseSalyga(0,5);
                    break;
                case 2:
                    caseSalyga(0,9);
                    break;
                case 3:
                    caseSalyga(2,1);
                    break;
                case 4:
                    caseSalyga(2,5);
                    break;
                case 5:
                    caseSalyga(2,9);
                    break;
                case 6:
                    caseSalyga(4,1);
                    break;
                case 7:
                    caseSalyga(4,5);
                    break;
                case 8:
                    caseSalyga(4,9);
                    break;
            }
        } while (isRepeat());
    }

    private static int randomNumber(int iki) {

        Random r = new Random();
        return r.nextInt(iki);

    }

    public void caseSalyga(int a, int b){
        if (map.getCoords(a, b) == 0) {
            map.setCoords(a, b, getKryziukai());
            setRepeat(false);
        } else {
            setRepeat(true);
        }
    }
}
