package es.iessoterhernandez.daw.endes.HelloWorldPdf;

/**
 * Hello world!
 *
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class App {

    public static void main(String[] args) {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("Hola Mundo"));

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            document.close();

        }

    }

}