import java.util.Random;
import java.util.Scanner;
public class Main {

    static int MAP[][] = new int[][]{
            {0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0,},
            {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1,},
            {0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0,},
            {1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1,},
            {0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0,},
    };

    public static void main(String args[]) {



        Scanner reader = new Scanner(System.in);
        System.out.println("Jus pradedate zaidima");
        int n;
        int nuliukai = 5;
        int kryziukai = 6;
        int gameWinner = 0;
        int score = 0;
        int ejimusk = 0;
        boolean repeat = true;

        while (true) {
            System.out.println("Indeksu numeracija");
            for (int l = 0; l < 2; l++) {
                int index = 1;
                for (int i = 0; i < MAP.length; i++) {
                    for (int j = 0; j < MAP[0].length; j++) {
                        if (l == 0 && ((i == 0 && j == 1) || (i == 0 && j == 5) || (i == 0 && j == 9) || (i == 2 && j == 1) || (i == 2 && j == 5) || (i == 2 && j == 9) || (i == 4 && j == 1) || (i == 4 && j == 5) || (i == 4 && j == 9))) {
                            System.out.print(index);
                            index++;
                        } else if (MAP[i][j] == 1) {
                            System.out.print("-");
                        } else if (MAP[i][j] == 2) {
                            System.out.print("+");
                        } else if (MAP[i][j] == 0) {
                            System.out.print(" ");
                        } else if (MAP[i][j] == 3) {
                            System.out.print("|");
                        } else if (MAP[i][j] == nuliukai) {
                            System.out.print("O");
                        } else if (MAP[i][j] == kryziukai) {
                            System.out.print("X");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }

            System.out.println("Padekite savo zenkla irasydami indeksa pagal lentele auksciau");
            do {
                n = reader.nextInt();
                switch (n) {
                    case 1:
                        if (MAP[0][1] == 0) {
                            MAP[0][1] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 2:
                        if (MAP[0][5] == 0) {
                            MAP[0][5] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 3:
                        if (MAP[0][9] == 0) {
                            MAP[0][9] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 4:
                        if (MAP[2][1] == 0) {
                            MAP[2][1] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 5:
                        if (MAP[2][5] == 0) {
                            MAP[2][5] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 6:
                        if (MAP[2][9] == 0) {
                            MAP[2][9] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 7:
                        if (MAP[4][1] == 0) {
                            MAP[4][1] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 8:
                        if (MAP[4][5] == 0) {
                            MAP[4][5] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 9:
                        if (MAP[4][9] == 0) {
                            MAP[4][9] = nuliukai;
                            repeat = false;
                        } else {
                            System.out.println("Si vieta uzimta");
                            repeat = true;
                        }
                        break;
                    case 'q':
                        System.out.println("Zaidimas isjungiamas");
                        System.exit(0);
                    default:
                        System.out.println("Tokia pozicija neegzistuoja");
                        repeat = true;
                }
            }while (repeat);


            for (int i = 0; i < MAP.length; i += 2) {
                for (int j = 1; j < MAP[0].length; j += 4) {
                    if (gameWinner == 0) {
                        gameWinner = MAP[i][j];
                    } else if (MAP[i][j] == gameWinner) {
                        score++;
                        if (score == 2) {
                            if (gameWinner == kryziukai) {
                                System.out.println("Laimejo kryziukai");
                                System.exit(0);
                            } else {
                                System.out.println("Jus laimejote");
                                System.exit(0);
                            }
                        }
                    }
                }
                gameWinner = 0;
                score = 0;
            }

            for (int j = 1; j < MAP[0].length; j += 4) {
                for (int i = 0; i < MAP.length; i += 2) {
                    if (gameWinner == 0) {
                        gameWinner = MAP[i][j];
                    } else if (MAP[i][j] == gameWinner) {
                        score++;
                        if (score == 2) {
                            if (gameWinner == kryziukai) {
                                System.out.println("Laimejo kryziukai");
                                System.exit(0);
                            } else {
                                System.out.println("Jus laimejote");
                                System.exit(0);
                            }
                        }
                    }
                }
                gameWinner = 0;
                score = 0;
            }

            if(MAP[0][1] == MAP[2][5] && MAP[0][1] == MAP[4][9] && MAP[0][1] != 0){
                if(MAP[0][1] == nuliukai){
                    System.out.println("Jus laimejote");
                    System.exit(0);
                } else {
                    System.out.println("Laimejo kryziukai");
                    System.exit(0);
                }
            }

            if(MAP[4][1] == MAP[2][5] && MAP[4][1] == MAP[0][9] && MAP[4][1] != 0){
                if(MAP[4][1] == nuliukai){
                    System.out.println("Jus laimejote");
                    System.exit(0);
                } else {
                    System.out.println("Laimejo kryziukai");
                    System.exit(0);
                }
            }
            ejimusk++;
            if(ejimusk == 5) {
                System.out.println("Lygiosios");
                System.exit(0);
            }

            do {
                int rn = randomNumber(9);
                switch (rn) {
                    case 0:
                        if (MAP[0][1] == 0) {
                            MAP[0][1] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 1:
                        if (MAP[0][5] == 0) {
                            MAP[0][5] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 2:
                        if (MAP[0][9] == 0) {
                            MAP[0][9] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 3:
                        if (MAP[2][1] == 0) {
                            MAP[2][1] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 4:
                        if (MAP[2][5] == 0) {
                            MAP[2][5] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 5:
                        if (MAP[2][9] == 0) {
                            MAP[2][9] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 6:
                        if (MAP[4][1] == 0) {
                            MAP[4][1] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 7:
                        if (MAP[4][5] == 0) {
                            MAP[4][5] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                    case 8:
                        if (MAP[4][9] == 0) {
                            MAP[4][9] = kryziukai;
                            repeat = false;
                        } else {
                            repeat = true;
                        }
                        break;
                }
            }while (repeat);

            for (int i = 0; i < MAP.length; i += 2) {
                for (int j = 1; j < MAP[0].length; j += 4) {
                    if (gameWinner == 0) {
                        gameWinner = MAP[i][j];
                    } else if (MAP[i][j] == gameWinner) {
                        score++;
                        if (score == 2) {
                            if (gameWinner == kryziukai) {
                                System.out.println("Laimejo kryziukai");
                                System.exit(0);
                            } else {
                                System.out.println("Laimejo nuliukai");
                                System.exit(0);
                            }
                        }
                    }
                }
                gameWinner = 0;
                score = 0;
            }

            for (int j = 1; j < MAP[0].length; j += 4) {
                for (int i = 0; i < MAP.length; i += 2) {
                    if (gameWinner == 0) {
                        gameWinner = MAP[i][j];
                    } else if (MAP[i][j] == gameWinner) {
                        score++;
                        if (score == 2) {
                            if (gameWinner == kryziukai) {
                                System.out.println("Laimejo kryziukai");
                                System.exit(0);
                            } else {
                                System.out.println("Laimejo nuliukai");
                                System.exit(0);
                            }
                        }
                    }
                }
                gameWinner = 0;
                score = 0;
            }

            if(MAP[0][1] == MAP[2][5] && MAP[0][1] == MAP[4][9] && MAP[0][1] != 0){
                if(MAP[0][1] == nuliukai){
                    System.out.println("Jus laimejote");
                    System.exit(0);
                } else {
                    System.out.println("Laimejo kryziukai");
                    System.exit(0);
                }
            }

            if(MAP[4][1] == MAP[2][5] && MAP[4][1] == MAP[0][9] && MAP[4][1] != 0){
                if(MAP[4][1] == nuliukai){
                    System.out.println("Jus laimejote");
                    System.exit(0);
                } else {
                    System.out.println("Laimejo kryziukai");
                    System.exit(0);
                }
            }



        }


    }

    private static int randomNumber(int iki) {

        Random r = new Random();
        return r.nextInt(iki);

    }
}