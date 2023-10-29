public class Reverse {
    public static void main(String[] args) {
        if (args.length == 0) {
            return; // Wenn keine Argumente übergeben wurden, wird nichts ausgegeben.
        }

        for (int i = args.length - 1 ; i >= 0; i--) {
            System.out.println(args[i]); // Gibt die Argumente in umgekehrter Reihenfolge aus.
        }
    }
}
