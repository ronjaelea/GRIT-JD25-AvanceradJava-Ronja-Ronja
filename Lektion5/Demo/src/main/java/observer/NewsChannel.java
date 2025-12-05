package observer;

public class NewsChannel implements Observer{

    private final String name;
    private String news;

    public NewsChannel(String name) {
        this.name = name;
        news = "";
    }

    @Override
    public void update(String message) {
        System.out.printf(
                "News Channel %s got news: %s\n",
                name,
                message
        );
        this.news += message;
    }

}
