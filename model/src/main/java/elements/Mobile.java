package elements;

import contract.IMobile;
import contract.Permeability;
import model.Elements;

public abstract class Mobile extends Elements implements IMobile{

	Permeability penetrable;
}
