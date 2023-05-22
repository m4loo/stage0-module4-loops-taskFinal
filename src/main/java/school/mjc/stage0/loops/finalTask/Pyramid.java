package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int spaces = cathetusLength - 1;
        int matters = 1;
        for (int i = 1; i <= cathetusLength; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            boolean checker = true;
            int counter = 0;
            for (int j = matters; j >= 1 && j <= matters; ) {
                if (j == 1) checker = false;
                if (checker) j--;
                else j++;
                System.out.print(j);
                counter++;
                if (counter >= matters) break;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
            matters += 2;
            spaces -= 2;
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
