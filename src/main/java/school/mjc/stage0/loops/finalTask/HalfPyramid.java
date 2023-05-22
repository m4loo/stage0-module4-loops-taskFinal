package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int spaces = cathetusLength - 1;
        int matters = 1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= spaces; j++) System.out.print(" ");
            for (int j = 1; j <= matters; j++) System.out.print("*");
            System.out.println();
            spaces--;
            matters++;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
