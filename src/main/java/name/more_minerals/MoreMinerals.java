package name.more_minerals;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMinerals implements ModInitializer {
	public static final String MOD_ID = "more-minerals";
    public static final Logger LOGGER = LoggerFactory.getLogger("more-minerals");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello world!");
	}
}