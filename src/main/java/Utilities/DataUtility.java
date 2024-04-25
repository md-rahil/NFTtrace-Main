package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataUtility {
	
	public String dataFromPropertiesFile(String key) throws Throwable
	{
		File file=new File("./src/main/resources/Credentials.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pr=new Properties();
		pr.load(fis);
		String value=pr.getProperty(key);
		return value;
		
	}
	
	
//
//	@DataProvider(name="Excel data")
//	public static Object[][] datafromExcelfile() throws Throwable
//	{
//		
//		File file=new File("C:\\Users\\CCL-Mangala\\Documents\\ExcelData.xlsx");
//		//File file=new File("C:\\Users\\CCL-Mangala\\Documents\\RecipientData.xlsx");
//		FileInputStream fis=new FileInputStream(file);
//		Workbook workbook=WorkbookFactory.create(fis);
//		Sheet sheet=workbook.getSheet("Sheet1");
//		int rowcount = sheet.getLastRowNum();
//		
//		int colcount = sheet.getRow(0).getLastCellNum();
//		
//		
//		Object[][] data=new Object[rowcount][colcount];
//		
//		
//		for(int i=0;i<rowcount;i++)
//		{
//			Row rowdata = sheet.getRow(i+1);
//			
//			for(int j=0;j<colcount;j++)
//			{
//				Cell cellvalue = rowdata.getCell(j);
//			CellType cellType = cellvalue.getCellType();
//////			
//				
	
	
	
@DataProvider(name="Recipient")
public String[][] getData() throws Throwable
{
	//String path="C:\\Users\\CCL-Mangala\\Documents\\RecipientData.xlsx";
	//String path="C:\\Users\\CCL-Mangala\\Documents\\AccountSettingsData.xlsx";
//	String path="C:\\Users\\CCL-Mangala\\Documents\\ExcelData.xlsx";
//	String path="C:\\Users\\CCL-Mangala\\Documents\\NFTDocumentData.xlsx";
//	String path="C:\\Users\\CCL-Mangala\\Documents\\NFTCertificateData.xlsx";
//	String path="C:\\Users\\CCL-Mangala\\Documents\\SuperAdminPlannerData.xlsx";
	// String path="C:\\Users\\CCL-Mangala\\Documents\\SuperAdminModellerData.xlsx";
	String path="C:\\Users\\CCL-Mangala\\Documents\\ProjectData.xlsx";
	
	ExcelUtility excel=new ExcelUtility(path);
	
	int totalrows=excel.getRowCount("Sheet1");
	int totalcols=excel.getCellCount("Sheet1", 1);
	
	
	String recipientdata[][]=new String[totalrows][totalcols];
	
	
			for(int i=1;i<=totalrows;i++)
			{
				for(int j=0;j<totalcols;j++)
				{
					recipientdata[i-1][j]=excel.getCellData("Sheet1", i, j);
				}
			}
	
	

return recipientdata;
}			
	
	
}

