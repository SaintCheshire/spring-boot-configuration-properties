package saint.cheshire.properties;

import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "names")
@PropertySource(value = "classpath:important-config.yaml", factory = NamesPropertySourceFactory.class)
@Getter
@Setter
public class NamesProperties {

    @NonNull
    private List<String> boys;

    @NonNull
    private List<String> girls;

}


