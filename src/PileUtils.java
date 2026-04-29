public class PileUtils {

    public static <T> Pile<T> inverser(Pile<T> source) {
        if (source == null) {
            throw new IllegalArgumentException("source ne peut pas être null");
        }
        if (source.estVide()) {
            return new Pile<>(); 
        }

        Pile<T> resultat = new Pile<>();
        Pile<T> temp = new Pile<>();

        while (!source.estVide()) {
            T element = source.depiler();
            temp.empiler(element);
            resultat.empiler(element);
        }

        // Remettre la pile source dans son état initial
        while (!temp.estVide()) {
            source.empiler(temp.depiler());
        }

        return resultat;
    }
}
