public class Drawer extends Furnitures
{
    private final int drawersCount;
    private final String drawerMaterial;

    private static final int MIN_DRAWER_COUNT = 1;
    private static final int MAX_DRAWER_COUNT = 8;
    private static final String MATERIAL_OAK = "oak";
    private static final String MATERIAL_CHESTNUT = "chestnut";
    private static final String MATERIAL_MAHOGANY = "mahogany";
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

        if(drawersCount < MIN_DRAWER_COUNT || drawersCount > MAX_DRAWER_COUNT)
        {
            throw new IllegalArgumentException("Invalid drawer count: " + drawersCount);
        }

        if(drawerMaterial != null &&
                (!drawerMaterial.equalsIgnoreCase(MATERIAL_CHESTNUT)
                        && !drawerMaterial.equalsIgnoreCase(MATERIAL_MAHOGANY)
                        && !drawerMaterial.equalsIgnoreCase(MATERIAL_OAK))
        )
        {
            throw new IllegalArgumentException("Invalid drawer material: " + drawerMaterial);
        }

        this.drawersCount = drawersCount;
        this.drawerMaterial = drawerMaterial;
    }

    @Override
    public String getType()
    {
        return "Drawer";
    }
}
