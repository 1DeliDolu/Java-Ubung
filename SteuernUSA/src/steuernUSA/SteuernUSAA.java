public class SteuernUSA {

    private double gehalt;
    private boolean verheiratet;

    public SteuernUSA(double gehalt, boolean verheiratet) {
        this.gehalt = gehalt;
        this.verheiratet = verheiratet;
    }

    public double berechneSteuer() {
        double steuer = 0;

        if (verheiratet) {
            switch (gehalt) {
                case 0 <= gehalt && gehalt <= 18550:
                    steuer = gehalt * 0.10;
                    break;
                case 18551 <= gehalt && gehalt <= 75300:
                    steuer = gehalt * 0.15;
                    break;
                case 75301 <= gehalt && gehalt <= 151900:
                    steuer = gehalt * 0.25;
                    break;
                case 151901 <= gehalt && gehalt <= 231450:
                    steuer = gehalt * 0.28;
                    break;
                case 231451 <= gehalt && gehalt <= 413350:
                    steuer = gehalt * 0.33;
                    break;
                case 413351 <= gehalt && gehalt <= 466950:
                    steuer = gehalt * 0.35;
                    break;
                default:
                    steuer = gehalt * 0.39;
                    break;
            }
        } else {
            switch (gehalt) {
                case 0 <= gehalt && gehalt <= 9275:
                    steuer = gehalt * 0.10;
                    break;
                case 9276 <= gehalt && gehalt <= 37650:
                    steuer = gehalt * 0.15;
                    break;
                case 37651 <= gehalt && gehalt <= 91150:
                    steuer = gehalt * 0.25;
                    break;
                case 91151 <= gehalt && gehalt <= 190150:
                    steuer = gehalt * 0.28;
                    break;
                case 190151 <= gehalt && gehalt <= 413350:
                    steuer = gehalt * 0.33;
                    break;
                default:
                    steuer = gehalt * 0.39;
                    break;
            }
        }

        return steuer;
    }

    public double berechneNettoGehalt() {
        return gehalt - berechneSteuer();
    }
}