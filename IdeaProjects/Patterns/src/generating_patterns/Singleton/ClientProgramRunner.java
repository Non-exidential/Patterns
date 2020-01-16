package generating_patterns.Singleton;

public class ClientProgramRunner { // этот класс будет записывать данные в мой лог
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log");
        ProgramLogger.getProgramLogger().addLogInfo("Second log");
        ProgramLogger.getProgramLogger().addLogInfo("Third log");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
