public class Main {
    //1.написать метод 100 раз печатающий char и вывести на экран результат
    // его работы для двух потоков. В конце должно выводиться "end of main"

    //2. Тараканьи бега
    // Есть 10 тараканов. Им нужно пробежать 10 см. Каждый сантиметр таракан пробегает
    // за от 100 до 150 миллисекунд. Тараканы бегут одновременно. Составить таблицу
    // пробега ( в которой указано имя таракана и его результат)
    // Tarakan_1 ran the distance within 1234 millisec
    //minStepTime, maxStepTime, distance, startTime, name

    public static void main(String[] args) throws InterruptedException {
        Character ch = 'g';
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printChar(ch);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printChar(ch);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("end of main");
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.setDaemon(true);
        thread3.start();
        thread3.join();
    }

    public synchronized static void printChar(char ch) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(ch);
        }
    }
}