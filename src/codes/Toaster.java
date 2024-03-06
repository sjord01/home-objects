public class Toaster extends Electronics
{
    private final int       toastBagelMinutes;
    private final boolean   hasDefrostFunction;

    private static final int MIN_TOASTING_MINUTES = 1;
    private static final int MAX_TOASTING_MINUTES = 10;
    public Toaster(final String homeObjectName,
                   final String homeObjectBrand,
                   final double priceCAD,
                   final String homeObjectColor,
                   final int voltageV,
                   final String itemConnectivity,
                   final int toastBagelMinutes,
                   final boolean hasDefrostFunction)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor, voltageV, itemConnectivity);

        if(toastBagelMinutes < MIN_TOASTING_MINUTES || toastBagelMinutes > MAX_TOASTING_MINUTES)
        {
            throw new IllegalArgumentException("Invalid minutes for toasting bagels: " + toastBagelMinutes);
        }
        this.toastBagelMinutes = toastBagelMinutes;
        this.hasDefrostFunction = hasDefrostFunction;
    }

    @Override
    public String getType()
    {
        return "Toaster";
    }
}
