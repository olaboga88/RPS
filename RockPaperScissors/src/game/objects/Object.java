package game.objects;

public enum Object {
	ROCK (0), PAPER (1), SCISSORS (2);
	
	
	
	private int comparison[][]= {
			
			//@formatter:on
					//				rock		paper		scissors
					/*rock */		{0,			 -1,			1},
					/*paper */		{1,			  0,		   -1},
					/*scissors */	{-1,		  1,			0}
			};
			//@formatter:off
	
	
	
	public int compareTo(Object other) {
		return comparison[this.ordinal()][other.ordinal()];
	}
}
