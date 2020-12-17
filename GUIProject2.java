import javax.swing.*;
import java.awt.event.*;
public class GUIProject2{
    JFrame jf1;
    JButton b1;
    JTextField t1;
    JLabel l1,l2;
    int count=0;
    public void initComponents(){
        b1=new JButton("Click");
        l2=new JLabel();
        jf1.setLayout(null);
        l2.setBounds(100,50,100,30);
        b1.setBounds(100,100,100,30);
        jf1.add(b1);
        jf1.add(l2);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count=count+1;
                l2.setText("No. of Clicks = "+count);
            }
        });
    }
    public void launchScreen(){
        jf1=new JFrame();
        jf1.setSize(300,300);
        initComponents();
        jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String []args){
        GUIProject2 g=new GUIProject2();
        g.launchScreen();
    }
}