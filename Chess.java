public class Chess { 
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("(ERROR) Keine Argumente angegeben.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        

        if (n <= 0) {
            System.out.println("(ERROR) Die Zahl muss positiv sein.");
            return;
        }

        drawChessBoard(n);
    }

    public static void drawChessBoard(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



