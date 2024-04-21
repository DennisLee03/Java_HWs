import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;

class JsoupExample {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://pd2-hw3.netdb.csie.ncku.edu.tw/").get();
            System.out.println(doc.title());
            Elements cells = doc.select("td");
            for (Element cell : cells) {
                System.out.println(cell.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}