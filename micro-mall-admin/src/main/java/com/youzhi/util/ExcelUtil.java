package com.youzhi.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.poi.ss.usermodel.CellType;

/**
 * @author cwj
 * @date 2020/1/20 8:32
 * 出自：https://blog.csdn.net/weixin_42043030/article/details/99686731
 * 基于POI的excel工具类
 */
public class ExcelUtil {
    private static final String XLS ="xls";
    private static final String XLSX ="xlsx";

    /**
     * 读取上传的excel文件
     * @param file
     * @param startRow
     * @param startCell
     * @return
     * @throws Exception
     */
    public static List<String[]> readExcel(MultipartFile file, int startRow, int startCell)throws Exception{
        checkFile(file);
        String fileName = file.getOriginalFilename();
        Workbook workbook = getWorkBook(file,fileName);
        List<String []> list = new ArrayList<>();
        if(workbook != null){
            for(int sheetNum = 0;sheetNum < workbook.getNumberOfSheets();sheetNum++){
                Sheet sheet = workbook.getSheetAt(sheetNum);
                if(sheet == null){
                    continue;
                }
                int firstRowNum  = sheet.getFirstRowNum();
                int lastRowNum = sheet.getLastRowNum();
                for(int rowNum = firstRowNum+startRow;rowNum <= lastRowNum;rowNum++){
                    Row row = sheet.getRow(rowNum);
                    if(row == null){
                        continue;
                    }
                    int firstCellNum = row.getFirstCellNum();
                    int lastCellNum = row.getLastCellNum()+1;
                    String[] cells = new String[lastCellNum];
                    for(int cellNum = firstCellNum + startCell; cellNum < lastCellNum;cellNum++){
                        Cell cell = row.getCell(cellNum);
                        cells[cellNum] = getCellValue(cell);
                    }
                    list.add(cells);
                }
            }
        }
        return list;
    }

    /**
     * 校验文件是否正常
     * @param file
     * @throws Exception
     */
    private static void checkFile(MultipartFile file)throws Exception{
        if (Objects.isNull(file))
            throw new FileNotFoundException("上传文件是空");
        String fileName = file.getOriginalFilename();
        if(!fileName.endsWith(XLS) && !fileName.endsWith(XLSX))
            throw new IOException(fileName + "不是excel文件");
    }

    /**
     * 获取上传文件的工作区
     * @param file
     * @param fileName
     * @return
     */
    private static Workbook getWorkBook(MultipartFile file, String fileName) {
        Workbook workbook = null;
        try {
            InputStream is = file.getInputStream();
            if(fileName.endsWith(XLS)){
                //2003
                workbook = new HSSFWorkbook(is);
            }else if(fileName.endsWith(XLSX)){
                //2007
                workbook = new XSSFWorkbook(is);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workbook;
    }

    /**
     * 获取单元格的值
     * @param cell
     * @return
     */
    private static String getCellValue(Cell cell){
        String cellValue = "";
        if(cell == null){
            return cellValue;
        }
        //把数字当成String来读，避免出现1读成1.0的情况
        if(cell.getCellType() == CellType.NUMERIC){
            cell.setCellType(CellType.STRING);
        }
        //判断数据的类型
        switch (cell.getCellType()){
            case NUMERIC: //数字
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            case STRING: //字符串
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            case BOOLEAN: //Boolean
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case FORMULA: //公式
                cellValue = String.valueOf(cell.getCellFormula());
                break;
            case BLANK: //空值
                cellValue = "";
                break;
            case ERROR: //故障
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }


}
