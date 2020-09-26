package AbstractFactoryMethodSolution;

abstract class MovieFactoryInterface {
    abstract HollyWoodMovieInterface getHollyWoodMovie();
    abstract BollyWoodMovieInterface getBollyWoodMovie();
}

class ActionMovieFactory extends MovieFactoryInterface{

    @Override
    HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodActionMovie();
    }

    @Override
    BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodActionMovie();
    }
}
class ComedyMovieFactory extends MovieFactoryInterface{

    @Override
    HollyWoodMovieInterface getHollyWoodMovie() {
        return new HollyWoodComedyMovie();
    }

    @Override
    BollyWoodMovieInterface getBollyWoodMovie() {
        return new BollyWoodComedyMovie();
    }
}