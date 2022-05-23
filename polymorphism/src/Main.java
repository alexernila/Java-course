class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "no plot here";
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Shark eats people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens taking over";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids excape maze";
    }
}

class StarWars extends Movie {
    public StarWars(){
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Luke is back";
    }
}

class Forgetable extends Movie {
    public Forgetable(){
        super ("Forgetable");
    }

    //no plot method
}


    public class Main {
        public static void main(String[] args) {
            for(int i = 1; i<11; i++){
                Movie movie = randomMovie();
                System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
            }
        }

        public static Movie randomMovie(){
            int randomNumber = (int) (Math.random() * 5) + 1;
            System.out.println("Random number is " + randomNumber);
            switch (randomNumber){
                case 1:
                    return new Jaws();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new StarWars();
                case 4:
                    return new MazeRunner();
                case 5:
                    return new Forgetable();
                default:
                    return null;
            }
        }
    }


