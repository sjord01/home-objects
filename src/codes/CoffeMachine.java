public class CoffeMachine extends Electronics
{
    private final String coffeeType;
    private final String coffeeStrength;

    private static final String TYPE_ESPRESSO = "espresso";
    private static final String TYPE_CAPUCCINO = "capuccino";
    private static final String TYPE_LATTE = "latte";
    private static final String STRENGTH_DECAF = "decaf";
    private static final String STRENGTH_MILD = "mild";
    private static final String STRENGTH_STRONG = "strong";


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

        if(coffeeType != null &&
                (!coffeeType.equalsIgnoreCase(TYPE_CAPUCCINO)
                        && !coffeeType.equalsIgnoreCase(TYPE_ESPRESSO)
                        && !coffeeType.equalsIgnoreCase(TYPE_LATTE))
        )
        {
            throw new IllegalArgumentException("Invalid coffee type: " + coffeeType);
        }

        if(coffeeStrength != null &&
                (!coffeeStrength.equalsIgnoreCase(STRENGTH_DECAF)
                        && !coffeeStrength.equalsIgnoreCase(STRENGTH_MILD)
                        && !coffeeStrength.equalsIgnoreCase(STRENGTH_STRONG))
        )
        {
            throw new IllegalArgumentException("Invalid coffee type: " + coffeeType);
        }

        this.coffeeType     = coffeeType;
        this.coffeeStrength = coffeeStrength;
    }

    @Override
    public String getType()
    {
        return "Coffee Machine";
    }
}
