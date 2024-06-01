package sample;
import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            int playerId = scanner.nextInt();
            String skill = scanner.next();
            String level = scanner.next();
            int points = scanner.nextInt();
            players[i] = new Player(playerId, skill, level, points);
        }

        String skill = scanner.next();
        String level = scanner.next();

        int totalPoints = findPointsForGivenSkill(players, skill);
        if (totalPoints > 0) {
            System.out.println(totalPoints);
        } else {
            System.out.println("The given Skill is not available");
        }

        Player player = getPlayerBasedOnLevel(players, level, skill);
        if (player != null) {
            System.out.println(player.getPlayerId());
        } else {
            System.out.println("No player is available with specified level, skill, and eligibility points");
        }

        scanner.close();
    }

    public static int findPointsForGivenSkill(Player[] players, String skill) {
        int totalPoints = 0;
        for (Player player : players) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                totalPoints += player.getPoints();
            }
        }
        return totalPoints;
    }

    public static Player getPlayerBasedOnLevel(Player[] players, String level, String skill) {
        for (Player player : players) {
            if (player.getLevel().equalsIgnoreCase(level) && player.getSkill().equalsIgnoreCase(skill)
                    && player.getPoints() >= 20) {
                return player;
            }
        }
        return null;
    }
}
