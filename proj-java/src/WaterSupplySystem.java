import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class WaterSupplySystem {
    private Map<Integer, Accident> accidents;
    private Map<String, Contract> contractsByName;
    public WaterSupplySystem() {
        accidents = new HashMap<>();
        contractsByName = new HashMap<>();
    }
    public void addAccident(Accident accident) {
        accidents.put(accident.getId(), accident);
    }
    public Accident getAccidentById(int id) {
        return accidents.get(id);
    }
    public List<Accident> getAllAccidents() {
        return new ArrayList<>(accidents.values());
    }
    public void removeAccident(int id) {
        accidents.remove(id);
    }
    public void addContract(Contract contract) {
        contractsByName.put(contract.getName(), contract);
    }
    public Contract getContractByName(String name) {
        return contractsByName.get(name);
    }
    public List<Contract> getAllContracts() {
        return new ArrayList<>(contractsByName.values());
    }
    public void removeContract(Contract contract) {
        contractsByName.remove(contract.getName());
    }
}
