package dependency_invertion_principle;

class ReportService {
    private ReportGenerator reportGenerator;

    public ReportService(ReportGenerator generator) {
        this.reportGenerator = generator;
    }

    public void generateReport() {
        reportGenerator.generateReport();
    }
}