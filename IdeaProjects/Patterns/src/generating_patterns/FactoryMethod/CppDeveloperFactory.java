package generating_patterns.FactoryMethod;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new Cpp_Developer();
    }
}
