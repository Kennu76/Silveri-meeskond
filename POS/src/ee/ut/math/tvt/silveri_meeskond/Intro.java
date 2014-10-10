package ee.ut.math.tvt.silveri_meeskond;

import java.io.IOException;

import org.apache.log4j.Logger;

public class Intro {
	
	private static final Logger log = Logger.getLogger(Intro.class);
	
	public static void main(String[] args) throws IOException {

		IntroUI.introWindow();
		
		log.info("Intro window opened."); //vms??
		
	}

}
