import java.util.List;
import java.util.ArrayList;

public class FormeUtils {


    public static void afficherFormes(List<?> formes) {
        System.out.println("Nombre de formes : " + formes.size());
        for (Object o : formes) {
            System.out.println(o);
        }
    }

    public static double sommerSurfaces(List<? extends Forme> formes) {
        if (formes == null || formes.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (Forme f : formes) {
            total += f.surface();
        }
        return total;
    }


    public static void remplirCercles(List<? super Cercle> destination, int n) {
        if (destination == null) {
            throw new IllegalArgumentException("destination ne peut pas être null");
        }
        for (int i = 0; i < n; i++) {
            destination.add(new Cercle(1.0));
        }
    }


    public static <T extends Forme> void copier(
            List<? extends T> source,
            List<? super T> destination) {

        if (source == null || destination == null) {
            throw new IllegalArgumentException("source et destination ne peuvent pas être null");
        }

        for (T item : source) {
            destination.add(item);
        }
        /* On utilise List<? extends Forme> et non List<Forme> seul parce que, List<Cercle> n’est pas un sous type de List<Forme> :
        le wildcard permet d’accepter toutes les listes de sous types de Forme pour que la méthode reste générique et réutilisable.
         */
    }
}
