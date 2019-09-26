import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.text.JTextComponent;
import java.io.IOException;
import java.net.URL;

public class html1 {



    public static Document getPage() throws IOException {
        String url = "http://kiev.elektrichki.net/raspisanie/boyarka/";
        Document page = Jsoup.parse(new URL(url),3000);
        return page;
    }

    public static void main(String[] args)throws IOException{
        Document page = getPage();

        Element tableWth = page.select("table[class=sec_2_cont_c_table]").first();
        Elements names = tableWth.select("tr");
        //Elements values = tableWth.select("td");

        for(Element name : names) {
            int count = 0;
            String date = name.select("td").text();
            String str = (date+" \t");
            //System.out.println(str);
            for (String retval : date.split(" ")) {
                System.out.println(count + retval);
                count++;
                switch (count){
                    case 0:
                        retval = numTrain;
                    case 1:
                        retval = wayBegin;
                    case 3:
                        retval = wayEnd;
                    case 4:
                        retval = timeArrive;
                    case 5:
                        retval = timeDepart;
                    case 8:
                        retval = periodicity;

                }
            }

        }
    }
}
