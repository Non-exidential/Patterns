package behavioral_patterns.Iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "MySQL", "C++"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Mukovnin Ilya", skills);//создаем разработчика и заполняем переменные
                                                                                        // имя и вставляем массив skills
        Iterator iterator = javaDeveloper.getIterator();   // создаем экземляр итератора
        System.out.println("Developer:" + javaDeveloper.getName()); // выводим в консоль
        System.out.println("Skills:");

        while (iterator.hasNext()) { //ЧТОБЫ ПОЛУЧИТЬ ВСЕ НАВЫКИ ПОСЛЕДОВАТЕЛЬНО
            System.out.println(iterator.next().toString() + " ");  // ВЫВОЛДИМ В КОНСОЛЬ
        }
    }
}
