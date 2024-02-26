import java.util.HashMap;
import java.util.Map;
public class Main {
  public static void main(String[] args) {
    String str = "Esta es la frase";
    str = str.replaceAll(" ", "");
    //Hacer el diccionario
	Map<Character, Integer> map = new HashMap<Character, Integer>();
    //Recorrer el string
    for (int i = 0; i < str.length() ; i++){
    //Letra
    	char letra = str.charAt(i);
        
    //Mirar si la letra esta en la lista
    	boolean esta = false;
        for (char j : map.keySet()) {
        	//Si esta sumar 1 
            if(j == letra){
            	esta = true;
                int suma =  map.get(j) +1;
                map.put(letra, suma);
            }
        }
 		//Si esta 
        if(esta == false){
        	map.put(letra, 1);
        }
     
    }
    //Mostar por pantalla
    for (char i : map.keySet()) {
      System.out.println("Letra: " + i + " Veces: " + map.get(i));
    }
    
  }
}
