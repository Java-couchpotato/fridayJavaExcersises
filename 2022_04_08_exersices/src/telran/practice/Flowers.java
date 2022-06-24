package telran.practice;

public class Flowers extends Plants {
private static int FLOWER_GROWN_PER_SEASON=2;

    public Flowers(String name, int age, int higth) {
        super(name, age, higth);
    }

    @Override
    public int getGrownPerSeason() {
        return FLOWER_GROWN_PER_SEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getName()+" is not growing in summer, but flourishing "+ getHigth());
    }

    @Override
    public void doAutumn() {
        setHigth(0);
        System.out.println(getName()+"is cut to zero in Autumn "+getHigth());

    }
}
