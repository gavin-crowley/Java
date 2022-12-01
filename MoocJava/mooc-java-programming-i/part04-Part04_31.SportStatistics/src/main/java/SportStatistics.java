
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamNameInput = scan.nextLine();

        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String homeTeamNameFile = parts[0];
                String visitorTeamNameFile = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitorPoints = Integer.valueOf(parts[3]);

                if (homeTeamNameFile.equals(teamNameInput)) {
                    gameCount++;
                    if (homePoints > visitorPoints) {
                        winCount++;
                    } else if (homePoints < visitorPoints) {
                        lossCount++;
                    }
                }
                
                if (visitorTeamNameFile.equals(teamNameInput)) {
                    gameCount++;
                    if (homePoints < visitorPoints) {
                        winCount++;
                    } else if (homePoints > visitorPoints) {
                        lossCount++;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);

    }

}
