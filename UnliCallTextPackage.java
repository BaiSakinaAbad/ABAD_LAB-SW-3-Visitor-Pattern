public class UnliCallTextPackage implements UnliCallOffer{

    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        if (telcoName.equals("Smart")) {
            return "No unlimited calls and text package";
        } else if (telcoName.equals("Globe")) {
            return "Unlimited calls and text to Globe network only";
        } else if (telcoName.equals("Ditto")) {
            return "Unlimited calls and text to all networks";
        }
        return "";
    }
}