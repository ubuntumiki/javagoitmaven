package module_13.habrparse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HabrArticleParserTests {
    public static void main(String[] args) throws IOException {
        String url = "https://habr.com/ru/articles/";

        Document document = Jsoup.connect(url).get();

        Elements articles = document
                .selectFirst("div.tm-votes-meter.tm-data-icons__item")
                .select("article");

        for (Element article : articles) {
            HabrArticleParser parser = new HabrArticleParser(article);

            String title = parser.getTitle();
            int rating = parser.getRating();

            System.out.println(title + " - " + rating);
        }
    }
}
