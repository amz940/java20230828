package ch15collection.exam.no7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        for(Board board : list){
            System.out.println(board.getTitle() + "-" + board.getContent());
        }

        boolean contains = list.contains(new Board("제목1", "내용1"));
        System.out.println("contains = " + contains);

        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민"));
        list2.add(new MyClass03("강인"));

        boolean c2 = list2.contains(new MyClass03("흥민"));
        System.out.println("c2 = " + c2);
    }
}

class BoardDao{
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1","내용1"));
        list.add(new Board("제목2","제목2"));
        list.add(new Board("제목3","제목3"));
        return list;
    }

}

class MyClass03{
    private String name;

    public MyClass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyClass03 myClass03 = (MyClass03) object;
        return Objects.equals(name, myClass03.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}