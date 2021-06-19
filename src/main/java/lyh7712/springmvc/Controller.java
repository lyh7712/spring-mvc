package lyh7712.springmvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    ContractRepository repository;

    public Controller(ContractRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/contracts")
    public void register(@RequestBody Contract contract) {
        repository.save(contract);
    }

    @GetMapping("/contracts")
    public void getAllContract() {
        System.out.println(repository.findAll());
    }

    @GetMapping("/enums")
    public Map<String, Object> getEnums() {
        Map<String, Object> enumList = new LinkedHashMap();

        Class commissionType = EnumContract.CommissionType.class;
        Class commissionCutting = EnumContract.CommissionCutting.class;

        enumList.put("commissionType", commissionType.getEnumConstants());
        enumList.put("commissionCutting",commissionCutting.getEnumConstants());

        return enumList;
    }
}
