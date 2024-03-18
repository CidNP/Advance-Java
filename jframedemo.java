
import javax.swing.*;

public class jframedemo{

    JFrame frame;

    //Controls
    JLabel jlbLabel;
    JButton jBtn;

        jframedemo(){
            frame = new JFrame("hello world");
            frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
            );
            //frame.setSize(400,500); //400 width and 500 height
            

            //Controls Initialization
            jlbLabel = new JLabel();
            jlbLabel.setText("Ram Bolo bhai Ram");
            jlbLabel.setBounds(100, 5 , 100, 20); //x y width height
            frame.add(jlbLabel);
            
            jBtn = new JButton();
            jBtn.setText("Click here");
            frame.add(jBtn);
        }

        public void visible(){
            frame.setVisible(true);
        }

    public static void main(String[] args){
        jframedemo frameDemo = new jframedemo();
        frameDemo.visible();
    }
    
}