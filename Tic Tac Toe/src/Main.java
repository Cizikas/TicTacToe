
public class Main {


    public static void main(String args[]) {


        System.out.println("Jus pradedate zaidima");
        int ejimusk = 0;


        Map map = new Map();

        UserMove UM = new UserMove();
        GameWinner GW = new GameWinner();
        ComputerMove CM = new ComputerMove();
        Layout Layout = new Layout();

        while (true) {
            Layout.printLayout(map);
            UM.UserMove(map);
            GW.GameDecider(map);
            ejimusk++;
            GW.tie(ejimusk);
            CM.ComputerMove(map);
            GW.GameDecider(map);
        }

    }
}