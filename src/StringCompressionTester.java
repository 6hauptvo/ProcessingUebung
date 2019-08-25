public class StringCompressionTester
{
    public static void main(String[] args)
    {
        StringCompression compressionClass = new StringCompression();
        System.out.println(compressionClass.stringCompression("BWBBB") + " BWBBB");
        System.out.println(compressionClass.stringCompression("BWBBBWWWBBBB") + " BWBBBWWWBBBB");
    }
}
