import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Action_Listener extends Frame implements ActionListener{

    JButton bLeft = new JButton("Left");
    JButton bRight = new JButton("Right");
    JButton bCenter = new JButton("Center");
    TextField tf = new TextField("",10);
    public Action_Listener(){
        super("Action Listenter");
        setLayout(new FlowLayout());
        
        add(bLeft);
        add(bCenter);
        add(bRight);

        setBounds(800, 800, 500, 200);
//        pack();
        setVisible(true);
        //lắng nghe event
        bLeft.addActionListener(this);
        bCenter.addActionListener(this);
        bRight.addActionListener(this);
        
        
    }
    
    public static void main(String[] args) {
        Action_Listener act = new Action_Listener();
          
        act.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
        }
});
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == bLeft){
          setVisible(false);
          setLayout(new FlowLayout(FlowLayout.LEFT));
          setVisible(true);
    }
      if(e.getSource()== bCenter){
          setVisible(false);
          setLayout(new FlowLayout(FlowLayout.CENTER));
          setVisible(true);
      }
      if(e.getSource() == bRight){
          setVisible(false);
          setLayout(new FlowLayout(FlowLayout.RIGHT));
          setVisible(true);
      }
      
   
   
    
    
}
}