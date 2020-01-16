package behavioral_patterns.Strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) { // сеттер для активности
        this.activity = activity;
    }

    public void executeActivity(){ // главный сметод выполнения деятельности
        activity.justDoIt();
    }

}
