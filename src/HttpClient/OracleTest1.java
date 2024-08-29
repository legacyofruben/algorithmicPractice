package HttpClient;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OracleTest1 {
    public static List<Account> getAccounts(){
        String uri = "http://localhost:8081/api/accounts";
        //HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .GET()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpClient client = HttpClient.newHttpClient();

        List<Account> list = new ArrayList<>();

        try {
            HttpResponse<String> response=client.send(request, BodyHandlers.ofString());
            StringBuilder str = new StringBuilder(response.body());
            // Patrón de búsqueda para encontrar pares de clave-valor en el JSON
            Pattern pattern = Pattern.compile("\"([^\"]+)\":\\s*\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(str);

            // Buscar y extraer cada par clave-valor del JSON
            int index=0;
            String[] props = new String[3];
            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);
                props[index++] = value;
                if(key.equalsIgnoreCase("owner")){
                    list.add(new Account(props[0],props[1],props[2]));
                    index=0;
                }
            }

        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return list;
    }
}

class OracleTest1Test{
    @Test
    public void getAnime(){
        assertTrue(OracleTest1.getAccounts().size() > 0);
    }
    @Test
    public void getOnlyChks(){
        List<Account> list = OracleTest1.getAccounts()
                .stream().filter((acct)-> acct.type().equalsIgnoreCase("CHK"))
                .collect(Collectors.toList());
        assertTrue(list.size() == 2);
    }

    @Test
    public void getSortList(){
        List<Account> list = OracleTest1.getAccounts();
        Collections.sort(list, Comparator.comparing(o -> o.owner()));
        assertTrue(list.get(0).owner().equalsIgnoreCase("Anahi"));
    }

    @Test
    public void getFirstByCHK(){
        /*List<Account> initialSorted = OracleTest1.getAccounts();
        Collections.sort(initialSorted,Comparator.comparing(Account::owner));

        List<String> owners = initialSorted.stream().map(Account::owner)
                .distinct()
                        .collect(Collectors.toList());
        Map<String, List<Account>> group = initialSorted.stream()
                .collect(Collectors.groupingBy(Account::owner));
        for (List<Account> g: group.values()) {
            if(g.size() > 1){
                Collections.sort(g,Comparator.comparing(Account::type));
                int index = initialSorted.con
            }
        }
        for (int i = 0; i < initialSorted; i++) {

        }*/

        /*Map<String, List<Account>> accountsByOwner = OracleTest1.getAccounts().stream()
                .collect(Collectors.groupingBy(Account::owner));
        // Ordenar las cuentas de cada propietario
        List<Account> sortedAccounts = accountsByOwner.values().stream()
                .flatMap(list -> list.stream().sorted(Comparator.comparing(Account::type)))
                .collect(Collectors.toList());

        sortedAccounts.forEach(System.out::println);*/

        /*initialSorted.forEach(acct -> {
            System.out.println(acct);
        });*/
        List<Account> initialSorted = OracleTest1.getAccounts();
        Collections.sort(initialSorted,Comparator.comparing(Account::owner));

        String owner = "";
        for (int i = 0; i < initialSorted.size(); i++) {
            if(owner.isEmpty()){
                owner = initialSorted.get(i).owner();
            }else{
                if(owner.equalsIgnoreCase(initialSorted.get(i).owner())){
                    if(!initialSorted.get(i-1).type().equalsIgnoreCase("CHK") &&
                            initialSorted.get(i).type().equalsIgnoreCase("CHK")){
                        initialSorted.add(i-1,initialSorted.get(i));
                        initialSorted.remove(i+1);
                        owner = initialSorted.get(i).owner();
                    }
                }
            }
        }
        initialSorted.forEach(acct -> {
            System.out.println(acct);
        });

        assertTrue(true);
    }
}
