import java.util.Date;
import java.lang.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        long codeStartTime = System.currentTimeMillis();

        System.out.println("Hello World!");

        News newsBiz = new News();
        newsBiz.news = "Good Morning! BIHAR";
        newsBiz.newsType = NewsType.BIZ;

        News newsAssam = new News();
        newsAssam.news = "Good Morning! ASSAM";
        newsAssam.newsType = NewsType.ASSAM;

        News newsDelhi = new News();
        newsDelhi.news = "Good Morning! DELHI Branch-1";
        newsDelhi.newsType = NewsType.DELHI;

        News newsDelhi1 = new News();
        newsDelhi1.news = "Good Morning! DELHI Branch-2";
        newsDelhi1.newsType = NewsType.DELHI;

        CentralAjTak centralAjTak = new CentralAjTak();

        BizObserver bizAjTak = new BizObserver();
        AssamObserver assamAjTak = new AssamObserver();
        DelhiObserver delhiAjTak = new DelhiObserver();

        centralAjTak.register(delhiAjTak);
        centralAjTak.register(bizAjTak);
        centralAjTak.register(assamAjTak);

        centralAjTak.update(newsDelhi);
        centralAjTak.update(newsAssam);
        centralAjTak.update(newsBiz);

        centralAjTak.unRegister(delhiAjTak);

        centralAjTak.update(newsDelhi1);

        long codeEndTime = System.currentTimeMillis();
        long timeTaken = codeEndTime - codeStartTime;
        System.out.println("Elapsed milliseconds: " + timeTaken + "millisecs");
    }
}
