package structure_patterns_.facade;

public class FacadeWorkFlow {     // задача простая - компановка всех наших элементов Job, BugTracker, Developer ...
    // создаем экземпляры каждого
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    // гвоздь программы
    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
