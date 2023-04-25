public class PlaytheGame {
    public PlaytheGame(String start) throws PlayTheGameException {
        if (!start.equalsIgnoreCase("START")) throw new PlayTheGameException("");
    }
}
