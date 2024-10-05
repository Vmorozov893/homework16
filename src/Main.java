import exeption.WrongLoginException;
import exeption.WrongPasswordException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String login = "vladik_221";
        String password = "password";
        String confirmPassword = "pasword";

        try {Validator.validate(login,password,confirmPassword);
        } catch (WrongLoginException wrongLoginException){
            System.out.println("Произошла ошибка при проверке логина: " + wrongLoginException.getMessage());
        } catch (WrongPasswordException wrongPasswordException){
            System.out.println("Произошла ошибка при проверке пароля: " + wrongPasswordException.getMessage());
        } finally {
            System.out.println("Валидация завершена!");
        }

    }
}