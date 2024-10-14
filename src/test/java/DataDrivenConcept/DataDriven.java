package DataDrivenConcept;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataDriven {

    public void readDataFromExcel() throws IOException {

        FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\datadriven.xlsx");
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fi);
        XSSFSheet xssfSheet=xssfWorkbook.getSheet("Sheet1");
        int totalRows=xssfSheet.getLastRowNum();
        int totalColumns=xssfSheet.getRow(0).getLastCellNum();

        for(int r=1;r<=totalRows;r++)
        {
            XSSFRow row =xssfSheet.getRow(r);
            for(int c=0;c<totalColumns;c++)
            {
              XSSFCell cell =row.getCell(c);
              System.out.print(cell.toString()+"  ");
            }
            System.out.println();
        }
    }

    public void writeDataFromExcel() throws IOException {

        FileOutputStream fi=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writedata.xlsx");
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();

        XSSFSheet xssfSheet=xssfWorkbook.createSheet("data");

        XSSFRow row0=xssfSheet.createRow(0);
        row0.createCell(0).setCellValue("Book Name");
        row0.createCell(1).setCellValue("Price");
        row0.createCell(2).setCellValue("Location");

        XSSFRow row1=xssfSheet.createRow(1);
        row1.createCell(0).setCellValue("Java");
        row1.createCell(1).setCellValue("300");
        row1.createCell(2).setCellValue("Guntur");

        XSSFRow row2=xssfSheet.createRow(2);
        row2.createCell(0).setCellValue("Python");
        row2.createCell(1).setCellValue("250");
        row2.createCell(2).setCellValue("Bengaluru");

        xssfWorkbook.write(fi);

        xssfWorkbook.close();
        fi.close();


    }


    public void writeDynamicDataFromExcel() throws IOException {

        FileOutputStream fi=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writedynamicdata.xlsx");
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();

        XSSFSheet xssfSheet=xssfWorkbook.createSheet("Dynamicdata");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows ");
        int r=sc.nextInt();

        System.out.println("enter no of columns ");
        int c=sc.nextInt();

        for (int i=0;i<=r;i++)
        {
            XSSFRow row=xssfSheet.createRow(i);
            for (int j=0;j<=c;j++)
            {
                System.out.println("enter cell value "+i+" row "+"and "+j+" value");
                row.createCell(j).setCellValue(sc.next());
            }
        }


        xssfWorkbook.write(fi);

        xssfWorkbook.close();
        fi.close();


    }




    public static void main(String[] args) {

        DataDriven d=new DataDriven();

//        try {
//            d.readDataFromExcel();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            d.writeDataFromExcel();
//            System.out.println("data is entered ");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            d.writeDynamicDataFromExcel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
