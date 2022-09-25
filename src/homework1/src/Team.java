package homework1.src;

public class Team {
    private String name;
    private Climber[] climbers;

    public Team(String name, Climber[] climbers) {
        this.name = name;
        this.climbers = climbers;
    }
    public String getName() {
        return name;
    }
    public Climber[] getClimbers() {
        return climbers;
    }
}
