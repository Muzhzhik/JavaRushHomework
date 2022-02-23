package alexey.exceptionhm;

import java.util.List;

public class ReadFromDatabaseDao {
    public static String getById(int id) throws RecordNotFound{
        if (id < 20 && id > 10) {
            throw new RecordNotFound("Record not found");
        }
        return "user";
    }

    public static List<String> getAll() throws EmptyData {
        throw new EmptyData();
    }
}
