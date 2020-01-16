package behavioral_patterns.State;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
// МАШИНА СОСТОЯНИЙ
    public void changeActivity() {
        if (activity instanceof Sleeping) { // если активити является представителем класса Sleeping
            setActivity(new Training());  // тогда мы устанавливаем активити Training
        } else if (activity instanceof Training) {
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        }
    }
        public void justDoIt(){
            activity.justDoIt();
        }
    }

