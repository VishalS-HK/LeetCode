class Solution {
    public double[] convertTemperature(double celsius) {
        double[] finalAns = new double[2];
        
        double fahrenheit = celsius * 1.80 + 32.00;
        double kelvin = celsius + 273.15;
        finalAns[1] = fahrenheit;
        finalAns[0] = kelvin;
        return finalAns;
    }
}