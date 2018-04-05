package bryly;
public class punktmat
{ 
	protected float masa;		// Prywatne   pole masy  punktu  materialnego  z  akcesorem
    	public float getMasa()
    	{
    		return masa;
    	}
	public void setMasa(float m)
   	 {
    		masa = m;
   	 }
	
  	public punktmat()	// Konstruktor domyślny inicjujący masę stałą wartością
    	{
    		masa = 2f;
   	 }
  	
  	public punktmat(float m)         // Konstruktor z parametrami pozwalający na nadanie wartości masy
    	{
    		masa = m; 
    	}
	
	public float momentbezwl() 	      // Metoda bez parametrów, licząca główny moment bezwładności
   	 {	
    		return 0f; 
    	}
  
  	public float steiner(float x)        // Metoda z jednym parametrem, moment bezwładności z tw. Steinera
    	{
    		return momentbezwl() + masa * x * x;
    	}
	
  	public String opis()	// Metoda zwracająca stały opis obiektu
   	 {
     		return "Punkt materialny"; 
    	}
}

