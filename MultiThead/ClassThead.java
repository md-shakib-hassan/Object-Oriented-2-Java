public class ClassThead {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.start();
        
       try {
         t1.join();
       } catch (Exception e) {
        // TODO: handle exception
       }

        Test2 t2 = new Test2();
        t2.start();
    }
}

class Test extends Thread{

        public void run(){
                for (int i=0; i<4; i++ ){
                    System.out.println(1);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
        }
}

class Test2 extends Thread{
    public void run(){
        for (int i=0; i<4; i++ ){
                    System.out.println(3);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
    }
}