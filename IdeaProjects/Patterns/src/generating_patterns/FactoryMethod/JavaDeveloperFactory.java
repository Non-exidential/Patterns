package generating_patterns.FactoryMethod;
//это реализация уже второго интерфейса DeveloperFactory
public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new Java_Developer();
    }
}
