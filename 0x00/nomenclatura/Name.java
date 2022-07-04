import java.net.URL;
import java.util.Date;
import java.util.List;

public class Name {
    ///variáveis que falam por si só
    //A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user){};
    //B



    //Declarações corretas
    //A
    public List<Account> AccountList;


    // Sem Prefixos

    //B
    public void deleteUser(Name.User user){};

    // Evite mapa mental

    //B
    public URL url;

    // Classe possui nomes próprios, funções devem ter verbos
    //A

    public void saveCar(){};
    //B
    public class TableRepresenter{};


    // Uma palavra por conceito

    //B
    public void saveUser(){}; void createAccount(){}; void generateContract(){};


    //Use constants, enums instead of magic numbers, abbreviations
    //A
    public int daysInYear = 360;
    public int hoursInWeek = 168;

}
