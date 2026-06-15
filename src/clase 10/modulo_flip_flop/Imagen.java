package clase;

public class Imagen extends Moderable {
    private String url;

    public Imagen(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}