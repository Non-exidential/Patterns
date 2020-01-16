package behavioral_patterns.Iterator;

public interface Iterator {
    public boolean hasNext(); //возвращает логическое значение, есть ли следующий объект в нашем массиве

    public Object next();
}
