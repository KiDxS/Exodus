/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.student.registration.utils;

import java.util.Map;
import javax.swing.JOptionPane;

public class FieldValidators {
    public int Validate(Map<String, String> dictionary) {
        int statusCode; // returns 0 if there's no error; returns 1 if there's an error
        
        // Iterates over the keys
        for (String key : dictionary.keySet()) {
            String value = dictionary.get(key); // Returns the value assigned to the key
            if (value.isEmpty()) {
                JOptionPane.showMessageDialog(null, String.format("%s is required", key), "Field value is missing", JOptionPane.WARNING_MESSAGE);
                return statusCode = 1;
            }
            
            // If the key is LRN
            if ("LRN".equals(key)) {
                
                // Checks the length of the LRN
                if (value.length() != 12) {
                    JOptionPane.showMessageDialog(null, String.format("%s requires a length of 12", key), "LRN Length", JOptionPane.WARNING_MESSAGE);
                    return statusCode = 1;
                }

            }
        }
        return statusCode = 0;

    }

}
