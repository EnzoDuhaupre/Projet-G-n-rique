public class MainPaire {
    public static void main(String[] args) {
        // 1) Créer une Paire("Alice", 42) et l'afficher
        Paire<String, Integer> p1 = new Paire<>("Alice", 42);
        System.out.println("p1 = " + p1);

        // 2) Appeler inverser() et afficher le résultat
        Paire<Integer, String> p2 = Paire.inverser(p1);
        System.out.println("p2 (inversée) = " + p2);

        // 3) Créer une Paire(3.14, true) et afficher le type de chaque valeur
        Paire<Double, Boolean> p3 = new Paire<>(3.14, true);
        System.out.println("p3 = " + p3);

        System.out.println("Type de premier : " + p3.getPremier().getClass().getSimpleName());
        System.out.println("Type de second  : " + p3.getSecond().getClass().getSimpleName());
    }
}