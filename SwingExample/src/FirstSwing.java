import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwing extends JFrame {
    private JPanel jPanelMain;
    private JButton okButton;
    private JButton subButton;
    private JButton cancelButton;
    private JLabel statusLabel1;
    private JLabel statusLabel2;
    private JList jList;

    public FirstSwing(String title){
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(jPanelMain);
        this.pack();

        DefaultListModel<Point> points = new DefaultListModel<Point>();

        points.add(0,new Point(2,0));
        this.jList.setModel(points);


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okButtonPressed(e);


            }
        });
        subButton.addActionListener (new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
    }

    private void okButtonPressed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        statusLabel1.setText(button.getText() + " BUTTOM PRESSED");
    }

   private class ButtonClickListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
           String command = e.getActionCommand();

           if(command.equals( "ok" )) {
                statusLabel1.setText("Ok Button clicked.");
           }else if (command.equals("Submit")){
                statusLabel1.setText(("Submit Button Clicker."));
          }else {
               statusLabel1.setText("Cancel Button Clicked.");
           }

           JButton source = (JButton) e.getSource();

           statusLabel2.setText("Control in action: " + source.getClass().getSimpleName());

       }
    }

    public static void main (String[] args) {
        JFrame frame = new FirstSwing("Java SWING Examples");
        frame.setVisible(true);
    }
}
