public class Furnitures extends HomeObjects
{
    private final boolean isAssemblyRequired;
    private final String  frameMaterial;

    private static final String FRAME_WOOD = "wood";
    private static final String FRAME_METAL = "metal";

    public Furnitures(final String  homeObjectName,
                      final String  homeObjectBrand,
                      final double  priceCAD,
                      final String  homeObjectColor,
                      final boolean isAssemblyRequired,
                      final String  frameMaterial)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor);

        if(frameMaterial != null &&
                (!frameMaterial.equalsIgnoreCase(FRAME_WOOD)
                        && !frameMaterial.equalsIgnoreCase(FRAME_METAL))
        )
        {
            throw new IllegalArgumentException("Invalid frame material: " + frameMaterial);
        }

        this.isAssemblyRequired = isAssemblyRequired;
        this.frameMaterial      = frameMaterial;
    }

    @Override
    public String getType()
    {
        return "Furnitures";
    }
}
