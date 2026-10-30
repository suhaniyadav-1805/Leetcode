class Solution {
    public int fib(int n) {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;

        }
       int firstno=0;
       int secondno=1;
       for(int i=1;i<=n;i++)
       {
        int thirdno=firstno + secondno;
        firstno=secondno;
        secondno=thirdno;

       }
       return firstno;

    }
}