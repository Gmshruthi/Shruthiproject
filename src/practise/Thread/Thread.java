package Git.src.practise.Thread;

class MyThread extends Thread {
    @Override
    public void run()
    {
        int i;
        for( i=1;i<=5;i++) {
            System.out.println("Welcome to Thread :"+i);
        }
    }
    public static void main(String[] args) {
            MyThread thread= new MyThread();
            thread.start();
        }
    }

