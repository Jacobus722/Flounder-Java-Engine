package flounder.fonts;

/**
 * Simple data structure class holding information about a certain glyph in the font texture atlas. All sizes are for a font-size of 1.
 */
public class Character {
	private int id;
	private double xTextureCoord;
	private double yTextureCoord;
	private double xMaxTextureCoord;
	private double yMaxTextureCoord;
	private double xOffset;
	private double yOffset;
	private double sizeX;
	private double sizeY;
	private double xAdvance;

	/**
	 * Creates a new simple data structure for characters.
	 *
	 * @param id The ASCII value of the character.
	 * @param xTextureCoord The x texture coordinate for the top left corner of the character in the texture atlas.
	 * @param yTextureCoord The y texture coordinate for the top left corner of the character in the texture atlas.
	 * @param xTexSize The width of the character in the texture atlas.
	 * @param yTexSize The height of the character in the texture atlas.
	 * @param xOffset The x distance from the cursor to the left edge of the character's quad.
	 * @param yOffset The y distance from the cursor to the top edge of the character's quad.
	 * @param sizeX The width of the character's quad in screen space.
	 * @param sizeY The height of the character's quad in screen space.
	 * @param xAdvance How much the cursor will move forward after this character.
	 */
	protected Character(int id, double xTextureCoord, double yTextureCoord, double xTexSize, double yTexSize, double xOffset, double yOffset, double sizeX, double sizeY, double xAdvance) {
		this.id = id;
		this.xTextureCoord = xTextureCoord;
		this.yTextureCoord = yTextureCoord;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.xMaxTextureCoord = xTexSize + xTextureCoord;
		this.yMaxTextureCoord = yTexSize + yTextureCoord;
		this.xAdvance = xAdvance;
	}

	/**
	 * Gets the ASCII value of the character.
	 *
	 * @return The ASCII value of the character.
	 */
	protected int getId() {
		return id;
	}

	/**
	 * Gets the x texture coordinate for the top left corner of the character in the texture atlas.
	 *
	 * @return The x texture coordinate for the top left corner of the character in the texture atlas.
	 */
	protected double getXTextureCoord() {
		return xTextureCoord;
	}

	/**
	 * Gets the y texture coordinate for the top left corner of the character in the texture atlas.
	 *
	 * @return The y texture coordinate for the top left corner of the character in the texture atlas.
	 */
	protected double getYTextureCoord() {
		return yTextureCoord;
	}

	/**
	 * Gets the max width of the character in the texture atlas.
	 *
	 * @return The max width of the character in the texture atlas.
	 */
	protected double getXMaxTextureCoord() {
		return xMaxTextureCoord;
	}

	/**
	 * Gets the max height of the character in the texture atlas.
	 *
	 * @return The max height of the character in the texture atlas.
	 */
	protected double getYMaxTextureCoord() {
		return yMaxTextureCoord;
	}

	/**
	 * Gets the x distance from the cursor to the left edge of the character's quad.
	 *
	 * @return The x distance from the cursor to the left edge of the character's quad.
	 */
	protected double getXOffset() {
		return xOffset;
	}

	/**
	 * Gets the y distance from the cursor to the left edge of the character's quad.
	 *
	 * @return The y distance from the cursor to the left edge of the character's quad.
	 */
	protected double getYOffset() {
		return yOffset;
	}

	/**
	 * Gets the width of the character's quad in screen space.
	 *
	 * @return The width of the character's quad in screen space.
	 */
	protected double getSizeX() {
		return sizeX;
	}

	/**
	 * Gets the height of the character's quad in screen space.
	 *
	 * @return The height of the character's quad in screen space.
	 */
	protected double getSizeY() {
		return sizeY;
	}

	/**
	 * Gets how much the cursor will move forward after this character.
	 *
	 * @return How much the cursor will move forward after this character.
	 */
	protected double getXAdvance() {
		return xAdvance;
	}
}
