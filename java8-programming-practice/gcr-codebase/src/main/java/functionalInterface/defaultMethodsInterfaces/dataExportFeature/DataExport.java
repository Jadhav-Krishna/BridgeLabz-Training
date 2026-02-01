package functionalInterface.defaultMethodsInterfaces.dataExportFeature;

public interface DataExport {
	
	void exportCSV();
	void exportPDF();
	
	default void exportJSON() {
		System.out.println("Export to JSON is not supported");
	}

}
