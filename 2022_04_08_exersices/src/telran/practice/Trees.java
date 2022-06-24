package telran.practice;

public class Trees extends Plants {
    private  static  int TREE_GROW_PER_SEASON = 5;

    public Trees(String name, int age, int higth) {
        super(name, age, higth);
    }

    @Override
    public int getGrownPerSeason() {
        return TREE_GROW_PER_SEASON;
    }

    @Override
    public void doSummer() {
        setHigth(getHigth()+getGrownPerSeason());
        System.out.println(getName()+"has grown in summer, "+getHigth());

    }

    @Override
    public void doAutumn() {
        System.out.println(getName()+"is not growing in Autumn, "+getHigth());
    }
}
