class Message implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Message " +Thread.currentThread().getName()+" "+ i);
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args){
        Thread t1=new Thread(new Message(),"Thread-1");
        Thread t2=new Thread(new Message(),"Thread-2");
        t1.start();
        t2.start();
        
    }
}
