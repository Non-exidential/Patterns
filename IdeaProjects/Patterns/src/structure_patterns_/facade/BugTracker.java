package structure_patterns_.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {         //getter который узнает, активен ли спринт
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sptint is not active");
        activeSprint = false;
    }

}
