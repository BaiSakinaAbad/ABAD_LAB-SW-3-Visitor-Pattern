import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo{

    private static Map<String, Integer> telcoAllowanceMap = new HashMap<>();

    static {
        telcoAllowanceMap.put("Smart", 15);
        telcoAllowanceMap.put("Globe", 10);
        telcoAllowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money){
        Integer gb = telcoAllowanceMap.get(telcoName);
        if (gb != null) {
            return gb + " GB for ₱" + money;
        }
        return "";
    }
}