
import java.io.*;

public class singleInteger
{
public static int findSingleInt(int A[], int arrSize)
{

for (int i = 0; i < arrSize; i++)
{
int count = 0;
for (int j = 0; j < arrSize; j++)
{
if (A[i] == A[j])
{
count++;
}
}
if (count == 1)
{
return A[i];
}
}

return -1;
}

public static void main (String[] args)
{
int arr[] = {4,1,2,1,2};
int n = arr.length;

System.out.println("Element occurring once is " + findSingleInt(arr, n));
}
}
