import java.awt.*;
import javax.swing.JFrame;

public class BarcodeGeneratorGUI extends JFrame
{
    static private BarcodeGenerator _barcodeGeneratorObjekt;

    public BarcodeGeneratorGUI()
    {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("UPC-A-Barcode");
    }

    @Override
    public void paint(Graphics g)
    {
        String barcode = _barcodeGeneratorObjekt.barcodeGenerator();

        for(int i = 0; i<barcode.length(); i++)
        {
            if(barcode.charAt(i) == '1')
            {
                g.fillRect(50+(2*i),100,2,200);
            }
            else if(barcode.charAt(i) == '2')
            {
                g.fillRect(50+(2*i),100,2,220);
            }
        }
    }

    public static void main(String[] args)
    {
        _barcodeGeneratorObjekt = new BarcodeGenerator("34975315028");
        BarcodeGeneratorGUI gui = new BarcodeGeneratorGUI();
        gui.setSize(600, 400);
        gui.setVisible(true);
    }
}