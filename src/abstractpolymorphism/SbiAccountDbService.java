package abstractpolymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SbiAccountDbService {

    public static Map<String,Account> accountMap = new HashMap<>();
    public static Map<String, ArrayList<Beneficiary>> beneficiaryMap = new HashMap<>();
    public static Map<String, Transaction>transactionMap = new HashMap<>();

}
