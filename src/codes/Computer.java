public class Computer extends Electronics
{
    private final String    processor;
    private final long       memoryGb;

    private static final int MIN_PROCESSOR_NAME = 4;
    private static final int MAX_PROCESSOR_NAME = 12;
    private static final long MIN_MEMORY_GB = 8;
    private static final long MAX_MEMORY_GB = 17_000_000_000L;

    public Computer(final String homeObjectName,
                    final String homeObjectBrand,
                    final double priceCAD,
                    final String homeObjectColor,
                    final int voltageV,
                    final String itemConnectivity,
                    final String processor,
                    final long memoryGb)
    {
        super(homeObjectName, homeObjectBrand, priceCAD, homeObjectColor, voltageV, itemConnectivity);

        if(processor == null)
        {
                throw new NullPointerException("Invalid item processor: null");
        }

        if(processor.length() < MIN_PROCESSOR_NAME || processor.length() > MAX_PROCESSOR_NAME)
        {
            throw new IllegalArgumentException("Invalid memory: " + processor);
        }

        if(memoryGb < MIN_MEMORY_GB || memoryGb > MAX_MEMORY_GB)
        {
            throw new IllegalArgumentException("Invalid memory: " + memoryGb);
        }

        this.processor = processor;
        this.memoryGb = memoryGb;
    }

    @Override
    public String getType()
    {
        return "Computer";
    }
}
