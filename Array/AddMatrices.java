// Jan30th video 04.03 - 04.10
package Array;

public class AddMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{3,-4}, {8,5}};
		int b[][]= {{9,-5}, {2,-6}};
		
		int c[][]= new int[2][2];
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]);
			}
			System.out.println("*******");
		}

	}

}
