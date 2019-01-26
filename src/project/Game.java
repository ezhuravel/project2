package project;

public class Game {
    GameFactory gameFactory;

    public void PlayGame(String type){
        if(type == "HumanvComputer"){
            gameFactory = new HumanGameFactory();
        }
        else if(type == "ComputervComputer") {
            gameFactory = new ComputerGameFactory();
        }
        gameFactory.SetUpGame();
        gameFactory.playGame(5);
    }
}
