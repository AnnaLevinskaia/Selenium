package GroupProject;
/*    Provide Implementation for the diagram below.
Then create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.*/
interface WebDriverTask4 {

void open();
void close();
String getTitle();
    
}

interface RemoteWebDriver extends WebDriverTask4{
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Chrome is open");
    }

    @Override
    public void close() {
        System.out.println("Chrome is close");

    }

    @Override
    public String getTitle() {
        return ("get title Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Get Chrome driver");
    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Firefox is open");
    }

    @Override
    public void close() {
        System.out.println("Firefox is close");
    }

    @Override
    public String getTitle() {
        return ("get title Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("Get Firefox driver");
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Safari is open");
    }

    @Override
    public void close() {
        System.out.println("Safari is close");
    }

    @Override
    public String getTitle() {
        return ("get title Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Get Safari driver");
    }
}

class TestTask4{
    public static void main(String[] args) {


        ChromeDriver obj1 = new ChromeDriver();
        obj1.navigate();
        obj1.close();
        obj1.getTitle();
        obj1.open();
        FirefoxDriver obj2 = new FirefoxDriver();
        obj2.navigate();
        obj2.close();
        obj2.getTitle();
        obj2.open();
        SafariDriver obj3 = new SafariDriver();
        obj3.navigate();
        obj3.close();
        obj3.getTitle();
        obj3.open();

    }
}

