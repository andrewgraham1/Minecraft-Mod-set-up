package com.andrewgraham1;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SwordMod.MODID)
public class SwordMod {
    public static final String MODID = "swordmod";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public SwordMod() {
        LOGGER.debug("Hello from Sword Mod!");
    }


}
