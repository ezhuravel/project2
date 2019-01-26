package project;
import java.util.ArrayList;

public abstract class GameFactory {
    Player[] playerArray;

    public void playGame(int moves){

        while (moves > 0){
            System.out.println(playerArray[0].move());
            System.out.println(playerArray[0].attack());

            System.out.println(playerArray[1].move());
            System.out.println(playerArray[1].attack());

            moves--;
        }
    }

    public abstract void SetUpGame();

}
