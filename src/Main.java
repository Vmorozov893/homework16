//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String login = "vladik_221";
        String password = "password";
        String confirmPassword = "pasword";
        Validator.validate(login,password,confirmPassword);
        System.out.println("Валидация прошла успешно!");
    }
}