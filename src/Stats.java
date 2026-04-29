import java.util.List;

public class Stats<T extends Number> {

    private List<T> valeurs;

    // 1. Constructeur acceptant une List<T> de valeurs
    public Stats(List<T> valeurs) {
        if (valeurs == null || valeurs.isEmpty()) {
            throw new IllegalArgumentException("La liste ne doit pas être null ou vide");
        }
        this.valeurs = valeurs;
    }

    // 2. double moyenne() — utilise n.doubleValue()
    public double moyenne() {
        double somme = 0.0;
        for (T n : valeurs) {
            somme += n.doubleValue();
        }
        return somme / valeurs.size();
    }

    // 3. T min() — parcourt la liste
    public T min() {
        T min = valeurs.get(0);
        for (T n : valeurs) {
            if (n.doubleValue() < min.doubleValue()) {
                min = n;
            }
        }
        return min;
    }

    // 4. T max() — parcourt la liste
    public T max() {
        T max = valeurs.get(0);
        for (T n : valeurs) {
            if (n.doubleValue() > max.doubleValue()) {
                max = n;
            }
        }
        return max;
    }

    // 5. double ecartType()
    public double ecartType() {
        double moy = moyenne();
        double sommeCarres = 0.0;
        for (T n : valeurs) {
            double diff = n.doubleValue() - moy;
            sommeCarres += diff * diff;
        }
        double variance = sommeCarres / valeurs.size();
        return Math.sqrt(variance);
    }

    /**
     * Retourne la somme de tous les éléments d'une liste de nombres.
     * T extends Number garantit l'accès à doubleValue().
     */
    public static <T extends Number> double somme(List<T> liste) {
        if (liste == null || liste.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (T element : liste) {
            total += element.doubleValue();
        }
        return total;
    }
}