public class Sofa extends Furnitures
{
    private final int seatingCapacity;
    private final String upholstery;

    public Sofa(final String homeObjectName,
                final String homeObjectBrand,
                final double priceCAD,
                final String homeObjectColor,
                final boolean isAssemblyRequired,
                final String frameMaterial,
                final int seatingCapacity,
                final String upholstery)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor, isAssemblyRequired, frameMaterial);
        this.seatingCapacity = seatingCapacity;
        this.upholstery = upholstery;
    }

    @Override
    public String getType()
    {
        return "Sofa";
    }
}
