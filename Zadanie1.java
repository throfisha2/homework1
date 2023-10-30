import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
1. Задать массив целых чисел длинной N эл.
2. Поменять 1-й и последний элемент массива
3. Вывести массив на экран
*/

public class Zadanie1
{
   public static void main (String[] args) throws IOException
    {
        // ввод массива с клавиатуры
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите длинну массива: ");
        int l=Integer.parseInt(br.readLine());
        int [] array=new int[l];

        System.out.print("Введите элементы массива: ");
          for (int i=0; i<l;i++)
          {
              array[i]=Integer.parseInt(br.readLine());
          }

        // замена элементов 1го и последнего
          int a=array[0];
          array[0]=array[l-1];
          array[l-1]=a;

        // вывод массива
          System.out.print("Массив: "+ Arrays.toString(array));
    }
}
