package project;

// Sets up human vs computer game
public class HumanGameFactory extends GameFactory {

    @Override
    public void SetUpGame() {
        playerArray = new Player[2];

        playerArray[0] = new HumanPlayer();
        playerArray[1] = new ComputerPlayer();
    }
}
