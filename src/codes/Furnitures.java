public class Furnitures extends HomeObjects
{
    private final boolean isAssemblyRequired;
    private final String  frameMaterial;

    public Furnitures(final String  homeObjectName,
                      final String  homeObjectBrand,
                      final double  priceCAD,
                      final String  homeObjectColor,
                      final boolean isAssemblyRequired,
                      final String  frameMaterial)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor);
        this.isAssemblyRequired = isAssemblyRequired;
        this.frameMaterial      = frameMaterial;
    }

    @Override
    public String getType()
    {
        return "Furnitures";
    }
}
