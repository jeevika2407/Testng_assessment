package utils;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviders {
@DataProvider(name="loginDetails",parallel=true)
public Object[][] excelData() throws IOException{
	String loc="C:\\Users\\kirub\\Downloads\\DemoTest2.xlsx";
	return getData(loc,"Sheet1");
}
public String[][] getData(String loc,String sheet) throws IOException{
	String data[][]=null;
	try {
	FileInputStream fis=new FileInputStream(loc);
	XSSFWorkbook wkbk=new XSSFWorkbook(fis);
	XSSFSheet sht=wkbk.getSheet(sheet);
	int r=sht.getPhysicalNumberOfRows();
	int c=sht.getRow(0).getLastCellNum();
	data=new String[r][c];
	for(int i=0;i<r;i++) {
		XSSFRow row=sht.getRow(i);
		for(int j=0;j<c;j++) {
			if(row!=null) {
			Cell cell=row.getCell(j);
			data[i][j]=cell.getStringCellValue();
			}
		}
	}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	return data;
}
}
