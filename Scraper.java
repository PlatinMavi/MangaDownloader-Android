

public class Scraper {

    public String[] getImages(String url, String target) {
        String[] returnElements = null;
        try {
            Document doc = Jsoup.connect(url).get();
            // Implement your logic to extract image elements here
            // You may need to use doc.select() to find the image elements based on the "target" class.
        } catch (Exception e) {
            e.printStackTrace();
            returnElements = new String[]{e.toString()};
        }
        return returnElements;
    }

    public static void main(String[] args) {
        Scraper s = new Scraper();
        String[] images = s.getImages("https://armoniscans.com/100-urun-bolum-1-ashibi-yao/", "ts-main-image curdown");
        // Process the returned image elements here
    }
}
