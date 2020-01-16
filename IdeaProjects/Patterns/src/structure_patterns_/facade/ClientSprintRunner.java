package structure_patterns_.facade;

public class ClientSprintRunner {
    public static void main (String[] args) {

        FacadeWorkFlow facadeWorkFlow = new FacadeWorkFlow();

        facadeWorkFlow.solveProblems();

        // вместо всего, что ниже, мы лишь обращаемся к нашему фасаду и используем нужный нам метод


       /* Job job = new Job();
        job.doJob();
        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();
        Developer developer = new Developer();
        developer.doJobBeforeDeadline(bugTracker);

        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker); */
    }
}
