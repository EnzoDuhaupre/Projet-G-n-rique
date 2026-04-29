public class PileUtils {

    public static <T> Pile<T> inverser(Pile<T> source) {
        if (source == null) {
            throw new IllegalArgumentException("source ne peut pas être null");
        }
        // On parcourt la pile source de la base vers le sommet
        // et on empile dans l'ordre inverse dans la nouvelle pile.
        Pile<T> resultat = new Pile<>();
        int taille = source.taille();
        for (int i = 0; i < taille; i++) {
            // get(i) correspond à l'élément à la position i depuis la base
            resultat.empiler(source.elements.get(i));
        }
        return resultat;
    }
}