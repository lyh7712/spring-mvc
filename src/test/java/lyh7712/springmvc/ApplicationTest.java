package lyh7712.springmvc;

import java.util.ArrayList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    ContractRepository repository;

    @Test
    public void 저장_테스트() {
        Contract contract = new Contract();
        contract.setId(1L);
        contract.setCompany("배민");
        contract.setCommission(1.0);
        contract.setCommissionType(EnumContract.CommissionType.MONEY.getValue());
        contract.setCommissionCutting(EnumContract.CommissionCutting.ROUND.getValue());
        repository.save(contract);

        ArrayList arrayList = new ArrayList(repository.findAll());
        System.out.println(arrayList);
        Assertions.assertThat(arrayList.size()).isEqualTo(1);

    }
}
