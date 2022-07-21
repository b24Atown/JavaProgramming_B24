package office_hours.practice_10_08_2021;

public class Sport {

    private String name;
    private int numOfPlayers;
    private boolean teamBased;

    public Sport(String name, int numOfPlayers, boolean teamBased) {
        this.name = name;
        this.numOfPlayers = numOfPlayers;
        this.teamBased = teamBased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public boolean isTeamBased() {
        return teamBased;
    }

    public void setTeamBased(boolean teamBased) {
        this.teamBased = teamBased;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                ", teamBased=" + teamBased +
                '}';
    }
}
