// For this practice problem we're just focusing on creating methods and running them with actual robot code

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LEDConstants;

public class LEDSubsystem extends SubsystemBase {
    private AddressableLED m_addressableLED;
    private AddressableLEDBuffer m_LEDBuffer;
    private int m_port;

    // This is the class constructor, you don't need to change anything in here
    public LEDSubsystem(int p_port) {
        m_port = p_port;
        m_addressableLED = new AddressableLED(m_port);
        m_LEDBuffer = new AddressableLEDBuffer(18);
        m_addressableLED.setLength(m_LEDBuffer.getLength());
        m_addressableLED.setData(m_LEDBuffer);
        m_addressableLED.start();
    }

    // Use this method to help you create the other methods
    private void setToColor(int r, int g, int b) {
        for (int i = 0; i < m_LEDBuffer.getLength(); i++) {
            m_LEDBuffer.setRGB(i, r, g, b);
        }
    }

    public void setToRed() {
        // Step 3
        // Call the setToColor function with the correct parameters
    }

    // Step 3 cont.
    // The setToGreen and setToBlue should look very similar
    // Go ahead and create those methods

    // Step 6
    // Create a method called setToOrange that sets the LEDs to orange
    // It will look very similar to the other methods you previously made

    // Don't worry about changing anything inside the periodic
    public void periodic() {
        m_addressableLED.setData(m_LEDBuffer);
    }

}
