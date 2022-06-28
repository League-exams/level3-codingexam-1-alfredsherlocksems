import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String name = "";
		int num = 0;
		int greatNum = -1;
		String greatKey = "";
		for (int i = 0; i < votes.size(); i++) {
			name = votes.get(i).toLowerCase();
			if (!map.containsKey(name)) {
				map.put(name, 1);
			}
			else {
				num = map.get(name);
				map.put(name, num+1);
			}
		}
		for(String vote: map.keySet()) {
			num = map.get(vote);
			if (num > greatNum) {
				greatKey = vote;
				greatNum = num;
			}
			else if (greatNum == num) {
				greatKey = "TIE";
			}
		}
		return greatKey;
	}
}
