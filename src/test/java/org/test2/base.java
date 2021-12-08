package org.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;
           public static void launchbro() {
                WebDriverManager.edgedriver().setup();
                 driver=new EdgeDriver();
}
           public static void max() {
        	   driver.manage().window().maximize();
		}
        public static void launchurl(String url) {
           driver.get(url);
		}
        public static void sendkeys(String ex,WebElement ele) {
            ele.sendKeys(ex);
         }
        public static void clickbtn(WebElement ele) {
             ele.click();
		}
        public static void ss(String imgName) throws IOException {
          TakesScreenshot ts=(TakesScreenshot)driver;
          File ss = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("F:\\New Folder (3)\\Maven\\ss\\"+imgName+".png");
          FileUtils.copyFile(ss, f);
		}
        public static void javasc(WebElement ele) {
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("arguments[0].scrollIntoView(true)", ele);
		}
        public static void alert() {
        	 Alert at = driver.switchTo().alert();
        	    System.out.println(at);
        	    at.accept();
		}
        public static void dropdown(String st,WebElement ele) {
        Select s=new Select(ele);
        s.selectByValue(st);
        boolean ml = s.isMultiple();
        System.out.println(ml);
        List<WebElement> op = s.getOptions();
        for (int i = 0; i < op.size(); i++) {
			WebElement opt = op.get(i);
			String att= opt.getAttribute("value");
			System.out.println(att);
		}        
		}
        public static Actions a;
        public static void movecoursor(WebElement ele) {
           a=new Actions(driver);
          a.moveToElement(ele).perform();
		}
        public static void dragdrop(WebElement ele,WebElement els) {
        a=new Actions(driver);
        a.dragAndDrop(ele, els).perform();
		}
        
        public static void webhandling(int no) {
          Set<String> win = driver.getWindowHandles();
          System.out.println(win);
          List<String> l=new ArrayList<String>();
          l.addAll(win);
          driver.switchTo().window(l.get(no));
		}
        public static void text(WebElement ele) {
        	String tt = ele.getText();
	          System.out.println(tt);
		}
        
        public static void quit() {
              driver.close();
		}
        public static void creatrr(int gr, int cc,String writedata,String sheetname,String filename) throws IOException {
       	 File f=new File("F:\\\\New Folder (3)\\\\Maven\\\\exceel\\\\\\" + filename +".xlsx");
       	 FileInputStream fi=new FileInputStream(f);
            Workbook w=new XSSFWorkbook(fi);
            Sheet s= w.getSheet(sheetname);
            Row cr= s.createRow(gr);
            Cell cl = cr.createCell(cc);
            cl.setCellValue(writedata);
            FileOutputStream fo=new FileOutputStream(f);
            w.write(fo);
            System.out.println("writed...");
		}
       public static void creatcc(int gr, int cc,String writedata,String sheetname,String filename) throws IOException {
       	 File f=new File("F:\\\\New Folder (3)\\\\Maven\\\\exceel\\\\\\" + filename +".xlsx");
       	 FileInputStream fi=new FileInputStream(f);
            Workbook w=new XSSFWorkbook(fi);
            Sheet s= w.getSheet(sheetname);
            Row cr= s.getRow(gr);
            Cell cl = cr.createCell(cc);
            cl.setCellValue(writedata);
            FileOutputStream fo=new FileOutputStream(f);
            w.write(fo);
            System.out.println("writed...");
		}
       public static void update(int gr, int cc,String writedata,String existingword,String sheetname,String filename) throws IOException {
       	 File f=new File("F:\\\\New Folder (3)\\\\Maven\\\\exceel\\\\\\" + filename +".xlsx");
       	 FileInputStream fi=new FileInputStream(f);
            Workbook w=new XSSFWorkbook(fi);
            Sheet s= w.getSheet(sheetname);
            Row cr= s.getRow(gr);
            Cell cl = cr.getCell(cc);
            String scv = cl.getStringCellValue();
            if (scv.equals(existingword)) {
				cl.setCellValue(writedata);
			}
            FileOutputStream fo=new FileOutputStream(f);
            w.write(fo);
		}

   	public static String excel( String sheetName, int rowNum, int cellNum) throws IOException {
   		File f = new File("F:\\New Folder (3)\\Maven\\exceel\\datast.xlsx");

   		FileInputStream fis = new FileInputStream(f);

   		Workbook wb = new XSSFWorkbook(fis);

   		Sheet sheetAt = wb.getSheet(sheetName);

   		Row row = sheetAt.getRow(rowNum);
   		Cell cell = row.getCell(cellNum);

   		int cellType = cell.getCellType();
   		String value;
   		if (cellType == 1) {
   			value = cell.getStringCellValue();
   		} else if (DateUtil.isCellDateFormatted(cell)) {

   			Date dateCellValue = cell.getDateCellValue();
   			SimpleDateFormat s = new SimpleDateFormat("E, MMM dd yyyy");
   			value = s.format(dateCellValue);
   		} else {
   			double numericCellValue = cell.getNumericCellValue();

   			long l = (long) numericCellValue;
   			value = String.valueOf(l);
   		}
   		System.out.println(value);
			return value;
   	}
   	public static void excelCreation(int rowNum, int cellNum, String passValue, String sheetName, String filename)
			throws IOException {
		File f = new File("F:\\New Folder (3)\\Maven\\exceel\\" + filename +".xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet(sheetName);
		Row createRow = createSheet.createRow(rowNum);
		Cell createCell = createRow.createCell(cellNum);
		createCell.setCellValue(passValue);
		FileOutputStream fis = new FileOutputStream(f);
		wb.write(fis);
		System.out.println("writed...");
	}
		}
