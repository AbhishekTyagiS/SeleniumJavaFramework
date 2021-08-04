package Utils;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {



	static	XSSFWorkbook Work;

	static XSSFSheet sheet;

	public Excelutil (String Epath, String Esheet) {

		try {

			
			Work = new XSSFWorkbook (Epath);
			sheet = Work.getSheet(Esheet);
		}
		catch (Exception e) {

			e.printStackTrace();

		}




	}

	public static void main(String[] args) throws IOException {

		getRowdataString(0,0);
		getRowdataint(1,1);
	}



	public static int getRowcount() 

	{
		int rowC=0;
		try {

		 rowC = sheet.getPhysicalNumberOfRows();
		//System.out.println("no of Row =" + rowC);
		

	}
	catch (Exception exp) 
		{
		
		}
		return rowC;
	}
	
	public static int getcolcount() 

	{
		int colC=0;
		try {

		 colC = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("no of Row =" + colC);
	}
	catch (Exception exp) 
		{
		
		}
		return colC;
	}


	public static String getRowdataString(int rowNum, int colNum)
	
	{
		String CellD = null;	
		try {
		CellD = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(CellD);
		
		}
	catch (Exception exp) {	
	}
	
	return CellD;
	}
	
	public static void getRowdataint(int rowNum, int colNum) throws IOException

	{



		double CellD1 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(CellD1);

	}

}
