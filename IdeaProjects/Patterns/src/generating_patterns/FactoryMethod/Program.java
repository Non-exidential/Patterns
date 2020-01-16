package generating_patterns.FactoryMethod;
// client class
public class Program {
    public static void main(String[] args) {
        // НЕВЕРНЫЙ ПОДХОД:
       // NewJavaDeveloper newJavaDeveloper = new NewJavaDeveloper();
       // newJavaDeveloper.writeJavaCode();
       // NewCppDeveloper newCppDeveloper = new NewCppDeveloper();
        //newCppDeveloper.writeCppCode();

        // БОЛЕЕ ГИБКО НО НЕДОСТАТОЧНО
       // Developer developer = new FactoryJavaDeveloper();  // заменяем разработчика
       // developer.writeCode();

        DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty("php"); // можно просто заменить специальность
        Developer developer = developerFactory.createDeveloper();                     // если нужного разраба нет - остается только создать его класс и вписать сюда и усе

        developer.writeCode();

    }

    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("JAVA")){
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("C++")){
            return new CppDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + "is unknown spicialty");
        }
    }
}
