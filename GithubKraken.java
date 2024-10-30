public class GithubKraken implements Runnable
{

    long[] sumArray = new long[1000];
    int count = 0;
    public static void main(String[] args)
    {
        Thread[] threadArray = new Thread[1000];

        for(int i=0; i< threadArray.length; i++)
        {
            threadArray[i] = new Thread(new GithubKraken());
            threadArray[i].start();
            try {
                threadArray[i].join();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        long sum =0;
        for(int i=1; i<=1000000; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        sumArray[count] = sum;
        count++;
    }
}
