import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/3/17
 *
 * @author Hanson
 * 2019/3/17
 * 929. Unique Email Addresses
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class Solution_929 {
    public int numUniqueEmails(String[] emails) {
        List<String> uniqueEmails = new ArrayList<>();
        for (String email : emails) {
            String localName = email.split("@")[0],
                    domainName = email.split("@")[1];
            int flag = localName.indexOf("+");
            if (flag != -1) {
                localName = localName.substring(0, flag);
            }
            localName = localName.replace(".", "");
            if (!uniqueEmails.contains(localName + "@" + domainName)) {
                uniqueEmails.add(localName + "@" + domainName);
            }
        }
        return uniqueEmails.size();
    }

    public static void main(String... args) {
        String s = "m.y+name@email.com";
        System.out.println(s.substring(0, s.indexOf("+")));
    }
}
