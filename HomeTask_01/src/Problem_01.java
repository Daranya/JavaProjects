public class Problem_01 {
	
	public static void main(String[] args) {
		
		// Constants for the diameters of the Earth and Sun
        double earthDiameter = 7600.0; // in miles
        double sunDiameter = 865000.0; // in miles

        // Calculating the radii
        double earthRadius = earthDiameter / 2.0;
        double sunRadius = sunDiameter / 2.0;

        // Formula for the volume of a sphere: V = 4/3 * π * r^3
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Calculating the ratio of the volumes
        double volumeRatio = sunVolume / earthVolume;

        // Output the results
        System.out.printf("The volume of the Earth is %.2f cubic miles.%n", earthVolume);
        System.out.printf("The volume of the Sun is %.2f cubic miles.%n", sunVolume);
        System.out.printf("The ratio of the volume of the Sun to the volume of the Earth is %.2f.%n", volumeRatio);

	}

}
