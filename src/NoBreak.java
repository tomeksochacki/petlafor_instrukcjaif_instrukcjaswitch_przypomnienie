class NoBreak {
    public static void main(String[] args) {
        int i;
        for (i=0; i<5;i++){
            switch (i){
                case 0:
                    System.out.println("i jest równe 0");
                case 1:
                    System.out.println("i jest równe 1");
                case 2:
                    System.out.println("i jest równe 2");
                case 3:
                    System.out.println("i jest równe 3");
                case 4:
                    System.out.println("i jest równe 4");
            }
            System.out.println();
        }
    }
}
