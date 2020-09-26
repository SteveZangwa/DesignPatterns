package AbstractFactoryMethodSolution;

        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class FactoryProducerTest {

    @Test
    public void Display() throws Exception {
        FactoryProducer factoryProducer = new FactoryProducer();
        MovieFactoryInterface actionMovies = factoryProducer.getFactory("Action");
        HollyWoodMovieInterface hollyWoodMovieInterface = actionMovies.getHollyWoodMovie();
        BollyWoodMovieInterface bollyWoodMovieInterface = actionMovies.getBollyWoodMovie();

        //
        System.out.println("\n Action movies are: " );
        System.out.println(hollyWoodMovieInterface.getMovieName());
        System.out.println(bollyWoodMovieInterface.getMovieName());


        MovieFactoryInterface comedyMovies = factoryProducer.getFactory("Comedy");
        HollyWoodMovieInterface hollyWoodMovieInterface1 = comedyMovies.getHollyWoodMovie();
        BollyWoodMovieInterface bollyWoodMovieInterface1 = comedyMovies.getBollyWoodMovie();

        //
        System.out.println("\n Comedy movies are: ");
        System.out.println(hollyWoodMovieInterface1.getMovieName());
        System.out.println(bollyWoodMovieInterface1.getMovieName());
    }
}