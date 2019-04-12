import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 811. Subdomain Visit Count
 * https://leetcode.com/problems/subdomain-visit-count/
 */
public class Solution_811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> domains = new HashMap<>();

        for (String cpdomain : cpdomains) {
            int num = Integer.parseInt(cpdomain.split(" ")[0]);
            String domain = cpdomain.split(" ")[1];
            int index = -1;
            do {
                domain = domain.substring(index + 1);
                if (domains.containsKey(domain)) {
                    domains.put(domain, domains.get(domain) + num);
                } else {
                    domains.put(domain, num);
                }
            }
            while ((index = domain.indexOf(".")) != -1);
        }

        List<String> domainVisits = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : domains.entrySet()) {
            domainVisits.add(entry.getValue() + " " + entry.getKey());
        }
        return domainVisits;
    }
}
