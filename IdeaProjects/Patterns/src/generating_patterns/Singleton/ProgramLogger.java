package generating_patterns.Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger; // логгирование
    private static String logFile = "This is log file \n\n"; // тут записываются мои действия в программе

    public static synchronized ProgramLogger getProgramLogger(){ // добавил synchronized для многопоточности
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){ // приватный пустой конструктор

    }

    public void addLogInfo(String logInfo){  //logInfo - инфа, которую хотим занести в лог файл
        logFile += logInfo + "\n";
    }

    public void showLogFile(){ // метод для отображения лог файла
        System.out.println(logFile);
    }
}
