package saint.cheshire.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saint.cheshire.properties.NamesProperties;

@Log4j2
@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ImportantConfigService {

    @NonNull
    private final NamesProperties namesProperties;

    public void getAllGirlsNames() {
        log.info("Girls names from config: {}", namesProperties.getGirls());
    }

    public void getAllBoysNames() {
        log.info("Boys names from config: {}", namesProperties.getBoys());
    }

}
