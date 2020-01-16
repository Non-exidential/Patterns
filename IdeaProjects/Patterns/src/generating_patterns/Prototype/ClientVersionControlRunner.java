package generating_patterns.Prototype;
// клиентский класс, который создает ИЗНАЧАЛЬНЫЙ проект
public class ClientVersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"Project by Mukovnin Ilya", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        // А тут самое главное: Воспользуемся нашей ProjectFactory, чтобы создать копию проекта
        ProjectFactory factory = new ProjectFactory(master); // создаем фабрику и в конструктор пихаем наш проет  master
        Project masterClone = factory.cloneProject(); // создадим новый проект, клонируем проект master, который получила наша фабрика

        System.out.println("\n====================\n");
        System.out.println(masterClone);
    }
}
