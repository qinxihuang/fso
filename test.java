public class Beersong {
public static void main (String[] args){
int beernum =99;
String word = "bottle";
while (beernum>0){
if (beernum == 1){
word = "bootle";
}

System.out.print(beernum+""+word+"of beer on the wall");
System.out.println(beernum+""+"of beer");
System.out.println("Take one down.");
System.out.println("passit around.");
beernum = beernum -1;

   if (beernum>0); {
     System.out.println(beernum+""+"of beer on wall");
   }
   {
     System.out.println("No more bottles of beer on the wall");
   }
}
   
————————————————
版权声明：本文为CSDN博主「Aurora妍」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_16510189/article/details/79050691
