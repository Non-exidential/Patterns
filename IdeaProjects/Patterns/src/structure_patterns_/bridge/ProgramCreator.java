package structure_patterns_.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()), // заказывает нужных разработчиков, и они пишут нам код
                new StockExchange(new CppDeveloper())
        };

        for(Program program: programs){
            program.developProgram();
        }
    }
}
