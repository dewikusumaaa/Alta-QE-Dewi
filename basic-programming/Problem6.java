 class Problem6 {
     private static void DrawXYZ(int height) {
         int k = 1;

         for (int i = 1; i <= height; i++) {
             for (int j = 1; j <= height; j++) {

                 if (k % 3 == 0) {
                     System.out.print("X ");
                 } else if (k % 2 == 0) {
                     System.out.print("Z ");
                 } else {
                     System.out.print("Y ");
                 }
                 k++;
             }
             System.out.println("");
         }
             System.out.print("\n");
             }


     public static void main(String[] args) {
         DrawXYZ(3);

         DrawXYZ(5);

         DrawXYZ(1);
     }
 }
