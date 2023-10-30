import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//среднее арифметическое элементов массива

public class Zadanie4
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

        // вычисление среднего арифметического значения и вывод
        int ar=0;

        for (int i:array)
        {
            ar+=i;
        }

        System.out.print("Значение равно: "+ ar/ array.length);
    }
}
