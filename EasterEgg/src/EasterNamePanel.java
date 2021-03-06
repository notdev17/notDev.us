/**
 * Adds names of team members for the MessageDialog panel.
 *
 * @author notDevs
 * @version 1
 */

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class EasterNamePanel extends JPanel {

  // Add your name to this array
  // Just made an array so that JUnit test can just check for array length == 5
  // to see if everyone added their name.
  private static final String[] NAMES = {"Daylen", "Brandon", "Michelle", "Tim", "Devon"};

  /**
   * Constructor.
   */
  public EasterNamePanel() {
    super();
    setup();
  }

  /**
   * Adds team member name labels to panel.
   */
  public void setup(){
    this.setLayout(new GridLayout(0,1));
    for(int i = 0; i < NAMES.length; i++) {
      this.add(new JLabel(NAMES[i]));
    }
  }
}
