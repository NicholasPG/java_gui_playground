import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CoolIcon implements Icon
{
    public CoolIcon(int aSize)
    {
        size = aSize;
    }

    public int getIconWidth()
    {
        return size;
    }

    public int getIconHeight()
    {
        return size;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        Arc2D.Double cool = new Arc2D.Double(x, y, size, size, size, size, 1);
        g2.setColor(Color.BLUE);
        g2.fill(cool);
    }

    private int size;
}
