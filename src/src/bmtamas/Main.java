package src.bmtamas;

public class Main {

    public static void main(String[] args) {
        GameSpace gamespace = new GameSpace();
        initializeGameVariables(gamespace);
        setUpTurn();
    }

    private static void initializeGameVariables(GameSpace gamespace) {
        gamespace.newGame();
    }

    private static void setUpTurn() {

    }


}
