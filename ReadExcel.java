package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook wBook=new XSSFWorkbook("./data/"+fileName+".xlsx");
XSSFSheet sheet = wBook.getSheet("CreateLead");
int rows = sheet.getLastRowNum();
short cells = sheet.getRow(0).getLastCellNum();
String[][] data=new String[rows][cells];
for(int i=1;i<=rows;i++)
{
	XSSFRow rowData = sheet.getRow(i);
	//System.out.println(rowData);
	for(int j=0;j<cells;j++)
	{
		XSSFCell cellData = rowData.getCell(j);
		String cellValue=cellData.getStringCellValue();
		//System.out.println(cellValue);
		data[i-1][j]=cellValue;
	}
}
wBook.close();
return data;
	}

}
