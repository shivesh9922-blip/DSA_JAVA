class MaxProfit {
public static int maxProfit(int[] prices)
{
int maxProfit=0;
int min=Integer.MAX_VALUE;
for(int i=0;i<prices.length;i++)
{
if(prices[i]<min)
{
min=prices[i];
}
if(prices[i]-min>maxProfit)
{
maxProfit=prices[i]-min;
}
}
return maxProfit;
}
public static void main(String[] args) {
int[] prices={2,1,3,5,6,4};
System.out.println(maxProfit(prices));
}
}
