package level3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReportServiceTest {

    @Test
    void testJsonStrategy() {
        ReportStrategy strategy = new JsonStrategy();
        ReportService service = new ReportService(strategy);

        String result = service.generateReport();

        assertEquals("Report generated in JSON format", result);
    }

    @Test
    void testCsvStrategy() {
        ReportStrategy strategy = new CsvStrategy();
        ReportService service = new ReportService(strategy);

        String result = service.generateReport();

        assertEquals("Report generated in CSV format", result);
    }

    @Test
    void testPdfStrategy() {
        ReportStrategy strategy = new PdfStrategy();
        ReportService service = new ReportService(strategy);

        String result = service.generateReport();

        assertEquals("Report generated in PDF format", result);
    }

    @Test
    void testHtmlStrategy() {
        ReportStrategy strategy = new HtmlStrategy();
        ReportService service = new ReportService(strategy);

        String result = service.generateReport();

        assertEquals("Report generated in HTML format", result);
    }

    @Test
    void testXmlStrategy() {
        ReportStrategy strategy = new XmlStrategy();
        ReportService service = new ReportService(strategy);

        String result = service.generateReport();

        assertEquals("Report generated in XML format", result);
    }

    @Test
    void testExcelStrategy() {
        ReportStrategy strategy = new ExcelStrategy();
        ReportService service = new ReportService(strategy);

        String result = service.generateReport();

        assertEquals("Report generated in Excel format", result);
    }

    @Test
    void testWordStrategy() {
        ReportStrategy strategy = new WordStrategy();
        ReportService service = new ReportService(strategy);

        String result = service.generateReport();

        assertEquals("Report generated in Word format", result);
    }
}
