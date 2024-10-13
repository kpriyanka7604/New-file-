
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[][] jagarr=new int[3][];
		jagarr[0]=new int[3];
		jagarr[1]=new int[2];
		jagarr[2]=new int[4];
		System.out.println("Enter Elements");
		for(int i=0;i<jagarr.length;i++)
		{
			for(int j=0;j<jagarr[i].length;j++)
			{
				jagarr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<jagarr.length;i++)
		{
		for(int j=0;j<jagarr[i].length;j++)
		{
			System.out.print(jagarr[i][j]+" ");
		}
		   System.out.println();
		}
	}
}

