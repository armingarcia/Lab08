public enum GamePiece {
	
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	BLUE_PACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);

	
	private GamePieceAppearance Appearance;
	private int Priority;
	
	private GamePiece(GamePieceAppearance Appearance, int priority) {
		this.Appearance = Appearance;
		this.Priority = priority;
	}
	
	public static GamePiece movesFirst(GamePiece a, GamePiece b) {
		
	}
	
	public String toString("%s: a %s %s with priority %d")
}
}

	