import javax.swing.*;

public class project {
    public static void main(String[] args) {
        // new window
        JFrame window =new JFrame();
//to close the window properly
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // to tell java you can not resize this
        window.setResizable(false);
// to set title
        window.setTitle("2d adventure");


        Gamepanel gamepanel = new Gamepanel();// declaring a new game panel
        window.add(gamepanel);


        window.pack();
// so window will be displayed on the center screen
        window.setLocationRelativeTo(null);
        //to see the screen
        window.setVisible(true);

        gamepanel.startGameThread();

    }
}