package orders;

import java.util.ArrayDeque;
import java.util.Deque;

//В ресторан периодически попадает заказ. У заказа есть время, когда он был сделан (milliseconds from 1970 1 Jan).
// Для каждого заказа необходтмо установить количество заказов, сделанных за 15 (20,N) минут до него
//* @param orderTimes - массив отсортированных по времени моментов, когда происходили заказы
//* @param minutes
//* @return для соответствующего заказа - количество заказов, сделанных в предыдущие minutes минут
//* public int[] countOrderNumber(long[]orderTimes,int minutes)
public class OrdersService {

    public int[] countOrdersNumber(long[] orderTimes, int minutes) {
        int[] res = new int[orderTimes.length];
        Deque<Long> longDeque = new ArrayDeque<>();
        long mils = minutes + 60L + 1000;

        int i = 0;
        for (long orderTime : orderTimes) {
            longDeque.addLast(orderTime);

            while (orderTime - longDeque.getFirst() > mils) {
                longDeque.removeFirst();

                res[i++] = longDeque.size() - 1;
            }
        }
        return res;

    }
}
