public class Electronics extends HomeObjects
{
    private final int    voltageV;
    private final String itemConnectivity;

    private static final int MIN_VOLTAGE = 0;
    private static final int MAX_VOLTAGE = 20;

    public Electronics(final String homeObjectName,
                       final String homeObjectBrand,
                       final double priceCAD,
                       final String homeObjectColor,
                       final int    voltageV,
                       final String itemConnectivity)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor);

        if(voltageV < MIN_VOLTAGE || voltageV > MAX_VOLTAGE)
        {
            throw new IllegalArgumentException("Invalid voltage: " + voltageV);
        }

        if(itemConnectivity != null &&
                (!itemConnectivity.equalsIgnoreCase("bluetooth")
                && !itemConnectivity.equalsIgnoreCase("wifi")
                && !itemConnectivity.equalsIgnoreCase("n/a"))
        )
        {
            throw new IllegalArgumentException("Invalid electronic connectivity: " + itemConnectivity);
        }

        this.voltageV            = voltageV;
        this.itemConnectivity   = itemConnectivity;
    }

    @Override
    public String getType()
    {
        return "Electronics";
    }
}
