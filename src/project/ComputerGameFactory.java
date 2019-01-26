package project;

public class ComputerGameFactory extends GameFactory {
    @Override
    public void SetUpGame() {
        playerArray = new Player[2];

        playerArray[0] = new ComputerPlayer();
        playerArray[1] = new ComputerPlayer();
    }
}
