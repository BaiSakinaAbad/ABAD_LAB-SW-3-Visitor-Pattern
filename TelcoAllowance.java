public class TelcoAllowance implements UsagePromo{

     private static Map<String, Double> telcoAllowanceMap = new HashMap<>();

     static{
        telcoAllowanceMap.put("Smart", 500);
        telcoAllowanceMap.put("Globe", 540);
        telcoAllowanceMap.put("Dito", 400);
     }

    @Override
    public String showAllowance(String telcoName, double money){
        return telcoAllowanceMap.get(telcoName) * money;
    }
}