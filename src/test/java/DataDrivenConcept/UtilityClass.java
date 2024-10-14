package DataDrivenConcept;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilityClass {

    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static XSSFCellStyle style;

    public static int getRowCount(String filename,String sheetname) throws IOException {
        fi=new FileInputStream(filename);
        wb=new XSSFWorkbook(fi);
        sheet=wb.getSheet(sheetname);
        int rowcount= sheet.getLastRowNum();

        fi.close();
        wb.close();
        return rowcount;
    }

    public static int getColumnCount(String filename,String sheetname,int rownum) throws IOException {
        fi=new FileInputStream(filename);
        wb=new XSSFWorkbook(fi);
        sheet=wb.getSheet(sheetname);
        row=sheet.getRow(rownum);

        int cellNum=row.getLastCellNum();

        fi.close();
        wb.close();
        return cellNum;
    }

    public static String getCellData(String filename,String sheetname,int rownum,int cellnum) throws IOException {
        fi=new FileInputStream(filename);
        wb=new XSSFWorkbook(fi);
        sheet=wb.getSheet(sheetname);
        row=sheet.getRow(rownum);
        cell=row.getCell(cellnum);
        String data;
        try
        {
            data=cell.toString();
        }catch (Exception e){
           data="";
        }
        fi.close();
        wb.close();
        return data;
    }

    public static void setCellData(String filename,String sheetname,int rownum,int cellnum,String data) throws IOException {
        fi=new FileInputStream(filename);
        wb=new XSSFWorkbook(fi);
        sheet=wb.getSheet(sheetname);
        row=sheet.getRow(rownum);
        cell=row.createCell(cellnum);

        fo=new FileOutputStream(filename);
        cell.setCellValue(data);
        wb.write(fo);

        fi.close();
        wb.close();
        fo.close();
    }

    public static void fillGreenColor(String filename,String sheetname,int rownum,int cellnum) throws IOException {
        fi=new FileInputStream(filename);
        wb=new XSSFWorkbook(fi);
        sheet=wb.getSheet(sheetname);
        row=sheet.getRow(rownum);
        cell=row.getCell(cellnum);

        style=wb.createCellStyle();
        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);

        fo=new FileOutputStream(filename);
        wb.write(fo);

        fi.close();
        wb.close();
        fo.close();
    }

    public static void fillRedColor(String filename,String sheetname,int rownum,int cellnum) throws IOException {
        fi=new FileInputStream(filename);
        wb=new XSSFWorkbook(fi);
        sheet=wb.getSheet(sheetname);
        row=sheet.getRow(rownum);
        cell=row.getCell(cellnum);

        style=wb.createCellStyle();
        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);

        fo=new FileOutputStream(filename);
        wb.write(fo);

        fi.close();
        wb.close();
        fo.close();
    }



}
