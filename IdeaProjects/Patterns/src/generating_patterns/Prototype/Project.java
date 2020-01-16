package generating_patterns.Prototype;

public class Project implements Copyable{
    private int id;
    private String projectName;
    private String sourceCode;

    public Project(int id, String projectName, String sourceCode) { // делаем конструктор
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    // не забываем про геттеры и сеттеры

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }


    // реализуем сам метод тут
    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, sourceCode); // создает экземпляр проекта, который в конструктор принимает поля нашего имеющегося проекта
        return copy; // возвращает копию данного проекта
    }

    @Override
    public String toString() { // используется для получения строкового представления объекта
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
