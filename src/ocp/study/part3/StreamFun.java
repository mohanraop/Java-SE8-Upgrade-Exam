package ocp.study.part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamFun {

    public static void main(String[] dsfsdfs) {
        // StreamFun sf = new StreamFun();

        List<StoredIncentive> storedIncentives = new ArrayList<>();
        storedIncentives.add(new StoredIncentive("FHR1024, offer for something at a hotel"));

        Map<String, StoredIncentive> returnValue = new HashMap<>();
        storedIncentives
                .stream()
                .filter(incentive -> incentive.getOfferName().indexOf(',') > 0)
                .forEach((incentive -> returnValue.put(
                        incentive.getOfferName().toLowerCase().substring(0, incentive.getOfferName().indexOf(',')),
                        incentive)));

        for (String key : returnValue.keySet()) {
            System.out.println(key);
        }

    }
}

class StoredIncentive {
    private String offerName = "default";

    StoredIncentive(String str) {
        offerName = str;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String str) {
        offerName = str;
    }
}
