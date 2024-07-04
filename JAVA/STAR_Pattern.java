public class STAR_Pattern {
    public static void main(String args[]) {
        String s = "STREAM";
        int row = 6;

        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                char c = s.charAt(j);
                System.out.print(c);
                System.out.print(' ');
            } System.out.println();
        }
    }
}

// public class STAR_Pattern {
//     public static void main(String args[]) {

//         String s = "STREAM";
//         int row = 6;

//         for (int i = 0; i < row; i++) {
//             for (int j = row - i; j > 1; j--) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j <= i; j++) {
//                 char c = s.charAt(j);
//                 System.out.print(c);
//                 System.out.print(' ');
//             }
//             System.out.println();
//         }
//     }
// }