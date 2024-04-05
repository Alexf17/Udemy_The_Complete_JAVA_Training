package org.example.Game;

import java.util.ArrayList;
import java.util.List;

public class NewTeam {
    private String teamName;
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    private List<NewTeamPlayer> teamMembers = new ArrayList<>();

    public NewTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(NewTeamPlayer player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName);
        for (NewTeamPlayer player : teamMembers) {
            System.out.println(player);
        }
    }

    public int getRanking() {
        return (totalWins * 2) + totalTies;
    }

    public void setScore(int team1, int team2) {
        if (team1 > team2) {
            this.totalWins += 1;
        } else if (team1 == team2) {
            this.totalTies += 1;
        } else {
            this.totalLosses += 1;
        }

    }

    @Override
    public String toString() {
        return teamName + " : " + getRanking();
    }
}
