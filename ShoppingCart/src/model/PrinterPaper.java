package model;

public class PrinterPaper extends Product {
	
	private PrinterPaperType paperType;
	
	public PrinterPaper(String id,String name){
		this.setId(id);
		this.setProductName(name);
	}

	public PrinterPaperType getPaperType() {
		return paperType;
	}

	public void setPaperType(PrinterPaperType paperType) {
		this.paperType = paperType;
	}

}
