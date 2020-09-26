package AbstractFactoryMethodSolution;

interface HollyWoodMovieInterface {
    String getMovieName();
}
class  HollyWoodActionMovie implements HollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "True lies is hollyWood action Movie";
    }
}
class HollyWoodComedyMovie implements HollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "The jerk is a hollyWood comedy movie";

    }
}
