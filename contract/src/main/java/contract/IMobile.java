package contract;

import java.io.IOException;

public interface IMobile {
	void move(char c) throws IOException;
	void launchSpell();
}
