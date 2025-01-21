public class _202_Happy_Number {
    public boolean isHappy(int n) {
        //Using LinkedList Cycle Detection Algorithm

        int fast=n;
        int slow=n;
        do{
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));

            if(slow==1)
            {
                return true;
            }
        }while(fast!=slow);
       return false;
    }
    private int squareSum(int n)
    {
        int ans=0;
        while(n>0)
        {
            int rem=n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
    }
}
