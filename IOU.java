import java.util.HashMap;
public class IOU {
    private final HashMap<String, Double> iouMap;

    public IOU() {
        this.iouMap = new HashMap<>();
    }
    public void setSum(String toWhom, Double amount) {
        iouMap.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return iouMap.getOrDefault(toWhom, 0.0);
    }


    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);

        mattsIOU.setSum("Michael", (double)30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));


    }
}
