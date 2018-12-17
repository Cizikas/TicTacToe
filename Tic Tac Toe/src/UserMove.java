import java.util.Scanner;

public class UserMove {
    int n;
    private boolean repeat;
    private int nuliukai = 5;
    Map map = new Map();
    Scanner reader = new Scanner(System.in);


    public void UserMove(Map map) {
        this.map = map;
        System.out.println("Padekite savo zenkla irasydami indeksa pagal lentele auksciau(0 - isjungti)");
        do {
            n = reader.nextInt();
            switch (n) {
                case 1:
                    cases(0, 1);
                    break;
                case 2:
                    cases(0, 5);
                    break;
                case 3:
                    cases(0, 9);
                    break;
                case 4:
                    cases(2, 1);
                    break;
                case 5:
                    cases(2, 5);
                    break;
                case 6:
                    cases(2, 9);
                    break;
                case 7:
                    cases(4, 1);
                    break;
                case 8:
                    cases(4, 5);
                    break;
                case 9:
                    cases(4, 9);
                    break;
                case 0:
                    System.out.println("Zaidimas isjungiamas");
                    System.exit(0);
                default:
                    System.out.println("Tokia pozicija neegzistuoja");
                    setRepeat(true);
            }
        } while (repeat);
    }

    public void cases(int x, int y) {
        if (map.getCoords(x, y) == 0) {
            map.setCoords(x, y, getNuliukai());
            setRepeat(false);
        } else {
            System.out.println("Si vieta uzimta");
            setRepeat(true);
        }
    }

    public int getNuliukai() {
        return nuliukai;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }
}
