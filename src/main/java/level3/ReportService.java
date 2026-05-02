package level3;

public class ReportService {

    private ReportStrategy strategy;

    public ReportService(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public String generateReport() {
        return strategy.generateReport();
    }
}
