package behavioral_patterns.Strategy;

public class DeveloperRunner {
     public static void main(String[] args) {
         Developer developer = new Developer(); // создаем разработчика

         developer.setActivity(new Sleeping()); // устанавливаем активность
         developer.executeActivity();           // просим этим методом разработчика выполнить активность

         developer.setActivity(new Training());
         developer.executeActivity();

         developer.setActivity(new Coding());
         developer.executeActivity();

         developer.setActivity(new Reading());
         developer.executeActivity();

         developer.setActivity(new Sleeping());
         developer.executeActivity();
     }
}
