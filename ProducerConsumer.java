class BufferUtility
{
    int i;
    boolean item=false;
    public synchronized void set(int i)
    {
        if(item)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Exception handle");
            }
        }
        this.i=i;
        item=true;
        System.out.println("Producer "+i);
        notify();
    }
    public synchronized void get()
    {
        if(!item)
        {
            try
            {
            wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Exception handle");
            }
        }
        item=false;
        System.out.println("Consumer "+i);
        notify();
    }
}
class Producer implements Runnable
{
    BufferUtility u;
    Producer(BufferUtility u)
    {
        this.u=u;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run()
    {
        int i=0;
        while (true) 
        {
            try
            {
                Thread.sleep(1000);
            }            
            catch(InterruptedException e)
            {
                System.out.println("Exception handled");
            }
            u.set(i++);
        }
    }
}
class Consumer implements Runnable
{
    BufferUtility u;
    Consumer(BufferUtility u)
    {
        this.u=u;
        Thread t1=new Thread(this,"Consumer");
        t1.start();
    }
    public void run()
    {
        int i=0;
        while (true) 
        {
            try
            {
                Thread.sleep(1000);
            }            
            catch(InterruptedException e)
            {
                System.out.println("Exception handled");
            }
            u.get();
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        BufferUtility b=new BufferUtility();
        new Producer(b);
        new Consumer(b);
    }
}
