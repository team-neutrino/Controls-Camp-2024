package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LEDConstants;

public class LEDSubsystem extends SubsystemBase {
    private AddressableLED m_addressableLED;
    private AddressableLEDBuffer m_LEDBuffer;
    private int m_port;

    public LEDSubsystem(int p_port) {
        m_port = p_port;
        m_addressableLED = new AddressableLED(m_port);
        m_LEDBuffer = new AddressableLEDBuffer();
        m_addressableLED.setLength(m_LEDBuffer.getLength());
        m_addressableLED.setData(m_LEDBuffer);
        m_addressableLED.start();
        setToOrange();
    }

    private void setToColor(int r, int g, int b) {
        for (int i = 0; i < m_LEDBuffer.getLength(); i++) {
            m_LEDBuffer.setRGB(i, r, g, b);
        }
    }
    
    // Use the setToColor method to help you create the setToRed, setToBlue, and setToGreen methods

    public void periodic() {
        m_addressableLED.setData(m_LEDBuffer);
    }

}
