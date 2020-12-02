class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        char wymaganyZnak = 'K';
        System.out.println("Pomyślałem sobie literę z zakresu od A do Z. Spróbuj ją odgadnąć.");
        System.out.println("Wprowadź literę z zakresu od A do Z.");

        ch = (char)System.in.read();
        if (ch == wymaganyZnak){
            System.out.println("Dobrze, to ta litera.");
        } else {
            System.out.println("To nie ten znak! Pudło!");
            if (ch<wymaganyZnak){
                System.out.println("Za nisko.");
            } else {
                System.out.println("Za wysoko.");
            }
        }
    }
}
