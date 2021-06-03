package com.revenue.revenueCollection._service.reports;


import com.revenue.revenueCollection._shared.dto.IParkingPaymentRefinedDto;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.export.SimpleCsvExporterConfiguration;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;

@Service
public class ParkingPaymentReportService {

    public ResponseEntity<byte[]> exportReport(String reportFormat) throws IOException, JRException {


        List<IParkingPaymentRefinedDto> parkingPayments = new ArrayList<>();

        parkingPayments.add(new IParkingPaymentRefinedDto(1, "Test", "Test", "Test", "Test", 50, new Timestamp(System.currentTimeMillis())));
        File file = ResourceUtils.getFile("classpath:parkingPayments.jrxml");


        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(parkingPayments);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "E-Revenue");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

        if (reportFormat.equalsIgnoreCase("pdf")) {
            File pdf = File.createTempFile("output", ".pdf");
            JasperExportManager.exportReportToPdfStream(jasperPrint, new FileOutputStream(pdf));

            byte[] myArrayStream = FileUtils.readFileToByteArray(pdf);

            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType("application/pdf"))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + "testfile.pdf" + "\"")
                    .body(myArrayStream);


        }
        if (reportFormat.equalsIgnoreCase("csv")) {
            File csv = File.createTempFile("output", ".csv");

            JRCsvExporter exporter = new JRCsvExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleWriterExporterOutput(csv));
            SimpleCsvExporterConfiguration configuration = new SimpleCsvExporterConfiguration();
            configuration.setWriteBOM(Boolean.TRUE);
            configuration.setRecordDelimiter("\r\n");
            exporter.setConfiguration(configuration);
            exporter.exportReport();

            byte[] myArrayStream = FileUtils.readFileToByteArray(csv);

            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType("application/csv"))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + "testfile.csv" + "\"")
                    .body(myArrayStream);

        }

        return null;
    }

}
