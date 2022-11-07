package day15;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcel {

    @Test
    public void WriteExcelTest1() throws IOException {
        //1)Yeni bir Class olusturalim WriteExcel
        //2) Yeni bir test method olusturalim writeExcelTest()
        //3) Adimlari takip ederek 1.satira kadar gidelim
        String dosyaYolu = "src/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        // 4) 4.hucreye yeni bir cell olusturalim
        //5) Olusturdugumuz hucreye “Nufus” yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nüfus");
        // 6) 2.satir nufus kolonuna 1500000 yazdiralim
        // 7) 10.satir nufus kolonuna 250000 yazdiralim
        // 8) 15.satir nufus kolonuna 54000 yazdiralim
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue("1.500.000");
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("2.500.000");
        workbook.getSheet("Sayfa1").getRow(3).createCell(4).setCellValue("11.500.000");
        workbook.getSheet("Sayfa1").getRow(4).createCell(4).setCellValue("6.300.000");
        workbook.getSheet("Sayfa1").getRow(5).createCell(4).setCellValue("9.600.000");
        workbook.getSheet("Sayfa1").getRow(6).createCell(4).setCellValue("8.650.000");
        workbook.getSheet("Sayfa1").getRow(7).createCell(4).setCellValue("541.600.000");
        workbook.getSheet("Sayfa1").getRow(8).createCell(4).setCellValue("9.690.000");
        workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue("9.600.000");
        // 9)Dosyayi kaydedelim
        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        // 10)Dosyayi kapatalim
        workbook.write(fos);
        fis.close();
        fos.close();workbook.close();
    }
}
