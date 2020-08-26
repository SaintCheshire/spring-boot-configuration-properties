package saint.cheshire.application;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import saint.cheshire.service.ImportantConfigService;

@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ImportantConfigService importantConfigService;

    @Test
    public void test() {
        importantConfigService.getAllBoysNames();
        importantConfigService.getAllGirlsNames();
    }

}