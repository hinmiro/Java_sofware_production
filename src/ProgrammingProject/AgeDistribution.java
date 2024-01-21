package ProgrammingProject;

import java.util.Random;

public class AgeDistribution {

    private static int[][] students = new int[2][12];
    private static int[][] scores = new int[2][100];
    private static int[][] ryhmaO = {{0, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99},
            {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public AgeDistribution() {
    }

    void printerScores() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j] + " ");
            }
        }
    }

    void printerStudents() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < ryhmaO[i].length; j++) {
                System.out.println(ryhmaO[i][j] + " ");
            }
        }
    }

    void studentRandomizer() {
        Random rand = new Random();
        for (int i = 0; i < 36; i++) {
            int randAge = rand.nextInt(100);
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 12; y++) {
                    if (randAge == ryhmaO[0][y] || randAge < ryhmaO[0][y] && randAge > ryhmaO[0][y - 1]) {
                        ryhmaO[2][y]++;
                    }
                }
            }
        }


    }

    void randomizer() {
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            int randomAge = rand.nextInt(100);
            for (int x = 0; x < 2; x++) {
                for (int z = 0; z < 100; z++) {
                    if (scores[0][z] == randomAge + 1) {
                        scores[1][z]++;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int startAge = 20;
        int scoreAge = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                if (i == 0) {
                    students[i][j] = 9 * j;
                }
                if (i == 1) {
                    students[i][j] = startAge++;

                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 100; j++) {
                if (i == 0) {
                    scores[i][j] = scoreAge++;
                }
                if (i == 1) {
                    scores[i][j] = 0;
                }
            }
        }

        AgeDistribution distr = new AgeDistribution();
        distr.studentRandomizer();
        System.out.println("\n\n");
        distr.printerStudents();

    }
}
