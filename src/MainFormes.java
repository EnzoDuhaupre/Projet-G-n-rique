import java.util.Arrays;
import java.util.List;

public class MainFormes {

    public static void main(String[] args) {
        // List<Cercle>
        List<Cercle> cercles = Arrays.asList(
                new Cercle(1.0),
                new Cercle(2.0),
                new Cercle(3.0)
        );

        // List<Rectangle>
        List<Rectangle> rectangles = Arrays.asList(
                new Rectangle(2.0, 3.0),
                new Rectangle(4.0, 5.0)
        );

        // Test avec wildcard non borné
        FormeUtils.afficherFormes(cercles);
        System.out.println();
        FormeUtils.afficherFormes(rectangles);
    }
}
