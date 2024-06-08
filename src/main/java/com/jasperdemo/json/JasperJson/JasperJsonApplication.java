package com.jasperdemo.json.JasperJson;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class JasperJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasperJsonApplication.class, args);
		try {
			compileReports();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello Jasper");
	}

	private static void compileReports() throws Exception {
		compileReport("/report.jrxml", "report.jasper");
		compileReport("/onSiteImagesSubreport.jrxml", "onSiteImagesSubreport.jasper");
		compileReport("/photosOfDamagesSubreport.jrxml", "photosOfDamagesSubreport.jasper");
		compileReport("/itemDetails.jrxml", "itemDetails.jasper");
		compileReport("/misc.jrxml", "misc.jasper");
	}

	private static void compileReport(String jrxmlPath, String jasperPath) throws JRException, IOException {
		InputStream jrxmlInputStream = JasperJsonApplication.class.getResourceAsStream(jrxmlPath);
		if (jrxmlInputStream == null) {
			throw new FileNotFoundException("Resource not found: " + jrxmlPath);
		}
		JasperDesign jasperDesign = JRXmlLoader.load(jrxmlInputStream);
		JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

		// Save the compiled Jasper file
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(jasperPath))) {
			oos.writeObject(jasperReport);
		}
	}
}
