package oct.ex_14102024_Abstraction.realexample1;

public class Lab131 {
    public static void main(String[] args) {
        ChromeTC c  = new ChromeTC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FirefoxTC firefoxtc = new FirefoxTC();
        firefoxtc.openBrowser("FIREFOX");
        firefoxtc.closeBrowser("FIREFOX");
    }
}
