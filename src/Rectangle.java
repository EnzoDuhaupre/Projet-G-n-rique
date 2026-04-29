class Rectangle extends Forme { double largeur, hauteur;
    Rectangle(double l, double h) { largeur = l; hauteur = h; } public double surface() { return largeur * hauteur; }
}
