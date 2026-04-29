import java.util.ArrayList;
import java.util.List;

public class Pile<T> {
    private List<T> elements;

    public Pile() {
        this.elements = new ArrayList<>();
    }

    public void empiler(T element) {
        elements.add(element);
    }

    public T depiler() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Pile vide");
        }
        return elements.remove(elements.size() - 1);
    }

    public T sommet() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Pile vide");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean estVide() {
        return elements.isEmpty();
    }

    public int taille() {
        return elements.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = elements.size() - 1; i >= 0; i--) {
            sb.append(elements.get(i));
            if (i > 0) sb.append(" | ");
        }
        sb.append("]");
        return sb.toString();
    }
}