package app;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        int length = 18;
        String resultGenerate = passwordGenerator.generatePassword(length);
        System.out.println("Згенерований пароль: " + resultGenerate);
    }
}