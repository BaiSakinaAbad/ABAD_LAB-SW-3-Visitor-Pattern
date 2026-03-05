import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallOffer{

    private static Map<String, String> telcoOfferMap = new HashMap<>();

    static {
        telcoOfferMap.put("Smart", "No unlimited calls and text package");
        telcoOfferMap.put("Globe", "Unlimited calls and text to Globe network only");
        telcoOfferMap.put("Ditto", "Unlimited calls and text to all networks");
    }

    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        return telcoOfferMap.getOrDefault(telcoName, "");
    }
}