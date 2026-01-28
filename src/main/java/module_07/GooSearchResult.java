package core.com.module_07;

import java.net.URI;

class GooSearchResult {
    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        if (url == null) return null;

        String u = url.trim();
        if (!u.matches("(?i)^[a-z][a-z0-9+.-]*://.*$")) {
            u = "http://" + u;
        }
        URI uri = URI.create(u);
        String host = uri.getHost();

        return host;
    }
}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}