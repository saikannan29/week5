package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook wBook=new XSSFWorkbook("./data/CreateLead.xlsx");
XSSFSheet sheet = wBook.getSheet("CreateLead");
int rows = sheet.getLastRowNum();
short cells = sheet.getRow(0).getLastCellNum();
for(int i=1;i<=rows;i++)
{
	XSSFRow rowData = sheet.getRow(i);
	System.out.println(rowData);
	for(int j=0;j<cells;j++)
	{
		XSSFCell cellData = sheet.getRow(i).getCell(j);
		System.out.println(cellData);
	}
}
wBook.close();
	}

}
