import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // zadacha 1 2

        int[] zadachaOdin = new int[3];
        zadachaOdin[0] = 1;
        zadachaOdin[1] = 2;
        zadachaOdin[2] = 3;

        double[] zadachaOdinDva = {1.57, 7.654, 9.986};

        int[] zdachaOdinTri = {44, 55, 66};

        System.out.println(Arrays.toString(zadachaOdin));

        System.out.print(zadachaOdin[0] + ", ");
        System.out.print(zadachaOdin[1] + ", ");
        System.out.print(zadachaOdin[2]);

        System.out.println();

        System.out.print(zadachaOdinDva[0] + ", ");
        System.out.print(zadachaOdinDva[1] + ", ");
        System.out.print(zadachaOdinDva[2]);

        System.out.println();

        System.out.print(zdachaOdinTri[0] + ", ");
        System.out.print(zdachaOdinTri[1] + ", ");
        System.out.print(zdachaOdinTri[2]);

        System.out.println();
        System.out.println();

        // zadacha 3

        System.out.print(zadachaOdin[2] + ", ");
        System.out.print(zadachaOdin[1] + ", ");
        System.out.print(zadachaOdin[0]);

        System.out.println();

        System.out.print(zadachaOdinDva[2] + ", ");
        System.out.print(zadachaOdinDva[1] + ", ");
        System.out.print(zadachaOdinDva[0]);

        System.out.println();

        System.out.print(zdachaOdinTri[2] + ", ");
        System.out.print(zdachaOdinTri[1] + ", ");
        System.out.print(zdachaOdinTri[0]);

        // zadacha 4

        for (int i = 0; i < zadachaOdin.length; i++) {
            if (zadachaOdin[i] % 2 == 0) {

            } else if (zadachaOdin[i] % 2 == 1)
                zadachaOdin[i] = zadachaOdin[i] + 1;

        }
        System.out.println( );
        System.out.println( );
        System.out.println(Arrays.toString(zadachaOdin));

    }
}