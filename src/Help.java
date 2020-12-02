class Help {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Informacja o składni instrukcji:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Wybierz numer instrukcji:");

        char number;
        number = (char) System.in.read();

        switch (number) {
            case '1':
                System.out.println("Instrukcja warunkowa if:\n");
                System.out.println("if(warunek) instrukcja;");
                System.out.println("else instrukcja;");
                break;
            case '2':
                System.out.println("Instrukcja wyboru switch:\n");
                System.out.println("switch (wyrażenie) {");
                System.out.println("case stała:");
                System.out.println("sekwencja instrukcji;");
                System.out.println("break;");
                System.out.println("//...");
                System.out.println("}");
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }
    }
}
