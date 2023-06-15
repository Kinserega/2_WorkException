import exception.WrongLoginException;
import exception.WrongPasswordException;

public class LoginServiceImpl {

    public static void loginMethod(String login, String password, String confirmPassword) {
        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException("Неверно ввели логин");
        }
        if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongPasswordException("Неверно ввели пароль");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}

