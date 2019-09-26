import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {
    public static void writeIntoExcel(String file) {






        Cell direction = row.createCell(1);          //td
        direction.setCellValue("|    |");

        Cell arrivalTime = row.createCell(3);          //td
        arrivalTime.setCellValue("|     |");
    }
}
