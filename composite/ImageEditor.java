package composite;

//Maneja las operaciones relacionadas al conjunto de graficos, basicamente
public class ImageEditor {
    private CompoundGraphic all;
    
    //inicializa el objeto
    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
    }

    // se puede encargar de añadir graficos o grupos, eliminar
    public void groupSelected(Graphic[] components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.add(component);
            all.remove(component);
        }
        all.add(group);
    }
    
    //Dibuha todos los fraficos del grupo principal
    public void draw() {
        all.draw();
    }
}
