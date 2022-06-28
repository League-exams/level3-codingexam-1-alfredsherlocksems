import java.util.ArrayList;

public class WeatherUtilities {
	public static Double[] sortTemperatures(Double[] temps) {
		ArrayList<Double> bob = new ArrayList<Double>();
		for (int i = 0; i < temps.length - 1; i++) {
			for (int j = 1; j < temps.length; j++) {
				if (temps[j - 1] > temps[j]) {
					double b = temps[j - 1];
					temps[j - 1] = temps[j];
					temps[j] = b;
				}
			}
		}
	
		for (int i = 0; i < temps.length; i++) {
			if (!bob.contains(temps[i])) {
				bob.add(temps[i]);
			}
			
		}
		Double[] returnList;
		returnList = new Double[bob.size()];
		for (int i = 0; i < bob.size(); i++) {
			returnList[i] = bob.get(i);
		}
		return returnList;
		
	}
}
