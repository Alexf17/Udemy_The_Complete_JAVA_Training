package org.example.Game;

public record NewTeamPlayer(String name, String role) implements NewPlayer {
    public String getName(){
        return name;
    }
}
