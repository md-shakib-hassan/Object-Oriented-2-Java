public class RunnableUse {
    public static void main(String[] args) throws InterruptedException {

        SalaryIncrease emp1 = new SalaryIncrease();
        DailyLabour l1 = new DailyLabour();

        Thread t1 = new Thread(emp1);
        Thread t2 = new Thread(l1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All Work Finished");

    }
}

class SalaryIncrease implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Salary Increase : " + (i * 5) + "%");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }

    }

}

class DailyLabour implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Daily Labour Working");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

        }

    }

}