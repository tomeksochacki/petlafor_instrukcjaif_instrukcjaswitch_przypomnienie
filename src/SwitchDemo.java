class SwitchDemo {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++)
            switch (i){
                case 1:
                    System.out.println("i jest równe 1");
                    break;
                case 2:
                    System.out.println("i jest równe 2");
                    break;
                case 3:
                    System.out.println("i jest równe 3");
                    break;
                case 4:
                    System.out.println("i jest równe 4");
                    break;
                default:
                    System.out.println("i jest równe lub większe od 5");
                    break;
            }

    }
}
