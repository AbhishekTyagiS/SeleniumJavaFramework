package Utils;

import java.io.IOException;

public class ExcelutilD {

	
	static	String ProjectPath ;
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		ProjectPath = System.getProperty("user.dir");
		Excelutil Excels = new Excelutil(ProjectPath+ "/excel/data.xlsx", "Sheet1");
		

		Excels.getRowcount();
		Excels.getRowdataString(0,0);
		Excels.getRowdataint(1,1);
		
		
		
	}
	
	
}
