import java.util.ArrayList;
import java.util.List;

public class CentralAjTak {
//    Observers observers;
    List<Observer> observerList = new ArrayList<>();

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    public void update(News news) {
        for(Observer observer : observerList) {
            if (observer.getNewsType() == news.newsType) {
                observer.onUpdate(news);
            }
        }
    }
}
