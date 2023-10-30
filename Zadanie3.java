import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
1. Задать массив целых чисел длинной 10 эл.
2. Разделить массив на два массива равной длинны
3. Отсортировать  каждый и вывести массивы на экран
*/

public class Zadanie3
{
    public static void main (String[] args)throws IOException
    {
        // ввод элементов массива с клавиатуры
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l=10;
        int [] array=new int[l];

        System.out.print("Введите элементы массива: ");
        for (int i=0; i<l;i++)
        {
            array[i]=Integer.parseInt(br.readLine());
        }

        //обьявнение новых массивов
        int [] first=new int[(l+1)/2];
        int [] second=new int[l- first.length];

        //заполнение
        System.arraycopy(array, 0, first,0,first.length);
        System.arraycopy(array, first.length, second, 0, second.length);

        //сортировка
        Arrays.sort(first);
        Arrays.sort(second);

        //вывод
        System.out.print("Массив 1: "+ Arrays.toString(first)+"\n");
        System.out.print("Массив 2: "+ Arrays.toString(second));
    }
}
