public class MainPile {

        public static void main(String[] args) {
            // 4. Créer une pile d'entiers, empiler 1, 2, 3, 4, 5
            Pile<Integer> pile = new Pile<>();
            pile.empiler(1);
            pile.empiler(2);
            pile.empiler(3);
            pile.empiler(4);
            pile.empiler(5);

            // 5. Afficher la pile
            System.out.println("Pile : " + pile);

            // 6. Dépiler le sommet et afficher la valeur retirée et l'état de la pile
            Integer sommet = pile.depiler();
            System.out.println("Sommet dépiler : " + sommet);
            System.out.println("Pile après dépilement : " + pile);

            // 7. Afficher la pile inversée (sans modifier l'originale)
            Pile<Integer> pileInversee = PileUtils.inverser(pile);
            System.out.println("Pile inversée : " + pileInversee);
            System.out.println("Pile originale encore inchangée : " + pile);
        }
    }
}
