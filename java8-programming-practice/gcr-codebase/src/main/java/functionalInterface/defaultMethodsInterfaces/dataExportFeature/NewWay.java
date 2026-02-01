package functionalInterface.defaultMethodsInterfaces.dataExportFeature;

public class NewWay implements DataExport{

	@Override
	public void exportCSV() {
		System.out.println("Exported to CSV");
		
	}

	@Override
	public void exportPDF() {
		System.out.println("exported to PDF");
	}
	
	public void exportJSON() {
		System.out.println("exported to JSON");
	}

}
