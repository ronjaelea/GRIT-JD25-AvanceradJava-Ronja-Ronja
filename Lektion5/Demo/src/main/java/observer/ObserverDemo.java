package observer;

public class ObserverDemo {

    public static void Demo() {
        NewsAgency TT = new NewsAgency();
        TT.addObserver(new NewsChannel("Sydsvenska Dagbladet"));
        Observer skd = new NewsChannel("Skånska Dagbladet");
        TT.addObserver(skd);
        TT.addObserver(new NewsChannel("Norra Skånes Dagblad"));

        TT.reportNewNews("Max IV räddas i sista stund – får pengar till hyra och el");
        TT.removeObserver(skd);
        TT.reportNewNews("\"Kåtbockarna under porrstjärnan\" tar Gävlebocken på sängen");

    }


}
