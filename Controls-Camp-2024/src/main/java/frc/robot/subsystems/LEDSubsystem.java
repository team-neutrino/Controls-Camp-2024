package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LEDConstants;

public class LEDSubsystem extends SubsystemBase {
    private AddressableLED m_addressableLED;
    private AddressableLEDBuffer m_LEDBuffer;
    private Timer timer = new Timer();
    private int m_port;
    private boolean isYellow;

    public LEDSubsystem(int p_port) {
        m_port = p_port;
        m_addressableLED = new AddressableLED(m_port);
        m_LEDBuffer = new AddressableLEDBuffer(LEDConstants.LEDBufferLen);
        m_addressableLED.setLength(m_LEDBuffer.getLength());
        m_addressableLED.setData(m_LEDBuffer);
        m_addressableLED.start();
        setToOrange();
        isYellow = false;
    }

    private void setToColor(int r, int g, int b) {
        for (int i = 0; i < m_LEDBuffer.getLength(); i++) {
            m_LEDBuffer.setRGB(i, r, g, b);
        }
    }

    public void setToOrange() {
        setToColor(235, 20, 0);
        isYellow = false;
    }

    public void setToGreen() {
        setToColor(0, 255, 0);
        isYellow = false;
    }

    public void setToBlue() {
        setToColor(0, 0, 255);
        isYellow = false;
    }

    public void setToYellow() {
        setToColor(255, 255, 0);
        isYellow = true;
    }

    public void setToRed() {
        setToColor(255, 0, 0);
        isYellow = false;
    }

    public void setToPurple() {
        setToColor(255, 0, 255);
        isYellow = false;
    }

    public void setToCyan() {
        setToColor(0, 255, 255);
        isYellow = false;
    }

    public boolean isLEDYellow(){
        return isYellow;
    }

    public void periodic() {
        m_addressableLED.setData(m_LEDBuffer);
    }

}
