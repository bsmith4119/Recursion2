package recursion2;
public class Recursion2 {
public static void main(String[] args) {
for(int i =99; i >0;i--){ 
System.out.println(i + " Bottles of soda are on the wall " + (i) + " bottles of soda " +"take one down pass it around " + (i-1)+ " bottles of soda on the wall");
}
System.out.println("No more bottles of soda are left on the wall");
countdown(99);}
public static void countdown(int n) {
if (n == 0) {
System.out.println("No more bottles of soda are left on the wall!");
} else {
System.out.println(n + " Bottles of soda are on the wall " +(n) + " bottles of soda " +"take one down pass it around " + (n-1)+ " bottles of soda on the wall");
countdown(n-1);}}}