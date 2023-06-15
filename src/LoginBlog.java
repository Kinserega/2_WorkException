import exception.WrongLoginException;
import exception.WrongPasswordException;

public class LoginBlog {
    public void checkLoginTry(String login, String password, String confirmPassword) throws WrongPasswordException,WrongLoginException {
        LoginServiceImpl loginService = new LoginServiceImpl();
        try {
            loginService.loginMethod(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new WrongLoginException("Логин или пароль введен не корректно");
        } catch (WrongPasswordException ex) {
            throw new WrongPasswordException("Пароли не совпадают");
        } finally {
            System.out.println("Программа отработала");
        }
    }
}
