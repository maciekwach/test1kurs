package kurs1Naczynia;
public class Naczynie {

	private double volume = 5;
	private double fullfillment=0;
	private String matter = "szklo";
	private String content = "woda";
	int id = 0;

	Naczynie()
	{

	}
	Naczynie(double pojemnosc, double zapelnienie)
	{
		this.volume = pojemnosc;
		this.fullfillment = zapelnienie;

	}
	Naczynie(double pojemnosc, double zapelnienie, String material)
	{
		this.volume = pojemnosc;
		this.fullfillment = zapelnienie;
		this.matter = material;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////





	public void refill(double dolewka)
	{
		if(fullfillment + dolewka <= volume){
			System.out.print("dolano " + dolewka + "L, do " + fullfillment + "L w naczyniu");
			setFullfillment(fullfillment += dolewka);	
			System.out.println(", teraz jest w nim: " + getFullfillment() + "L ");
		}
		else {
			System.out.println("dolano " + ((volume-fullfillment)) + "L, do " + fullfillment + "L");

			setFullfillment(volume);
			System.out.println("naczynie jest pe³ne");
		}
	}


	public void pour(double doWylania)
	{
		if((fullfillment-doWylania)>=0)
		{
			System.out.print("wylano " + doWylania + "L, z " + fullfillment + "L w naczyniu");
			setFullfillment(fullfillment-=doWylania);
			System.out.println(", teraz jest w nim: " + getFullfillment() + "L ");

		}
		else
		{
			System.out.println("wylano: " + fullfillment + "L, naczynie jest puste");
			setFullfillment(0);
		}

	}

	/**
	 * Ta metoda przenosi zadan¹ iloœæ p³ynu z danego naczynia do naczynia n2
	 * @param ilosc zmiennoprzecinkowa liczba okreœlaj¹ca iloœæ przenoszonego p³ynu
	 * @param n2  naczynie docelowe
	 */
	public void transferTo(double ilosc, Naczynie n2)
	{
		if(ilosc>this.getFullfillment())
			ilosc=this.getFullfillment();
		
		this.pour(ilosc);	
		n2.refill(ilosc);
	}




	public double getVolume() {
		return volume;
	}
	public double getFullfillment() {
		return fullfillment;
	}
	public String getMatter() {
		return matter;
	}
	public String getContent() {
		return content;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public void setFullfillment(double fullfillment) {
		this.fullfillment = fullfillment;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Naczynie , ma pojemnoœæ: " + this.getVolume() + "L, jest w nim: " + this.getContent() + " w iloœci: "  + this.getFullfillment() + "L ";
		//return "Naczynie " + "volume = " + volume + "L, fullfillment = " + fullfillment + "L, matter = " + matter + ", content = " + content + " | ";
	}



}
