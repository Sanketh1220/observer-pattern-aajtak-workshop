import java.lang.reflect.Array;

public class News {
    public String news;
    NewsType newsType;

    @Override
    public String toString() {
        return newsType+ "'s News{\nNews: " + news + "\n}";
    }
}

enum NewsType {
    BIZ,
    DELHI,
    ASSAM;
}