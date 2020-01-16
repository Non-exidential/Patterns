package behavioral_patterns.Iterator;

public class JavaDeveloper implements Collection {
    private String name; // имя разработчика
    private String[] skills; // массив его навыков

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{ //внутренний класс
        int index;

        @Override
        public boolean hasNext() {
            if(index<skills.length){ //если индекс меньше, чем длина массива skills
                return true; //еще есть следующий объект
            }
                return false; // объекты закончились
        }

        @Override
        public Object next() {
            return skills[index++]; // элемент массива skills по индексу, и переключаемся на следующий объект
        }
    }
}
