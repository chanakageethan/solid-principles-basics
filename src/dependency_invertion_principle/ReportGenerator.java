package dependency_invertion_principle;


/*
Dependency inversion principle (DIP)

The principle states that we must use abstraction (abstract classes and interfaces)
 instead of concrete implementations.

*High-level modules should not depend on low-level modules.
Both should depend on abstractions.

*Abstractions should not depend on details.
Details should depend on abstractions.

*e principle encourages you to rely on interfaces or abstract classes to decouple
your code and make it easier to extend, maintain, and test.

 */


interface ReportGenerator {
    void generateReport();
}




/*

Dependency inversion principle (DIP)  violation  Example



ReportService directly depends on concrete implementations of report generators
 (PDFReportGenerator and HTMLReportGenerator).
 This leads to high coupling between the high-level and low-level modules.


 To adhere to the Dependency Inversion Principle,
  you should introduce abstractions (interfaces or abstract classes)


class PDFReportGenerator {
    public void generatePDFReport() {
        // PDF generation logic
    }
}

class HTMLReportGenerator {
    public void generateHTMLReport() {
        // HTML generation logic
    }
}

class ReportService {
    private PDFReportGenerator pdfGenerator;
    private HTMLReportGenerator htmlGenerator;

    public ReportService() {
        pdfGenerator = new PDFReportGenerator();
        htmlGenerator = new HTMLReportGenerator();
    }

    public void generatePDFReport() {
        pdfGenerator.generatePDFReport();
    }

    public void generateHTMLReport() {
        htmlGenerator.generateHTMLReport();
    }
}


 */
