package lyh7712.springmvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class ContractRepository {

    private static final Map<Long, Contract> store = new HashMap();

    public void save(Contract contract) {
        store.put(contract.getId(), contract);
    }

    public List findAll() {
        return new ArrayList(store.values());
    }
}
