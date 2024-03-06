public class CoffeMachine extends Electronics
{
    private final String coffeeType;
    private final String coffeeStrength;

    public CoffeMachine(final String homeObjectName,
                        final String homeObjectBrand,
                        final double priceCAD,
                        final String homeObjectColor,
                        final int voltageV,
                        final String itemConnectivity,
                        final String coffeeType,
                        final String coffeeStrength)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor, voltageV, itemConnectivity);
        this.coffeeType     = coffeeType;
        this.coffeeStrength = coffeeStrength;
    }

    @Override
    public String getType()
    {
        return "Coffee Machine";
    }
}
