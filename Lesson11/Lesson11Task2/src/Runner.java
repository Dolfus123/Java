import by.itClass.Circle;
import by.itClass.Rectangle;
import by.itClass.interfaces.Actions;

public class Runner {
    static void info(Actions obj){
        System.out.println("Perimeter: "+obj.getPerimeter()+"; Square: "+obj.getSquare());
    }

    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle(10.6,5.7);
        Circle circle = new Circle(33.3);
        info(rectangle);
        info(circle);
    }
}
