package behavioral_patterns.State;

public class Reading implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Reading a book...");
    }
}
