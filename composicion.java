import java.util.ArrayList;
import java.util.List;

interface Graphic {
    void move(int x, int y);
    void draw();
}

class Dot implements Graphic {
    private int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        // Dibuja un punto en X e Y.
    }
}

class Circle extends Dot {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        // Dibuja un círculo en X y Y con radio R.
    }
}

class CompoundGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }

    }
}

class ImageEditor {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        // ...
    }

    public void groupSelected(Graphic[] components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.add(component);
            all.remove(component);
        }
        all.add(group);
        // Se dibujarán todos los componentes.
        all.draw();
    }
}
