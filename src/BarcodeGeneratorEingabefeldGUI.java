
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

//TODO Ein Eingabefeld für den 11stelligen Barcode einbauen.

public class BarcodeGeneratorEingabefeldGUI extends JFrame{

    String _ziffernfolge;

    public BarcodeGeneratorEingabefeldGUI(){

        MaskFormatter maskFormatter = null;
        try {
            maskFormatter = new MaskFormatter("###########");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(false);
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setAllowsInvalid(false);
        JFormattedTextField textField = new JFormattedTextField(maskFormatter);
        _ziffernfolge = textField.getText();

        this.add(textField);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Zahlen-Textfeld");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BarcodeGeneratorEingabefeldGUI();
    }

    public String getZiffer()
    {
        return _ziffernfolge;
    }
}