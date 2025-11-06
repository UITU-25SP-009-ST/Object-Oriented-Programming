
// OOPs : Lab-5

// Task - 1
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;
// public class Main{
// public static void main(String[] args){
// Scanner in = new Scanner(System.in);
// System.out.print("Enter Array size : ");
// int n = in.nextInt();
// int[] arr = new int[n];
// for(int i = 0; i < arr.length; i++){
// System.out.print("Value on index : ");
// arr[i] = in.nextInt();
// }
// for(int j = 0; j < arr.length; j++){
// System.out.println("Element at index " + j + " : " + arr[j]);
// }
// }
// }

// Task - 2
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;
// public class Main{
// public static void main(String[] args){
// Scanner in = new Scanner(System.in);
// System.out.print("Enter Array size : ");
// int n = in.nextInt();
// int[] arr = new int[n];
// for(int i = 0; i < arr.length; i++){
// System.out.print("Value on index : ");
// arr[i] = in.nextInt();
// }
// int sum = 0;
// for(int j = 0; j < arr.length; j++){
// sum += arr[j];
// System.out.println("Element at index " + j + " : " + arr[j]);
// }
// Double average = (double)sum/n;
// System.out.println("Sum = " + sum + " and Average = " + average);
// }
// }

// Task - 3
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;
// public class Main{
// public static void main(String[] args){
// Scanner in = new Scanner(System.in);
// System.out.print("Enter Array size : ");
// int n = in.nextInt();
// int[] arr = new int[n];
// int max,min;
// for(int i = 0; i < arr.length; i++){
// System.out.print("Value on index : ");
// arr[i] = in.nextInt();
// }
// max = arr[0];
// min = arr[0];
// for(int j = 1; j < arr.length; j++){
// if(max < arr[j]){
// max = arr[j];
// }
// else if(min > arr[j]){
// min = arr[j];
// }
// }
// System.out.println("Maximum value = " + max + ", Minimum value = " + min);
// }
// }

// Task - 4
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;
// public class Main{
// public static void main(String[] args){
// Scanner in = new Scanner(System.in);
// System.out.print("Enter Array size\nNumber of Rows : ");
// int r = in.nextInt();
// System.out.print("Number of Columns : ");
// int c = in.nextInt();
// int[][] arr = new int[r][c];
// for(int i = 0; i < arr.length; i++){
// for(int j = 0; j < arr[0].length; j++){
// System.out.print("Value on Row " + i + " and Column "+ j + " : ");
// arr[i][j] = in.nextInt();
// }
// }
// for(int k = 0; k < arr.length; k++){
// System.out.print("[ ");
// for(int l = 0; l < arr[0].length; l++){
// System.out.print(arr[k][l]+ " " );

// }
// System.out.print("]\n");
// }
// }
// }

// Task - 5
// Abdul Basit Ali : 25SP-009-ST
// import java.util.Scanner;
// public class Main{
// public static void main(String[] args){
// Scanner in = new Scanner(System.in);
// System.out.print("Enter Array size\nNumber of Rows : ");
// int r = in.nextInt();
// System.out.print("Number of Columns : ");
// int c = in.nextInt();
// int[][] arr = new int[r][c];
// for(int i = 0; i < arr.length; i++){
// for(int j = 0; j < arr[0].length; j++){
// System.out.print("Value on Row " + i + " and Column "+ j + " : ");
// arr[i][j] = in.nextInt();
// }
// }
// int sumOfRow;
// int sumOfColumn;
// for(int k = 0; k < arr.length; k++){
// sumOfRow = 0;
// sumOfColumn = 0;
// for(int l = 0; l < arr[0].length; l++){
// sumOfColumn += arr[l][k];
// sumOfRow += arr[k][l];
// }
// System.out.print("Sum of Row " + k + " : " + sumOfRow);
// System.out.println(" : Sum of Column " + k + " : " + sumOfColumn);
// }
// }
// }