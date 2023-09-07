package ch15collection.exam.no7;

import java.util.Objects;

public class Board {
    private String title;
    private String content;

    public Board(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Board board = (Board) object;
        return Objects.equals(title, board.title) && Objects.equals(content, board.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content);
    }
}
