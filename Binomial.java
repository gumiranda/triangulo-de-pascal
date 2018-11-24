import java.math.*;
public class Binomial
{
    public static BigInteger[][] memoized = new BigInteger[19999][19999];
    public static BigInteger comb(int n, int k)
    {
        if (k>n || n<0 || k<0)
            return BigInteger.valueOf(0);
        if (k > n-k)
            return comb(n,n-k);
        if (n>1000 || k>1000) // we could expand the memoized array dynamically
            return BigInteger.valueOf(-1);

        if (memoized[n][k] != null)
            return memoized[n][k];
        // we got here because we haven't computed it yet
        BigInteger result;
        if (n==0 && k==0)
            result = BigInteger.valueOf(1);
        else 
            result= comb(n-1,k-1).add(comb(n-1,k));
        memoized[n][k] = result;
        return result;
    }
	
	
}