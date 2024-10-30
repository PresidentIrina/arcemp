package EstovakianAce.ArcahvEmpire.world.systems;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Condition;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.*;
import com.fs.starfarer.api.campaign.econ.EconomyAPI;
import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.impl.campaign.ids.*;
import com.fs.starfarer.api.impl.campaign.procgen.NebulaEditor;
import com.fs.starfarer.api.impl.campaign.procgen.PlanetConditionGenerator;
import com.fs.starfarer.api.impl.campaign.procgen.StarAge;
import com.fs.starfarer.api.impl.campaign.procgen.StarSystemGenerator;
import com.fs.starfarer.api.impl.campaign.terrain.AsteroidFieldTerrainPlugin.AsteroidFieldParams;
import com.fs.starfarer.api.impl.campaign.terrain.MagneticFieldTerrainPlugin;
import com.fs.starfarer.api.util.Misc;
import com.fs.starfarer.api.impl.campaign.terrain.MagneticFieldTerrainPlugin.MagneticFieldParams;
import org.lazywizard.lazylib.MathUtils;

public class Ekranolis {
    public void generate(SectorAPI sector) {
        StarSystemAPI system = sector.createStarSystem("Ekranolis");
        system.getLocation().set(20500,-39500); //bottom center-right

        system.setBackgroundTextureFilename("graphics/arcemp/backgrounds/ekranolis.png");

        PlanetAPI ekranolisStar = system.initStar("Ekranolis",
                "star_blue_giant",
                900f,
                500
        );
        system.setLightColor(new Color(65, 127, 188));

        PlanetAPI aerot = system.addPlanet("aerot",
                ekranolisStar,
                "Aerot",
                "rocky_ice",
                50,
                400,
                2800,
                1000
        );
        aerot.setCustomDescriptionId("arcemp_ekranolis_aerot"); //reference descriptions.csv
        aerot.getMarket().addCondition(Conditions.HIGH_GRAVITY);
        aerot.getMarket().addCondition(Conditions.DARK);
        aerot.getMarket().addCondition(Conditions.COLD);
        aerot.getMarket().addCondition(Conditions.ICE);
        aerot.getMarket().addCondition(Conditions.DENSE_ATMOSPHERE);
        aerot.getMarket().addCondition(Conditions.ORE_ULTRARICH);
        aerot.getMarket().addCondition(Conditions.RARE_ORE_ULTRARICH);
        aerot.getMarket().addCondition(Conditions.POPULATION_4);
        aerot.getMarket().addCondition(Conditions.INDUSTRIAL_POLITY);
    }
}