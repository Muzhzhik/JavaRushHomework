package alexey.exceptionhm;

public class MainExp {
    public static void main(String[] args) {
        try {
            System.out.println(ReadFromDatabaseDao.getById(12));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
