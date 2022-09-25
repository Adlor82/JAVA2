package homework1.src;

public class Main {

    public static void main(String[] args) {

        Climber[] climber = new Climber[4];
        climber[0] = new Climber("Иван", 55);
        climber[1] = new Climber("Андрей", 50);
        climber[2] = new Climber("Юра", 53);
        climber[3] = new Climber("Вася", 60);

        Team team = new Team("Скалолазы", climber);

        Course course = new Course(20, 3, 30);

        String result = course.doIt(team);

        System.out.println(result);

    }
}
