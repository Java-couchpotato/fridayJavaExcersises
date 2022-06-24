package telran.practice.order;

public class Main {
    public int minOperations(String s) {
        int count=0;

        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                if(s.charAt(i+1)==s.charAt(i+2)){
                    count++;
                }else {
                    count++;
                }
            }
        }return count;
    }


    public static void main(String[] args) {



//	Order order1 = new Order(2,"beef");
//	Order order2 = new Order(2,"beef");
//        System.out.println(order1.equals(order2));
    }
}
