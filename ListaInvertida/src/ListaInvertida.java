import java.util.Map.Entry;
import java.util.*;

public class ListaInvertida {
	
	private Hashtable<String, LinkedList<String>> tabela;
	
	public ListaInvertida(){
		tabela = new Hashtable<String, LinkedList<String>>();
	}
	
	public boolean insere(String palavra, String documento){
		LinkedList<String> listaDaPalavra = tabela.get(palavra);
		if(listaDaPalavra != null){
			if(listaDaPalavra.contains(documento)){
				return false;
			}else{
				listaDaPalavra.add(documento);
				return true;
			}
		}else{
			
			tabela.put(palavra,new LinkedList<String>());
			tabela.get(palavra).add(documento);
			return true;
		}
	}
	
	public LinkedList<String> busca(String palavra){
		return tabela.get(palavra);
	}
	
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int lastWord = 0, lastKey = 0;
        builder.append("{");

        for (Entry<String, LinkedList<String>> entrySet : tabela.entrySet()) {
            builder.append(entrySet.getKey()).append("=[");

            for (String documento : entrySet.getValue()) {
                lastWord++;
                builder.append(documento).append(lastWord < entrySet.getValue().size() ? "," : "");
            }
            lastKey++;
            builder.append("]").append(lastKey < tabela.entrySet().size() ? ", " : "");
        }
        builder.append("}");
        return builder.toString();
    }
}