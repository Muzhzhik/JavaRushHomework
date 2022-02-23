package vladimir.roleshm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<Integer, String> USERS = new HashMap<>() {{
        put(1, "user1");
        put(2, "user2");
        put(3, "user3");
        put(4, "user4");
        put(5, "user5");
        put(6, "user6");
        put(7, "user7");
        put(8, "user8");
        put(9, "user9");
        put(10, "user10");
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name:");
        String userName = scanner.nextLine();
        AuthorizationRoles role = authorizeUser(userName);

        System.out.println("Enter id:");
        int id = scanner.nextInt();
        System.out.println(findData(role, id));
    }

    private static AuthorizationRoles authorizeUser(String userName) {
        if (userName.trim().equals("")) { //UserName is empty
            throw new Exception401(); // throw Not authenticated
        }
        AuthorizationRoles result;
        if (userName.equalsIgnoreCase(AuthorizationRoles.USER.toString())) { // if user
            result = AuthorizationRoles.USER;
        } else if (userName.equalsIgnoreCase(AuthorizationRoles.ADMIN.toString())) { // if admin
            result = AuthorizationRoles.ADMIN;
        } else { // other user
            throw new UserNotFoundException();
        }
        return result;
    }

    private static String findData(AuthorizationRoles role, int id) {
        if (role == AuthorizationRoles.USER && id >= 6) {
            throw new Exception403();
        }
        String result = USERS.get(id);

        if (result == null) {
            throw new Exception404();
        }
        return result;
    }
}
