package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unlp.info.oo2.biblioteca.*;

public class Adapter extends VoorheesExporter {

	public String exportar(List<Socio> socios) {
		return aLista(socios).toJSONString();
	}
	
	private JSONObject aJson(Socio usuario) {
		JSONObject json = new JSONObject();
		json.put("nombre", usuario.getNombre());
		json.put("email", usuario.getEmail());
		json.put("legajo", usuario.getLegajo());
		return json;
	}
	
	private JSONArray aLista(List<Socio> socios) {
		JSONArray lista = new JSONArray();
		for (Socio socio1: socios) {
			JSONObject o1 = aJson(socio1);
			lista.add(o1);
		}
		return lista;
	}
}
