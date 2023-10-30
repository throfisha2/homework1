import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вывод элементов массива по индексу
*/

public class Zadanie5
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

        // ввод индекса
        System.out.print("Введите номер индекса: ");
        int v=Integer.parseInt(br.readLine());
        int b=array[v-1];

        // вывод значения
        System.out.print("Значение равно: "+ b);
    }
}
