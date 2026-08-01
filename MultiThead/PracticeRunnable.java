public class PracticeRunnable {
    public static void main(String[] args) {

        SalaryStructure st = new SalaryStructure();

        OffierSt of = new OffierSt();
        Labour l1 = new Labour();

        Thread os = new Thread(of);
        Thread ls = new Thread(l1);
        
        os.start();
        ls.start();
    }
}

class SalaryStructure {
    void Salary() {
        System.out.println("every year 5% increase.");
    }
}

class OffierSt extends SalaryStructure implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("5%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Labour extends SalaryStructure implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("2%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}