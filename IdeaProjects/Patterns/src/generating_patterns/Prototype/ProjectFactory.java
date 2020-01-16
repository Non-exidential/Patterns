package generating_patterns.Prototype;
// этот класс штампует наши проекты
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {   // будет возвращать копию имеющегося проекта
        return (Project) project.copy();
    }
}
