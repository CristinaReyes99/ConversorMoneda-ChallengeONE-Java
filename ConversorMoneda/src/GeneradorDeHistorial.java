import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GeneradorDeHistorial {
    private static final String HISTORIAL_FILE = "historial.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardarHistorial(Moneda moneda) throws IOException {
        List<Moneda> historial = leerHistorial();
        historial.add(moneda);
        escribirHistorial(historial);
    }

    private List<Moneda> leerHistorial() {
        try (Reader reader = new FileReader(HISTORIAL_FILE)) {
            Type listType = new TypeToken<ArrayList<Moneda>>(){}.getType();
            List<Moneda> historial = gson.fromJson(reader, listType);
            if (historial != null) {
                return historial;
            }
        } catch (IOException e) {
            // Si el archivo no existe o no se puede leer, retornamos una lista vacía
            System.out.println("No se pudo leer el archivo de historial. Creando uno nuevo.");
        }
        return new ArrayList<>();
    }

    private void escribirHistorial(List<Moneda> historial) throws IOException {
        try (FileWriter writer = new FileWriter(HISTORIAL_FILE)) {
            gson.toJson(historial, writer);
        }
    }

    public String imprimirHistorialJson() {
        try (Reader reader = new FileReader(HISTORIAL_FILE)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            return gson.toJson(jsonElement);
        } catch (IOException e) {
            return "Error al leer el archivo de historial: " + e.getMessage();
        }
    }
}


