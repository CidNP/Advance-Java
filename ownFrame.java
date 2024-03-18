import javax.swing.*;

public class ownFrame extends JFrame{

    //Controls
    JLabel jlbLabel;
    JButton jBtn;
    JComboBox jCombo;

    ownFrame(){
        super ("My Own Frame"); //same as JFrame ("My Own Frame")
        this.setSize(400, 300); //width height
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initControls();
    } 

    void initControls () {

        jlbLabel = new JLabel();

        jlbLabel.setText("Ram Bolo bhai Ram");
        jlbLabel.setBounds(100, 5 , 100, 20); //x y width height
        this.add(jlbLabel);
        
        jBtn = new JButton();
        jBtn.setText("Click here");
        this.add(jBtn);

        jCombo = new JComboBox();


    }
    
    public static void main (String[] args){
        ownFrame objownFrame = new ownFrame();
        objownFrame.setVisible(true);
    }
}

    
