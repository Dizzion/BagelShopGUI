import javax.swing.*;

public class GreetingPanel extends JPanel
{
    /**
     * Constructor
    */

    public GreetingPanel()
    {
        // Create the label.
        JLabel greeting = 
            new JLabel("Welcome to the Bagel House");

        // Add the label ot this panel.
        add(greeting);
    }
}