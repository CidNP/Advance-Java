import java.awt.*;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JInternalFrame.JDesktopIcon;


public class javaMDI extends JFrame{
    
    //MDI container
    private final JDesktopPane desktopPane = new JDesktopPane();
    
    javaMDI(){
        InitUI();
    }

    private void InitUI(){
        LoginPage loginPage = new LoginPage();
        StudentPage studentPage = new StudentPage();

        desktopPane.add(loginPage);
        desktopPane.add(studentPage);
        loginPage.setVisible(true);
        studentPage.setVisible(true);
        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(600, 600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        javaMDI JavaMDI = new javaMDI();
        JavaMDI.setVisible(true);
    }

}
class LoginPage extends JInternalFrame{
    LoginPage(){
        setTitle("Login Page");
        add(new JLabel("Login page goes here"));
        pack();
    }
}

class StudentPage extends JInternalFrame{
    StudentPage(){
        setTitle("Stud Page");
        add(new JLabel("Student"));
        pack();
    }
}