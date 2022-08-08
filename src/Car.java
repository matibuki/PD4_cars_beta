import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    Producent producent;
    private boolean isAutomaticGear;
    Market market;
    private String segment;

    Dimension dimension;

    public boolean isAutomaticGear() {
            return isAutomaticGear;
    }
    public void setAutomaticGear(boolean automaticGear) {
            this.isAutomaticGear = automaticGear;
    }

    public String getSegment() {
            return segment;
    }
    public void setSegment(String segment) {
            this.segment = segment;
    }
    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Car (Producent producent, boolean isAutomaticGear, Market market, String segment, Dimension dimension){
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension = dimension;
    }


    public static void main(String[] args) {
        List<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Poland", 'P'));
        countries.add(new Country("Germany", 'G'));
        countries.add(new Country("Japan", 'J'));
        countries.add(new Country("USA", 'U'));
        countries.add(new Country("Korea", 'K'));

        List<Market> markets = new ArrayList<>();

        String[] marketNames = new String[]{"business", "cargo", "taxi", "transport", "bus"};
        for (int i = 0; i < marketNames.length; i++) {
            Market m = new Market(marketNames[i]);
            int a = randomIndex(5);
            m.addCountry(countries.get(a));
            m.addCountry(countries.get(a));
            m.addCountry(countries.get(a));
            markets.add(m);
        }

        List<Dimension> dimensions = new ArrayList<Dimension>();
        dimensions.add(new Dimension(100, 300, 400));
        dimensions.add(new Dimension(80, 250, 350));
        dimensions.add(new Dimension(81, 210, 1350));
        dimensions.add(new Dimension(82, 220, 2350));
        dimensions.add(new Dimension(83, 240, 4350));
        dimensions.add(new Dimension(84, 270, 1350));
        dimensions.add(new Dimension(90, 250, 2350));
        dimensions.add(new Dimension(80, 240, 750));
        dimensions.add(new Dimension(77, 252, 850));
        dimensions.add(new Dimension(83, 310, 200));

        List<Producent> producents = new ArrayList<Producent>();
        producents.add(new Producent("FSO", "Polonez"));
        producents.add(new Producent("BMW", "X5"));
        producents.add(new Producent("AUDI", "A4"));
        producents.add(new Producent("MERCEDES", "C3"));
        producents.add(new Producent("FSO", "Fiat"));
        producents.add(new Producent("Renault", "Twingo"));
        producents.add(new Producent("Citroen", "Xsara"));
        producents.add(new Producent("Porsche", "Cayenne"));
        producents.add(new Producent("Porsche", "Boxter"));
        producents.add(new Producent("Ferrarri", "f430"));



        List<Car> cars = new ArrayList<Car>();
            cars.add(new Car(producents.get(0), false, markets.get(0), "standard", dimensions.get(0)));
            cars.add(new Car(producents.get(1), true, markets.get(1), "medium", dimensions.get(1)));
            cars.add(new Car(producents.get(2), false, markets.get(2), "premium", dimensions.get(2)));
            cars.add(new Car(producents.get(3), true, markets.get(3), "standard", dimensions.get(3)));
            cars.add(new Car(producents.get(4), true, markets.get(4), "standard", dimensions.get(4)));
            cars.add(new Car(producents.get(5), true, markets.get(4), "premium", dimensions.get(5)));
            cars.add(new Car(producents.get(6), false, markets.get(2), "premium", dimensions.get(6)));
            cars.add(new Car(producents.get(7), false, markets.get(3), "standard", dimensions.get(7)));
            cars.add(new Car(producents.get(8), true, markets.get(3), "standard", dimensions.get(8)));
            cars.add(new Car(producents.get(9), true, markets.get(0), "medium", dimensions.get(9)));
            cars.add(new Car(producents.get(8), true, markets.get(0), "standard", dimensions.get(9)));
            cars.add(new Car(producents.get(7), false, markets.get(1), "premium", dimensions.get(8)));
            cars.add(new Car(producents.get(6), true, markets.get(2), "medium", dimensions.get(7)));
            cars.add(new Car(producents.get(5), true, markets.get(4), "standard", dimensions.get(6)));
            cars.add(new Car(producents.get(4), false, markets.get(3), "premium", dimensions.get(5)));


        System.out.println(" ");
        System.out.println("CAR MODEL TYPE GEARTYPE MARKET HEIGHT WIDTH TRUNKCAPACITY");
        System.out.println(" ");
        for (int i=0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getProducent().getModel() + " " + cars.get(i).getProducent().getType() + " " +
                    cars.get(i).isAutomaticGear() + " " + cars.get(i).getMarket().getName() + " " + cars.get(i).getSegment() +" " +
                    cars.get(i).getDimension().getHeight() + " " + cars.get(i).getDimension().getWidth() + " " +
                    cars.get(i).getDimension().getTrunkCapacity());
        }
//        public void findSpecific() {

            for (int i=0; i < cars.size(); i++) {
                if (cars.get(i).getProducent().getModel().equals("BMW") &&
                        cars.get(i).isAutomaticGear() == true &&
                        cars.get(i).getDimension().getTrunkCapacity() > 300) {
//                    cars.get(i).getMarket()
                    int a = 3;
                    System.out.println("Special BMW found! " + countries.get(a).getCountryName() + " " + countries.get(a).getCountrySign());
                }
//                else {
//                    System.out.println("No BMWs like that!");
//                }
        }


    }

//
//    public static string findBMW(Car a){
//        a = cars;
//        return result;
//
//    }

    public static int randomIndex(int end) {
        Random random = new Random();
        return random.nextInt(end);

    }
}
