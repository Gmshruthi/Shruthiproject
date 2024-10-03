package Git.src.practise.Thread;

class PrintNumbers implements Runnable {
     int start;
     int end;
    public PrintNumbers(int start, int end){
        this.start= start;
        this.end= end;
    }
    @Override
    public void run() {
        for(int i=start;i<=end;i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Thread thread1= new Thread(new PrintNumbers(1, 5));
        Thread thread2= new Thread(new PrintNumbers(6, 10));
        thread1.start();
        thread2.start();
        }
    }


