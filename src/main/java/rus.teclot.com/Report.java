package rus.teclot.com;

import java.io.*;
import java.lang.StringBuilder;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Report{

    public static void main(String[] args) {
//        String fileTxtName, fileExcelName;
        ReportRow reportRow;
        StringBuilder fileContent = new StringBuilder();
        StringTokenizer strTokenizer ;
        String txtFileName = args[0];
        String excelFileName = args[1];
        System.out.println("Input txt file name -->"+txtFileName);
        System.out.println("Input excel file name -->"+excelFileName);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(txtFileName),"UTF-8"))){
            List<ReportRow> rows = new ArrayList<ReportRow>();
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                fileContent.append(sCurrentLine).append("~");
            }
            String fileContentAsString = fileContent.toString();
            fileContentAsString = fileContentAsString.substring(0, fileContentAsString.length()-1);
//            System.out.println(fileContentAsString);
            strTokenizer = new StringTokenizer(fileContentAsString, "~");
            while(strTokenizer.hasMoreTokens()){
//                System.out.println("-->"+strTokenizer.nextToken());
                StringTokenizer rowTokenizer = new StringTokenizer(strTokenizer.nextToken(), ";");
                while(rowTokenizer.hasMoreElements()){
                    reportRow = new ReportRow();
                    reportRow.setTenderName(rowTokenizer.nextToken());
                    reportRow.setCountry(rowTokenizer.nextToken());
                    reportRow.setOrganizator(rowTokenizer.nextToken());
                    reportRow.setParticipant(rowTokenizer.nextToken());
                    reportRow.setBilling(rowTokenizer.nextToken());
                    reportRow.setStatus(rowTokenizer.nextToken());
                    reportRow.setWinner(rowTokenizer.nextToken());
                    reportRow.setAmountStatus(rowTokenizer.nextToken());
                    reportRow.setCurrency(rowTokenizer.nextToken());
                    reportRow.setSellPrice(rowTokenizer.nextToken());
                    reportRow.setFreeWithVat(rowTokenizer.nextToken());
                    reportRow.setIncomeBalance(rowTokenizer.nextToken());
                    reportRow.setOutcomeBalance(rowTokenizer.nextToken());
                    reportRow.setBlockedAmount(rowTokenizer.nextToken());
                    reportRow.setDiscount(rowTokenizer.nextToken());
                    System.out.println(reportRow.toString());
                    rows.add(reportRow);
                }
            }
            FileInputStream fileInputStream = new FileInputStream(excelFileName);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            for (int i=1; i<= rows.size(); i++){
                Row row = sheet.createRow(i);
                row.createCell(0).setCellValue(rows.get(i - 1).getTenderName());
                row.createCell(1).setCellValue(rows.get(i-1).getCountry());
                row.createCell(2).setCellValue(rows.get(i-1).getOrganizator());
                row.createCell(3).setCellValue(rows.get(i-1).getParticipant());
                row.createCell(4).setCellValue(rows.get(i-1).getBilling());
                row.createCell(5).setCellValue(rows.get(i-1).getStatus());
                row.createCell(6).setCellValue(rows.get(i-1).getWinner());
                row.createCell(7).setCellValue(rows.get(i-1).getAmountStatus());
                row.createCell(8).setCellValue(rows.get(i-1).getCurrency());
                row.createCell(9).setCellValue(rows.get(i-1).getSellPrice());
                row.createCell(10).setCellValue(rows.get(i-1).getFreeWithVat());
                row.createCell(11).setCellValue(rows.get(i-1).getIncomeBalance());
                row.createCell(12).setCellValue(rows.get(i-1).getOutcomeBalance());
                row.createCell(13).setCellValue(rows.get(i-1).getBlockedAmount());
                row.createCell(13).setCellValue(rows.get(i-1).getDiscount());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(excelFileName);
            workbook.write(fileOutputStream);
            fileOutputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NoSuchElementException nsel){
            System.out.println("Ошибка в содержание txt документа, пожалуйста проверти и перезапустите bat файл");
        }

    }
}