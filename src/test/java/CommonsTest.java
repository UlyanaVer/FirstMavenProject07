import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonsTest {
    @Test
    public void testAbbreviate10(){
        String a1 = StringUtils.abbreviate("Привет всем кто живет на луне!",10);
        Assert.assertEquals(a1,"Привет ...");
    }

    @Test
    public void testAbbreviate20(){
        String a2 = StringUtils.abbreviate("Привет всем кто живет на луне!",20);
        Assert.assertEquals(a2,"Привет всем кто ж...");
    }
}
