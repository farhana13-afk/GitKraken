public class GithubKraken implements Runnable
{
    public static void main(String[] args)
    {
        GithubKraken[] thread1000 = new GithubKraken[1000];
        for(int i=0; i< thread1000.length; i++)
        {
            thread1000[i] = new GithubKraken();
        }
    }

    @Override
    public void run() {

    }
}
