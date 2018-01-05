
public class Glowna {
	/* 
	 * //Zmienne
	int x;
	int y;
//Konstruktory
	Glowna()
	{

	}

	Glowna(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
//Metody
	public int getX()
	{
		return x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	 */

	public static void main(String[] args) {



		System.out.println("Hejo \n");


		Naczynie n1,n2;
		n1 =  new Naczynie(10,8);
		n2 =  new Naczynie(10, 4.6);

	//	System.out.println("Naczynie nr1, ma pojemnoœæ: " + n1.getVolume() + "L, jest w nim: " + n1.getContent() + " w iloœci: "  + n1.getFullfillment() + "L ");
	//	System.out.println("Naczynie nr2, ma pojemnoœæ: " + n2.getVolume() + "L, jest w nim: " + n2.getContent() + " w iloœci: "  + n2.getFullfillment() + "L ");

		System.out.println(n1);
		
		
	/*	n1.refill(3.4);
		n1.pour(3);*/

		n1.transferTo(6, n2);



	}

}