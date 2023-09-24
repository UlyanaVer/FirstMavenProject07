import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void testSum() {
        Main main = new Main();
        double s = main.sum(3, 5);
        Assert.assertEquals(s,8);
    }

    @Test
    public void testSub(){
        Main main = new Main();
        double sub1 = main.sub(-9,9);
        Assert.assertEquals(sub1,-18);
    }

    @Test
    public void testMultiplication(){
        Main main = new Main();
        double multi = main.multiplication(7.8, 2);
        Assert.assertEquals(multi,15.6);
    }

    @Test
    public void testDiv(){
        Main main = new Main();
        double div1 = main.div(6,2);
        Assert.assertEquals(div1,3);
    }

}