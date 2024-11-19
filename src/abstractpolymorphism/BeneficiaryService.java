package abstractpolymorphism;

import java.util.ArrayList;

public class BeneficiaryService {

    Beneficiary addBeneficiary(Account account, Beneficiary beneficiary){
        ArrayList<Beneficiary> beneficiaryArrayList = SbiAccountDbService.beneficiaryMap.get(account.getAccountNumber());

        if (beneficiaryArrayList != null){
            beneficiaryArrayList.add(beneficiary);
        }else {
            beneficiaryArrayList = new ArrayList<Beneficiary>();
            beneficiaryArrayList.add(beneficiary);
            SbiAccountDbService.beneficiaryMap.put(account.getAccountNumber(),beneficiaryArrayList);
        }

        return beneficiary;
    }

}
