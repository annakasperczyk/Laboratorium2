package bryly;

public class pret extends punktmat
  { 
  
  protected float dlugosc;		// Prywatne  pole masy  punktu  materialnego  z  akcesorem
  
    	public float getDlugosc()
    	{
    		return dlugosc;
    	}
  
  		public void setDlugosc(float l)
   	 	{
    		dlugosc = l;
   	 	}
	
  	public pret()	// Konstruktor domyślny inicjujący promień i masę stałą wartością
    	{
      		super();
    		dlugosc = 8f;	
   	 	}
  	
  	public pret(float l, float masa)         // Konstruktor z parametrami pozwalający na nadanie wartości promienia
    	{
      		super(masa);
    		dlugosc = l;
    	}
	
	public float momentbezwl() 	      // Metoda bez parametrów, licząca główny moment bezwładności
   	 {	
    		return (1f/12f)*masa*dlugosc*dlugosc; 
    	}
  
  	public String opis()	// Metoda zwracająca stały opis obiektu
   	 {
      return "Pret"; 
    	}
}


