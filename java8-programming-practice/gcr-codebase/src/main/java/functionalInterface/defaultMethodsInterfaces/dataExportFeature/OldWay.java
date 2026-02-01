package functionalInterface.defaultMethodsInterfaces.dataExportFeature;

public class OldWay implements DataExport{

	@Override
	public void exportCSV() {
		System.out.println("Exported to CSV");
		
	}

	@Override
	public void exportPDF() {
		System.out.println("exported to PDF");
	}
	
}
