/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskelompok;

/**
 *
 * @author irvin
 */
import javax.swing.*;
import java.awt.*;

public class testFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create components
        JLabel titleLabel = new JLabel("My Awesome App");
        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField inputField = new JTextField(10);
        JButton submitButton = new JButton("Submit");

        // Create a panel with vertical BoxLayout
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        // Add components to the panel
        contentPanel.add(titleLabel);

        // Create a horizontal panel for inputLabel and inputField
        JPanel inputPanel = new JPanel();
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        contentPanel.add(inputPanel);

        contentPanel.add(submitButton);

        // Set the panel as the content pane
        frame.setContentPane(contentPanel);

        // Show the frame
        frame.setVisible(true);
    }
}
