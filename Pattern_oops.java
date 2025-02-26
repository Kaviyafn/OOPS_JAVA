
class NumberPattern {

    private int[][] pattern = {
            { 5,  0,  2,  0,  1 },
            { 0,  4,  0,  2,  0 },
            { 3,  0,  3,  0,  5 },
            { 0,  2,  0,  4,  0 },
            { 1,  0,  7,  0,  5 }
    };


    public void printPattern() {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                if (pattern[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(pattern[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


public class Pattern_oops{
    public static void main(String[] args) {

        NumberPattern np = new NumberPattern();


        np.printPattern();
}


}
