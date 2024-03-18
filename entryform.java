import javax.swing.*;

public class entryform extends JFrame{

    //Controls
    JLabel jlbLabel;
    JButton jBtn;
    JTextField jTxt;
    
    entryform(){
        super ("My Own Frame"); //same as JFrame ("My Own Frame")
        this.setSize(400, 300); //width height
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initControls();
    } 

    void initControls () {

        jlbLabel = new JLabel();

        jlbLabel.setText("Name");
        jlbLabel.setSize(100, 20);
        jlbLabel.setLocation(100, 100);
        this.add(jlbLabel);


        jTxt = new  JTextField();
        jTxt.setFont(new Font ("Arial", Font.PLAIN, 15));
        jTxt.setSize(190, 20);
        jTxt.setLocation(200,100);
        this.add(jTxt);

        jBtn = new JButton();
        jBtn.setText("Click here");
        this.add(jBtn);

  


    }
    
    public static void main (String[] args){
        ownFrame objownFrame = new ownFrame();
        objownFrame.setVisible(true);
    }
}

    
