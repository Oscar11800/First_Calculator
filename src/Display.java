import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 800;
    static final int UNIT_SIZE = 30;
    static final int CALC_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT/ UNIT_SIZE);


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
