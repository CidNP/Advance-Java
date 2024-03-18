import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame{

    //controls
    JLabel lblUserNamer;
    JLabel lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin;

    private void InitUI(){

        // set layout
        this.setLayout(new GridLayout(3,2));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //init the controls
        lblUserNamer = new JLabel("User Name");
        txtUsername = new JTextField();
        lblPassword = new JLabel("Password");
        txtPassword = new JPasswordField();

        btnLogin = new JButton("Login");
       
        //assign the controls to frame
        this.add(lblUserNamer);
        this.add(txtUsername);
        this.add(lblPassword);
        this.add(txtPassword);
        this.add(btnLogin);

        this.pack();
    }

    LoginForm(String title){
        //init the controls
        InitUI();
    }

    public void show_form(){
        //visibility set
        this.setVisible(true);
    }
}