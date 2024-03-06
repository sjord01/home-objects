public class Computer extends Electronics
{
    private final String processor;
    private final int memoryGb;

    public Computer(final String homeObjectName,
                    final String homeObjectBrand,
                    final double priceCAD,
                    final String homeObjectColor,
                    final int voltageV,
                    final String itemConnectivity,
                    final String processor,
                    final int memoryGb)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor, voltageV, itemConnectivity);
        this.processor = processor;
        this.memoryGb = memoryGb;
    }

    @Override
    public String getType()
    {
        return "Computer";
    }
}
