public class Player {

    private final int playerNumber;
    private final String position;

    public Player(int playerNumber, String position) {
        this.playerNumber = playerNumber;
        this.position = position;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNumber=" + playerNumber +
                ", position='" + position + '\'' +
                '}';
    }
}
