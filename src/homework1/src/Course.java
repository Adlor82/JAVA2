package homework1.src;

public class Course {

    String result;

    private int hill;
    private int cleft;
    private int trail;

    public Course(int hill, int cleft, int trail) {
        this.hill = hill;
        this.cleft = cleft;
        this.trail = trail;
    }

    public String doIt(Team team){
        result = "Комманда: "+ team.getName()+ " " + '\n';
        for(Climber climber: team.getClimbers()){
            result += "Скалолаз: " + climber.getName() + " " + '\n';
                    int value = climber.getClimberPower();
                    testHill(value);
                    testCleft(value);
                    testTrail(value);
        }
        return result;
    }

    private void testHill(int value) {
        if(value<hill) result = result + "Гора - осилил "+ '\n';
        else result += "Гора - не осилил "+ '\n';
    }

    private void testCleft(int value) {
        if(value<cleft) result = result + "Разлом - перепрыгнул "+ '\n';
        else result += "Разлом - не перепрыгнул "+ '\n';
    }

    private void testTrail(int value) {
        if(value<trail) result = result + "Тропа - прошел "+ '\n';
        else result += "Тропа - не прошел "+ '\n';
    }


}
