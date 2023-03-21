public class ConsoleComands {
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    public final static void pauseConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
            }
            else
            {
                Runtime.getRuntime().exec("pause");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
