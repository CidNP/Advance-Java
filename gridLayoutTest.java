
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

    class gridLayoutFrame extends JFrame{

        //controls
        JLabel lblName;
        JLabel lblPassword;
        JTextField txtName;
        JPasswordField txtPassword;
        JButton jBtnLogin;

        //constructor
        gridLayoutFrame() { }


        gridLayoutFrame(String title){
            this.setTitle(title);
            initForm();
        }

        gridLayoutFrame(String title, int h, int w){
            this.setTitle(title);
            this.setSize(w, h);
            initForm();
        }


        //helper function
        void showForm(){
            //afnai logic
            this.setVisible(true);
        }


        void hideForm(){
            this.setVisible(false);
        }

        void initForm(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.addWindowListener(new WindowAdapter(){

                public void windowClosing(WindowEvent e){
                    int result = JOptionPane.showConfirmDialog(
                        getContentPane(), //CLASS DIFF XA TESAILE THIS GARNU BHANDA BHITRA NAI BANAUNU PARXA
                        //gridLayoutFrame.this,
                            "Do you want to close",
                            "Confirm Exit",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                    );
                    if(result == JOptionPane.YES_OPTION) System.exit(0);
                    else setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
                

            });
            //define layout manager
            this.setLayout( new GridLayout(3, 2)); // 


            //initialize the components
            lblName = new JLabel("User Name");
            lblPassword = new JLabel ("Password");
            txtName = new JTextField ();
            txtPassword = new JPasswordField();
            txtPassword.setEchoChar('*');
            jBtnLogin = new JButton("Login");


            //add components to Layouts

            this.add(lblName);
            this.add(txtName);
            this.add(lblPassword);
            this.add(txtPassword);
            this.add(new JLabel("")); //rigt side tira lagna BLANK thau rakheko
            this.add(jBtnLogin);
            
            this.pack();
        }


        //business logic

    }

    public class gridLayoutTest{
        public static void main(String[] args){
            gridLayoutFrame myFrame = new gridLayoutFrame("");
            myFrame.showForm(); 
        }
    }