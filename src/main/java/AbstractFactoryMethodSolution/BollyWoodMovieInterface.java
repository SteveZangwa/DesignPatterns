package AbstractFactoryMethodSolution;

interface BollyWoodMovieInterface {
    String getMovieName();
}

class BollyWoodActionMovie implements BollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Bang Bang is a BollyWood action movie";
    }
}

class BollyWoodComedyMovie implements BollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "Jackie chan is a BollyWood comedy movie";
    }
}
