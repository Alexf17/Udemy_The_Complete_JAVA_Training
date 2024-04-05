package org.example.Game;

import java.util.ArrayList;
import java.util.List;

public class Teams<T extends NewPlayer> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();

    public Teams(String teamName) {
        this.teamName = teamName;
    }
    public void addTeamMember(T player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }
    public void listTeamMembers(){
        System.out.println(teamName);
        for(T player: teamMembers){
            System.out.println(player.getName());
        }
    }

    @Override
    public String toString() {
        return teamName;
    }
}
