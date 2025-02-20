import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapeIconPanel extends JPanel {

    private ArrayList<Icon> imgs;

    public ShapeIconPanel() {
        imgs = new ArrayList<Icon>();

        imgs.add(new MarsIcon(50));
        //add your Icons here.
        imgs.add(new CoolIcon(100));

        this.setPreferredSize(new Dimension(500, 250));
        this.setBackground(Color.black);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 0;
        int y = 0;
        for (Icon img : imgs) {
            img.paintIcon(this, g, x, y );
            x += img.getIconWidth();
        }
    }









}
