package arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {
	public static void main(String[] args) throws IOException {
		Usuario usuario1 = new Usuario("Ítalo Oliveira", "italo1071", "12345", "060.703.332-00");
		Usuario usuario2 = new Usuario("Isabele Oliveira", "belbel", "2005", "312.542.839-00");

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);

		System.out.println(jsonUser);
		
		File file = new File("C:\\Users\\italo\\git\\curso-java\\curso-java\\src\\arquivos\\usuarios.json");
		
		FileWriter fileWriter = new FileWriter(file);

		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		// ---------------------------------- LENDO O ARQUIVO JSON ---------------------------------
		
		FileReader fileReader = new FileReader(file);
		JsonArray jsonArray = JsonParser.parseReader(fileReader).getAsJsonArray();
		List<Usuario> listUsuarios = new ArrayList<Usuario>();

		for (JsonElement jsonElement : jsonArray) {
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
		}
		
		System.out.println("Leitura do arquivo JSON: " + listUsuarios);
	}
}