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
            int counter = 1, checkCounter = 1;
            for (int j = matters; j >= 1 && j <= matters; ) {
                if (j == 1) checker = false;
                System.out.print(j);
                if (checker) j--;
                else j++;
                counter++;
                if (counter == checkCounter) break;
            }
            System.out.println();
            matters++;
            spaces--;
            checkCounter += 2;
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
