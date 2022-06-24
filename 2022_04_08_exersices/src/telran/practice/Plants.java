package telran.practice;

public abstract class Plants {
    private String name;
    private int age;
    private int higth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHigth() {
        return higth;
    }

    public void setHigth(int higth) {
        this.higth = higth;
    }

    protected Plants(String name, int age, int higth) {
        this.name = name;
        this.age = age;
        this.higth = higth;
    }

    public abstract int  getGrownPerSeason();
    public void addYearToAge(){
        this.age++;
    }

    public void doSpring(){
        addYearToAge();
        setHigth(getHigth()+getGrownPerSeason());
        System.out.println(getName()+"has grown in Spring, " + getHigth());
    }


 public abstract void doSummer();
 public abstract void doAutumn();
 public void doWinter(){
     System.out.println();
 }


}
