package Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_handle {

	public static void main(String[] args) throws IOException {
		
 
 		FileInputStream stream = new FileInputStream("D:\\Excel\\Resources\\TEST_DATA.xlsx");
	 	XSSFWorkbook wb = new XSSFWorkbook(stream);
	 	
	 	XSSFSheet t = wb.getSheetAt(0);
	 
	 	String y = t.getSheetName();
	 	System.out.println(y);
	 	 
	 	XSSFRow z= t.getRow(5);
	 	XSSFCell x= z.getCell(2);
	 	//String m=x.getStringCellValue();
	 	int m = (int) x.getNumericCellValue();
	 	System.out.println(m);
	 	 
	 	
	 	
	 //	XSSFCell g=z.getCell(2);
	 	//System.out.println(z);
	 	//System.out.println(x);
	}
}
