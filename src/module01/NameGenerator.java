package module01;

import java.util.Scanner;
import java.util.Random;

public class NameGenerator {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int magicNum;
    static String[] firstNames = {"Eleanor", "Quentin", "Isabella", "Maxwell", "Aria", "Xavier", "Olivia", "Nathaniel",
            "Zara", "Caleb", "Sophia", "Ezra", "Amelia", "Liam", "Ava", "Gabriel", "Penelope", "Owen", "Scarlett",
            "Finn", "Mia", "Sebastian", "Harper", "Leo", "Stella", "Jackson", "Luna", "Elijah", "Grace", "Mason",
            "Chloe", "Lucas", "Madison", "Evelyn", "Wyatt", "Avery", "Daniel", "Hazel", "Logan", "Nova", "Carter",
            "Ella", "Henry", "Sofia", "Eva", "Colton", "Victoria", "Lila", "Landon", "Aiden"};
    static String[] lastNames = {"Anderson", "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis",
            "Garcia", "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Taylor",
            "Moore", "Jackson", "Martin", "Lee", "Perez", "Thompson", "White", "Harris", "Sanchez", "Clark", "Ramirez",
            "Lewis", "Robinson", "Walker", "Hall", "Young", "Allen", "King", "Wright", "Scott", "Torres", "Nguyen",
            "Hill", "Flores", "Green", "Adams", "Nelson", "Baker", "Evans", "Turner", "Diaz", "Parker", "Collins"};


    public static void main(String[] args) {
        System.out.print("How many names you want to generate: ");
        magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < magicNum; i++) {
            System.out.printf("%s %s\n", firstNames[rand.nextInt(firstNames.length)], lastNames[rand.nextInt(lastNames.length)]);
        }
    }
}
