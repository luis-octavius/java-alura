package pessoa;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Luis", 30, "Seropédica");
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
               // .setLenient() To ignore fields not filled
                .create();
        String jsonRep = gson.toJson(pessoa);
        System.out.println(jsonRep);
    }
}
