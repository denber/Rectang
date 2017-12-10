/**
 * Created by denber on 06/12/2017.
 */
public class CopyingRectangles
{
    public static void main(String args[])
    {
        Rectangle box = new Rectangle(5,10,60,90);
        Rectangle box2 = box;
        box.setColor(Color.RED);
        box.setColor(Color.BLUE);
        box.fill();
    }
}
