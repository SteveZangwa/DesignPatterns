package AbstractFactoryMethodSolution;

public class FactoryProducer {
    public MovieFactoryInterface getFactory(String choice) {

        if(choice.equalsIgnoreCase("Comedy")) {
            return new ComedyMovieFactory();
        }
        else if (choice.equalsIgnoreCase("Action")){
            return new ActionMovieFactory();
        }
        else {
            return null;
        }
    }

}
