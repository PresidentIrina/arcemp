package EstovakianAce.ArcahvEmpire.world;

import com.fs.starfarer.api.campaign.SectorAPI;
import EstovakianAce.ArcahvEmpire.world.systems.Ekranolis;

public class ArcahvEmpireGen {
   public void generate(SectorAPI sector) {
       new Ekranolis().generate(sector);
   }
}