public class HomeObjects
{
    private final String homeObjectName;
    private final String homeObjectBrand;
    private final double priceCAD;
    private final String homeObjectColor;

    private static final int MIN_ITEM_NAME = 2;
    private static final int MAX_ITEM_NAME = 30;
    private static final int MIN_PRICE_CAD = 0;

    public HomeObjects(final String homeObjectName,
                       final String homeObjectBrand,
                       final double priceCAD,
                       final String homeObjectColor)
    {
        if(homeObjectName == null)
        {
            throw new NullPointerException("Invalid item name: null");
        }

        if(homeObjectName.length() < MIN_ITEM_NAME || homeObjectName.length() > MAX_ITEM_NAME)
        {
            throw new IllegalArgumentException("Invalid item name: " + homeObjectName);
        }

        if(homeObjectBrand == null)
        {
            throw new NullPointerException("Invalid item brand: null");
        }

        if(homeObjectBrand.length() < MIN_ITEM_NAME || homeObjectBrand.length() > MAX_ITEM_NAME)
        {
            throw new IllegalArgumentException("Invalid item brand: " + homeObjectBrand);
        }

        if(priceCAD <= MIN_PRICE_CAD)
        {
            throw new IllegalArgumentException("Invalid price: " + priceCAD);
        }

        if(homeObjectColor == null)
        {
            throw new NullPointerException("Invalid item color: null");
        }

        if(homeObjectColor.length() < MIN_ITEM_NAME || homeObjectColor.length() > MAX_ITEM_NAME)
        {
            throw new IllegalArgumentException("Invalid item color: " + homeObjectColor);
        }

        this.homeObjectName = homeObjectName;
        this.homeObjectBrand = homeObjectBrand;
        this.priceCAD = priceCAD;
        this.homeObjectColor = homeObjectColor;
    }

    public String getHomeObjectName()
    {
        return homeObjectName;
    }

    public String getType()
    {
        return "Home Object";
    }
}