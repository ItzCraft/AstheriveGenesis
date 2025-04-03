package astherivegen.world.blocks.bioplasm;

import arc.Core;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.graphics.g2d.TextureRegion;
import arc.math.*;
import arc.util.*;
import arc.math.geom.*;
import mindustry.world.blocks.defense.*;
import mindustry.gen.Building;
import mindustry.graphics.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.Tile;
import mindustry.graphics.*;
import mindustry.content.*;

import static mindustry.Vars.*;

public class BioBlock extends Block {
    public int biopulse = 0;
    public BioBlock(String name){
        super(name);
        update=true;
    }
    public class BioBuilding extends Building {
        public int getPulse() {
            return biopulse;
        }
        public int setPulse(int amount) {
            biopulse=amount;
        }
    }
}
