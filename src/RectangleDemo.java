public class RectangleDemo
{
    public static void main(String[] args) {
        /*Rectangle box = new Rectangle(5, 10, 60, 90);
        Rectangle box2 = box;
        box.translate(100, 100);
        System.out.println(box.getX());
        System.out.println(box2.getX());
        box.draw();*/

        Rectangle box3 = new Rectangle(45,90,60,90);
        box3.grow(20,20);
        System.out.println(box3.getX());
        System.out.println(box3.getWidth());
    }
}
