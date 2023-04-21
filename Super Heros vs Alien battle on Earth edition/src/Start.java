public class Start  {
    public Start(String start) throws StartException {
        if (!start.equalsIgnoreCase("START")) {
            throw new StartException("");
        }
    }
}
