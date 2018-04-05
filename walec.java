package bryly;

public class walec extends punktmat
  { 
  
  protected float promienw;		// Prywatne  pole masy  punktu  materialnego  z  akcesorem
  
    	public float getPromien()
    	{
    		return promienw;
    	}
  
  		public void setPromien(float rw)
   	 	{
    		promienw = rw;
   	 	}
	
  	public walec()	// Konstruktor domyślny inicjujący promień i masę stałą wartością
    	{
      		super();
    		promienw = 4f;	
   	 	}
  	
  	public walec(float rw, float masa)         // Konstruktor z parametrami pozwalający na nadanie wartości promienia
    	{
      		super(masa);
    		promienw = rw;
    	}
	
	public float momentbezwl() 	      // Metoda bez parametrów, licząca główny moment bezwładności
   	 {	
    		return 0.5f*masa*promienw*promienw; 
    	}

  	public String opis()	// Metoda zwracająca stały opis obiektu
   	 {
     		return "Walec"; 
    	}
}



