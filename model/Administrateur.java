package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
public class Administrateur extends Utilisateur {

	Base base = new Base();

	public Administrateur(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);

	}

	public void pdf_QRCode_gen(String login, String pass) {
		Etudiant et = new Etudiant(null, null, login, pass);
		try {
			Document pdf = new Document();
			PdfWriter writer = PdfWriter.getInstance(pdf, new FileOutputStream(login + ".pdf"));
			pdf.open();
			pdf.add(new Paragraph("A Hello World PDF document."));
			pdf.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		
	}
}
