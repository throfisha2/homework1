import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
1. Зеркальный переворот массива
*/

public class Zadanie6
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

        // зеркальная сортировка
        reverse(array);

        // вывод массива
        System.out.print("Значение равно: "+ Arrays.toString(array));
    }

    // зеркальная сортировка
    public static void reverse(int[] array)
    {
        int n=array.length;

        for (int i=0; i<n/2; i++)
        {
            int r=array[i];
            array[i]=array[n-1-i];
            array[n-1-i]=r;
        }
    }
}
