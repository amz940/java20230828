package ch08interface.book.sec08;

public interface RemoteControl {
    void turnOn();
    void turnOff();
}

interface Searchable{
    void search(String url);    // public abstract 가 포함되어 있다
}