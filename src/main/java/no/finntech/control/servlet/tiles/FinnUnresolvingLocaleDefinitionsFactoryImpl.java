package no.finntech.control.servlet.tiles;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.ListAttribute;
import org.apache.tiles.definition.UnresolvingLocaleDefinitionsFactory;
import org.apache.tiles.request.Request;

public class FinnUnresolvingLocaleDefinitionsFactoryImpl extends UnresolvingLocaleDefinitionsFactory {
	 
    private static final String DEF_INJECTION = "definition-injection";
 
    public FinnUnresolvingLocaleDefinitionsFactoryImpl() {}
 
    // this method may return null
    @Override
    public Definition getDefinition(String name, Request tilesContext) {
        Definition def = null;
        // WEB-INF is a pretty clear indicator it is not a definition
        if(!name.startsWith("/WEB-INF/")){
            def = super.getDefinition(name, tilesContext);
            if(null != def){
                def = new Definition(def); // use a safe copy
                Attribute defList = def.getLocalAttribute(DEF_INJECTION); // explicit injected definitions
                if(null != defList && defList instanceof ListAttribute){
                	ListAttribute attributes = (ListAttribute) defList; 
                    for(Attribute inject : attributes.getValue()){
                        injectDefinition((String) inject.getValue(), def, tilesContext);
                    }
                }
            }
        }
        return def;
    }
    
    private void injectDefinition(String fromName, Definition to, Request cxt) {
        assert null != fromName : "Definition not found " + fromName;
        Definition from = getDefinition(fromName, cxt);
        if (null != from) {
            if (null != from.getLocalAttributeNames()) {
                for (String attrName : from.getLocalAttributeNames()) {
                    to.putAttribute(attrName, from.getLocalAttribute(attrName), true);
                }
            }
        }
    }
}