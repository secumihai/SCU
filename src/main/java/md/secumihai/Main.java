package md.secumihai;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.*;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws InvalidFormatException, IOException {
        GUI gui = new GUI();
        gui.setVisible(true);

     /*   XWPFDocument doc = new XWPFDocument(OPCPackage.open("D:\\172final.docx"));
        for (XWPFTable tbl : doc.getTables()) {
            for (XWPFTableRow row : tbl.getRows()) {
                for (XWPFTableCell cell : row.getTableCells()) {
                    for (XWPFParagraph p : cell.getParagraphs()) {
                        for (XWPFRun r : p.getRuns()) {
                            String text = r.getText(0);
                            if (text != null && text.contains("3209")) {
                                System.out.println(row.getCell(3).getText());
                            }
                        }
                    }
                }
            }
        }
        try {
            doc.write(new FileOutputStream("output.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}