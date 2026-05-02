package level3;

public class HtmlStrategy implements  ReportStrategy{
    @Override
    public String generateReport() {
        return "Report generated in HTML format";
    }
}
