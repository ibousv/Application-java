package model;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;

public class Administrateur extends Utilisateur {

	Base base = new Base();

	public Administrateur(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);

	}

	public String affiche(Etudiant e) {
		base.connection();
		String sql = "select nom_cours, valeur from notes where login_etudiant = ?";
		String info = "";
		try {
			base.pre = base.con.prepareStatement(sql);
			base.pre.setString(1, e.getLogin());
			base.re = base.pre.executeQuery();
			while (base.re.next()) {
				info += base.re.getString("nom_cours") + "   " + base.re.getInt("valeur") + "\n";
			}
			return info;
		} catch (Exception ex) {
			System.out.println("Une erreur est survenue :" + ex.getMessage());
		}
		return null;
	}

	public void pdf_QRCode_gen(String login, String pass) {
		Etudiant et = new Etudiant(null, null, login, pass);
		try {
			Document pdf = new Document();
			PdfWriter writer = PdfWriter.getInstance(pdf, new FileOutputStream(login + "_info.pdf"));
			pdf.open();
			pdf.add(new Paragraph("Les information de l'étudiant: Cours et Notes obtenues"));
			pdf.add(new Paragraph(affiche(et)));
			BarcodeQRCode barcodeQRCode = new BarcodeQRCode(affiche(et), 100, 100, null);
			barcodeQRCode.createAwtImage(Color.BLACK, Color.LIGHT_GRAY);
			pdf.add(barcodeQRCode.getImage());
			pdf.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}