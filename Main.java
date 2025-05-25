package Project;

public class Main {
    public static void main(String[] args) {
        OptionMenu optionMenu = new OptionMenu();
        try {
            optionMenu.getLogin();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}