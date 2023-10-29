public class karakok {
    public static void main(String[] test01) {
        // 1. yol    
        //double p = 2;
        //double q = -2.5;
        
        // 2.yol ***************
        double p = Double.parseDouble(test01[0]);
        double q = Double.parseDouble(test01[1]);
        //******************************
        double x = Math.sqrt(Math.pow(p, 2) / 4.0 - q);

        System.out.println("Karakoku = " + x);
    }
}
