import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class LineClient
{

    public static void main(String[] args) {

        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        final LineDrawer comp = new LineDrawer();
        comp.setPreferredSize(new Dimension(400, 600));
        testFrame.getContentPane().add(comp, BorderLayout.CENTER);
        comp.addLine(0, 0, 233, 300, Color.BLUE);
        
  
        testFrame.pack();
        testFrame.setVisible(true);
    }

}
