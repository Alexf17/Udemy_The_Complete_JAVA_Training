package org.example.Game;

public class Main {
    public static void main(String[] args) {
        NewTeam germany = new NewTeam("Germany");
        NewTeam poland = new NewTeam("Poland");
        scoreResult(germany, 100, poland, 90);

        Teams<NewTeamPlayer> germanyTeam = new Teams<>("Germany");
        Teams<NewTeamPlayer> polandTeam = new Teams<>("Poland");
        scoreResult(germanyTeam, 100, polandTeam, 90);

        var player1 = new NewTeamPlayer("Smith", "wer");
        var player2 = new NewTeamPlayer("John", "wer");
        germanyTeam.addTeamMember(player1);
        germanyTeam.addTeamMember(player2);

        var player3 = new NewTeamPlayer("Simon", "wer");
        var player4 = new NewTeamPlayer("Ellis", "wer");
        polandTeam.addTeamMember(player1);
        polandTeam.addTeamMember(player2);
        polandTeam.listTeamMembers();

        Teams<NewPlayer> england = new Teams<>("England");
        england.addTeamMember(new NewPlayer() {

            @Override
            public String getName() {
                return "Joe";
            }
        });
        england.listTeamMembers();


        Teams<NewPlayer> spain = new Teams<>("Spain");
        spain.addTeamMember(new NewPlayer() {

            @Override
            public String getName() {
                return "Hose";
            }
        });
        spain.listTeamMembers();

        scoreResult(england,150,spain,180);
    }

    private static String getMessage(int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            return "beat";
        } else if (ourScore == theirScore) {
            return "tied with";
        } else {
            return "lost to";
        }
    }

    public static void scoreResult(NewTeam team1, int team1Score, NewTeam team2, int team2Score) {
        team1.setScore(team1Score, team1Score);
        team2.setScore(team2Score, team1Score);
        System.out.printf("%s %s %s%n", team1, getMessage(team1Score, team2Score), team2);
    }

    public static void scoreResult(Teams<? extends NewPlayer> team1, int team1Score,
                                   Teams<? extends NewPlayer> team2, int team2Score) {
        System.out.printf("%s %s %s%n", team1, getMessage(team1Score, team2Score), team2);
    }
}
