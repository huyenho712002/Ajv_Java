
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JCheckBoxdemo extends JFrame implements ActionListener{
  JLabel lbResult;
  JCheckBox cbEnglish, cbJan;
  
  public JCheckBoxdemo(){
      setSize(500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      cbEnglish = new JCheckBox("English");
      cbEnglish.setSelected(true);
      add(cbEnglish);
      
      cbJan = new JCheckBox("Japanese");
      add(cbJan);
      
      lbResult = new JLabel("Select: English");
      add(lbResult);
     
  }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }

    private void setSelected(boolean b) {
        
    }
    
}
