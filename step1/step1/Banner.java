package step1;
public class Banner {
    private final String _content;
    public Banner(String content) {
        _content = content;
    }
    public void print(int times) {
        // Prints border.
        System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // Prints content.
        for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }

        // Prints border.
        System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    private void printBanner() {
        System.out.print("+");
        for (int i = 0; i < _content.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    private void printContent(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("|" + _content + "|");
        }
    }
}
