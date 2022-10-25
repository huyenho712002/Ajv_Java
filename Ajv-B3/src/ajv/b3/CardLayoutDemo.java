
package ajv.b3;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class CardLayoutDemo extends JFrame{
    CardLayout cardLayout;
    JPanel pnlSubject;
    public CardLayoutDemo(){
        //set screen size
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        // create layout manager
        cardLayout = new CardLayout();
        
        //Main panel
        pnlSubject = new JPanel();
        pnlSubject.setLayout(cardLayout);
        
         
        JPanel pnlEnglish, pnlScience, pnlMath;
         pnlEnglish = new JPanel();
         pnlScience = new JPanel();
         pnlMath = new JPanel();
         
         pnlEnglish.setSize(200, 200);
         pnlScience.setSize(200, 200);
         pnlMath.setSize(200, 200);
         
         pnlEnglish.setBackground(Color.red);
         pnlScience.setBackground(Color.BLACK);
         pnlMath.setBackground(Color.BLUE);
         // create button
         JButton bt1 = new JButton("Choose");
         bt1.setSize(20,20);
  
        // panel add --> label
         pnlEnglish.add(new JLabel("English"));
         pnlScience.add(new JLabel("Science"));
         pnlMath.add(new JLabel("Math"));
         pnlEnglish.add(new JButton("choose"));
         pnlScience.add(new JButton("choose"));
         pnlMath.add(new JButton("choose"));
         
         //add card to the main panel
         pnlSubject.add(pnlEnglish);
         pnlSubject.add(pnlScience);
         pnlSubject.add(pnlMath);
         
         //Create button 
         JPanel pnlButton = new JPanel();
         JButton btPrevios = new JButton("Previos");
         JButton btNext = new JButton("Next");
         // add to the panel
         pnlButton.add(btPrevios);
         pnlButton.add(btNext);
        
         
         //create event of button
         btNext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              cardLayout.next(pnlSubject);
            }
        });
         
         btPrevios.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               cardLayout.previous(pnlSubject);
            }
        });
            setLayout(new BorderLayout());
            add(pnlSubject, BorderLayout.CENTER);
            add(pnlButton, BorderLayout.NORTH);
            
    }
    
    public static void main(String[] args) {
        new CardLayoutDemo().setVisible(true);
    }
}
