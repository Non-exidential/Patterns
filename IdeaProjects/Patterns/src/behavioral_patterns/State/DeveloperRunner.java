package behavioral_patterns.State;

public class DeveloperRunner {
    public static void main(String[] args) {
        Activity activity = new Sleeping(); // создаем активность
        Developer developer = new Developer(); // создаем разработчика

        developer.setActivity(activity); 

        for (int i = 0;i<10;i++){
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
