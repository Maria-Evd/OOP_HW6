public class Document {
    private long id;
    private String number;
}
public interface ReportGenerator {
    void generateReport(Document document);
}
public class PDFReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(Document document) {
        // логика для формирования PDF-отчета
    }
}
public class JSONReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(Document document) {
        // логика для формирования JSON-отчета
    }
}
public class XMLReportGenerator implements ReportGenerator {
    @Override
    public void generateReport(Document document) {
        // логика для формирования XML-отчета
    }
}