public class AssamObserver implements Observer {

    @Override
    public void onUpdate(News news) {
        System.out.println("Delhi Branch : " + news);
    }

    @Override
    public NewsType getNewsType() {
        return NewsType.ASSAM;
    }
}
