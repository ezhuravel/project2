package project;

public class HumanPlayer extends Player {
    @Override
    public String move() {
        // Take user input to make moves
        return "Human player moves";
    }

    @Override
    public String attack() {
        // take user input to attack
        return "Human Player attacks";
    }
}
