
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class JRadioButtondemo extends JFrame {
    JLabel message;
    public JRadioButtondemo(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        JRadioButton rbRed = new JRadioButton("Red");
        add(rbRed);
        JRadioButton rbGreen = new JRadioButton("Green");
        add(rbGreen);
        JRadioButton rbBlue = new JRadioButton("Blue");
        add(rbBlue);
        
        ButtonGroup gr = new ButtonGroup();
        gr.add(rbRed);
        gr.add(rbBlue);
        gr.add(rbGreen);
        
        message = new JLabel("Welcome to Softech Aptech");
        message.setForeground(Color.red);
        add(message);
        //lắng nghe event
        rbRed.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                message.setForeground(Color.Red);
            }
        });
        
        rbGreen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               message.setForeground(Color.GREEN);
            }
        });
        rbBlue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              message.setForeground(Color.BLUE);
            }
        });
    }
    
    public static void main(String[] args) {
        new JRadioButtondemo().setVisible(true);
    }
}
