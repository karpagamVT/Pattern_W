package PatPro;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =0;
		int m=3;
		for (int i = 0; i <4; i++) {
			for (int j =0; j <=7; j++) {
				if (j==0||j==6||(j==5&&i==2)||(j==4&&i==1))
				{
					System.out.print("*"+" ");
				} else if(i==n&&j==m)
				{
					System.out.print("*"+" ");
					n=n+1;
					m=m-1;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
