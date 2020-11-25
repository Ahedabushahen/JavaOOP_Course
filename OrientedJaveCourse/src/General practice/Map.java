/* inner class - can interact with local variables and objects */
/* https://javabook.co.il/book/inner.pdf */
public class Map { 
	private int time;
	private Tile[][] tiles;
	public Map(int width, int height) {
		tiles = new Tile[height][width];
		time = 0;
		for(int i = 0; i < tiles.length;i++) {
			for(int j = 0; j < tiles[0].length;j++) {
				tiles[i][j] = new Tile(j,i);
				time++;
				
			}
		}
	}
	public class Tile{
		private int x;
		private int y;
		private int id;
		public Tile(int x, int y) {
			this.x = x;
			this.y = y;
			id = time / 3 * 5;
		}
		public int getX() {
			return x;
		}
		public int gety() {
			return y;
		}
		public int getid(){
			return id;
		}
	}
}
