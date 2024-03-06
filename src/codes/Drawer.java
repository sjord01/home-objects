public class Drawer extends Furnitures
{
    private final int drawersCount;
    private final String drawerMaterial;

    public Drawer(final String homeObjectName,
                  final String homeObjectBrand,
                  final double priceCAD,
                  final String homeObjectColor,
                  final boolean isAssemblyRequired,
                  final String frameMaterial,
                  final int drawersCount,
                  final String drawerMaterial)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor, isAssemblyRequired, frameMaterial);
        this.drawersCount = drawersCount;
        this.drawerMaterial = drawerMaterial;
    }

    @Override
    public String getType()
    {
        return "Drawer";
    }
}
