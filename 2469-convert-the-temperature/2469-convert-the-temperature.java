class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = 0;
        double fahrenheit = 0;

        while(celsius >= 0){
            kelvin = celsius + 273.15;
            fahrenheit = celsius * 1.80 + 32.00;
            return new double[]{kelvin, fahrenheit};
        }
        return new double[]{-1,-1};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna