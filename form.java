
import javax.swing.*;

public class form{

    JFrame frame;

    //Controls
    JLabel jlbLabel;
    JButton jBtn;

        form(){
            frame = new JFrame("hello world");
            frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
            );
            frame.setSize(200,200); //400 width and 500 height
            

            //Controls Initialization
            jlbLabel = new JLabel();
            jlbLabel.setText("Close");
            // jlbLabel.setBounds(100, 5 , 100, 20); //x y width height
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