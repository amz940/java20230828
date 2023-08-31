package ch08interface.exercise.p07;

public class DaoExmaple {
    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork( new OracleDao());
        dbWork( new MySqlDao());

    }
}
