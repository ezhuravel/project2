package project;

public abstract class Player {
    String name;

    public String getName(){
        return name;
    }

    public abstract String move();
    public abstract String attack();

}
