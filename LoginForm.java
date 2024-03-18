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

        
        //btnLogin Event Handle
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                //validate the form
                String username = txtUsername.getText().trim();
                String password = new String (txtPassword.getPassword());
                // username.equals("")
                if(!username.isEmpty() || password.isEmpty()){
                    //error message
                    JOptionPane.showMessageDialog(
                        new JFrame(),
                        "Username and Password is Mandatory",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }else{
                    // db validate
                    LoginProcess loginProcess = new LoginProcess();
                    boolean isLoginSuccess = loginProcess.dologin(
                                                    username, password
                                            );
                    if(isLoginSuccess){
                        //open the new main form

                    }else{
                        //show error message
                        JOptionPane.showMessageDialog(
                            new JFrame(),
                                "Invalid USername and/or password",
                                "ERROR",
                            JOptionPane.ERROR_MESSAGE   
                        );
                    }
                }

                //if valid : db validate
                //       if valid : show main form
                // else show error message and remain opended
            }
        });

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