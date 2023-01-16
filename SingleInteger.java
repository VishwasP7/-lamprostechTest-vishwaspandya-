
import java.io.*;

public class singleInteger
{
public static int findSingleInt(int Arr[], int arrSize)
{

for (int i = 0; i < arrSize; i++)
{
int count = 0;
for (int j = 0; j < arrSize; j++)
{
if (Arr[i] == Arr[j])
{
count++;
}
}
if (count == 1)
{
return Arr[i];
}
}

return -1;
}

public static void main (String[] args)
{
int arr1[] = {4,1,2,1,2};
int n = arr1.length;

System.out.println("Element is " + findSingleInt(arr1, n));
}
}
