package bryly;

public class kula extends punktmat
  { 
  
  protected float promienk;		// Prywatne  pole masy  punktu  materialnego  z  akcesorem
  
    	public float getPromien()
    	{
    		return promienk;
    	}
  
  		public void setPromien(float rk)
   	 	{
    		promienk = rk;
   	 	}
	
  	public kula()	// Konstruktor domyślny inicjujący promień i masę stałą wartością
    	{
      		super();
    		promienk = 6f;	
   	 	}
  	
  	public kula(float rk, float masa)         // Konstruktor z parametrami pozwalający na nadanie wartości promienia
    	{
      		super(masa);
    		promienk = rk;
    	}
	
	public float momentbezwl() 	      // Metoda bez parametrów, licząca główny moment bezwładności
   	 {	
    		return 0.4f*masa*promienk*promienk; 
    	}
  
  	public String opis()	// Metoda zwracająca stały opis obiektu
   	 {
     		return "Kula"; 
    	}
}

