import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.text.JTextComponent;
import java.io.IOException;
import java.net.URL;

public class HTMLParser {



    public static Document getPage() throws IOException {
        String url = "http://kiev.elektrichki.net/raspisanie/boyarka/";
        Document page = Jsoup.parse(new URL(url),3000);
        return page;
    }

    public static void main(String[] args,String file)throws IOException{
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet();
        Document page = getPage();

        Element tableWth = page.select("table[class=sec_2_cont_c_table]").first();
        Elements names = tableWth.select("tr");

        //Elements values = tableWth.select("td");

        for(Element name : names) {
            Row row = sheet.createRow(0);//tr
            String date = name.select("td").text();
            Cell nums = row.createCell(0);          //td
            nums.setCellValue(date);
            System.out.println(date+" \t");

        }
    }
}
