package alexey.exceptionhm;

import java.util.List;

public class ReadFromDatabaseService {
    public static String getById(int id) throws RuntimeException{
        if (id < 20 && id > 10) {
            throw new RuntimeException("Record not found");
        }
        return "user1";
    }

    public static List<String> getAll() throws RuntimeException {
        throw new RuntimeException();
    }
}
