package functionalInterface.defaultMethodsInterfaces.dataExportFeature;

public class Main {

	public static void main(String[] args) {
		DataExport d = new OldWay();
		d.exportJSON();
		
		OldWay o = new OldWay();
		o.exportCSV();
		o.exportPDF();
		o.exportJSON();
		
		NewWay n = new NewWay();
		n.exportCSV();
		n.exportPDF();
		n.exportJSON();
		
	}

}
