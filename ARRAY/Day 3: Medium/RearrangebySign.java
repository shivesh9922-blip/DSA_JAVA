import java.util.*;
class RearrangebySign {
public static ArrayList<Integer> reArrangeBySign(ArrayList<Integer> alist){
int n=alist.size();
ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(n,0));
int posIndex=0;
int negIndex=1;
for(int i=0;i<n;i++)
{
if(alist.get(i)<0)
{
ans.set(negIndex,alist.get(i));
negIndex+=2;
}
else
{
ans.set(posIndex,alist.get(i));
posIndex+=2;
}
}
return ans;
}
public static void main(String[] args) {
ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
ArrayList<Integer> ans = reArrangeBySign(A);
for (int i = 0; i < ans.size(); i++) {
System.out.print(ans.get(i) + " ");
}
}
}
