package behavioral_patterns.State;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Just sleeping...");
    }
}
