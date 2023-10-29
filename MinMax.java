public class MinMax {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR 1: Keine Argumente übergeben.");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int currentNum = Integer.parseInt(args[i]);
            if (currentNum < min) {
                min = currentNum;
            }
            if (currentNum > max) {
                max = currentNum;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
