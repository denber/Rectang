/**
 * Created by denber on 12/12/2017.
 */
public class BlockTower
{
    public static void main(String[] args)
    {
        Rectangle BlockTowerDemoBlue = new Rectangle(20,70,40,30);
        BlockTowerDemoBlue.setColor(Color.BLUE);
        BlockTowerDemoBlue.fill();

        Rectangle BlockTowerDemoRosado = new Rectangle(60,70,40,30);
        BlockTowerDemoRosado.setColor(Color.MAGENTA);
        BlockTowerDemoRosado.fill();

        Rectangle BlockTowerDemoCeleste = new Rectangle(100,70,40,30);
        BlockTowerDemoCeleste.setColor(Color.CYAN);
        BlockTowerDemoCeleste.fill();

        Rectangle BlockTowerDemoRed = new Rectangle(40,40,40,30);
        BlockTowerDemoRed.setColor(Color.RED);
        BlockTowerDemoRed.fill();

        Rectangle BlockTowerDemoOrange = new Rectangle(80,40,40,30);
        BlockTowerDemoOrange.setColor(Color.PINK);
        BlockTowerDemoOrange.fill();

        Rectangle BlockTowerDemoPurple = new Rectangle(60,10,40,30);
        BlockTowerDemoPurple.setColor(new Color(125,125,255));
        BlockTowerDemoPurple.fill();
    }
}
