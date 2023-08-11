class MyThread extends Thread{
        MyThread(ThreadGroup tg, String str){
                super (tg , str);
        }
        public void run(){
                System.out.println(Thread.currentThread());
        }
}
class ThreadGroupDemo{
        public static void main(String[] ar){
                ThreadGroup PthreadGP = new ThreadGroup ("core2web");
                MyThread obj1 = new MyThread(PThreadGP,"c++");
                MyThread obj2 = new MyThread(PThreadGP,"JAVA");
                MyThread obj3 = new MyThread(PThreadGP,"python");

                obj1.start();
                obj2.start();
                obj3.start();

                ThreadGroup CthreadGP = new ThreadGroup ("incubator");

                 MyThread obj4 = new MyThread(CThreadGP,"flutter");
                 MyThread obj5 = new MyThread(CThreadGP,"reactjs");
                 MyThread obj6 = new MyThread(CThreadGP,"bootstap");

                obj4.start();
                obj5.start();
                obj6.start();
        }
}





























