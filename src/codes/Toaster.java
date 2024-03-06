public class Toaster extends Electronics
{
    private final int       toastBagelMinutes;
    private final boolean   hasDefrostFunction;

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
        this.toastBagelMinutes = toastBagelMinutes;
        this.hasDefrostFunction = hasDefrostFunction;
    }

    @Override
    public String getType()
    {
        return "Toaster";
    }
}
