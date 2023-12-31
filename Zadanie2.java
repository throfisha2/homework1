import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
1. Задать массив целых чисел длинной 10 эл.
2. Отсортировать числа в массиве
3. Вывести массив на экран
*/

public class Zadanie2
{
    public static void main (String[] args)throws IOException
    {
        // ввод элементов массива с клавиатуры
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int [] array=new int[10];

        System.out.print("Введите элементы массива: ");
        for (int i=0; i<10;i++)
        {
            array[i]=Integer.parseInt(br.readLine());
        }

        // сортировка
        Arrays.sort(array);

        // вывод массива
        System.out.print("Массив: "+ Arrays.toString(array));
    }
}
