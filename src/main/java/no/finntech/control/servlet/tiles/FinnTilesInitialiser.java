package no.finntech.control.servlet.tiles;

import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.startup.AbstractTilesInitializer;

public class FinnTilesInitialiser extends AbstractTilesInitializer {
	
    @Override
    protected AbstractTilesContainerFactory createContainerFactory(ApplicationContext context) {
        return new FinnTilesContainerFactory();
    }
}