public class StartGame  {
    public StartGame(String start) throws StartGameException {
        if (!start.equalsIgnoreCase("START")) {
            throw new StartGameException("");
        }
    }
}
