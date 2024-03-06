public class Sofa extends Furnitures
{
    private final int seatingCapacity;
    private final String upholstery;

    private static final int MIN_SEATING = 1;
    private static final int MAX_SEATING = 16;
    private static final String MATERIAL_VELVET = "velvet";
    private static final String MATERIAL_LEATHER = "leather";

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

        if(seatingCapacity < MIN_SEATING || seatingCapacity > MAX_SEATING)
        {
            throw new IllegalArgumentException("Invalid seating capacity: " + seatingCapacity);
        }

        if(upholstery != null &&
                (!upholstery.equalsIgnoreCase(MATERIAL_LEATHER)
                        && !upholstery.equalsIgnoreCase(MATERIAL_VELVET))
        )
        {
            throw new IllegalArgumentException("Invalid frame material: " + frameMaterial);
        }

        this.seatingCapacity = seatingCapacity;
        this.upholstery = upholstery;
    }

    @Override
    public String getType()
    {
        return "Sofa";
    }
}
