
public class Table {
	private int table[][];
	private int h;
	private int w;
	
	
	public Table(int width, int height) {
		this.h = height;
		this.w = width;
		this.table = new int[h][w];
		for(int i=0; i <h;i++) {
			for(int j=0; j<w;j++) {
				table[i][j] = (i+1)*(j+1);
			}
		}
	}
	void display(int w, int h) {
		System.out.printf("Multiplication Table ([1..%d]x[1..%d])\n\n",w,h);
		System.out.println();
		for(int i = 0; i <h; i++) {
			for(int j = 0; j<w; j++) {
				System.out.printf("%6d",table[i][j]);
			}
			System.out.println();
		}
		
	}
	void display(int fc, int tc, int fr, int tr) {
		System.out.printf("Multiplication Table ([%d..%d]x[%d..%d])\n\n",fc,tc,fr,tr);
		for(int i = fr-1; i <= tr; i++) {

			for(int j = fc-1; j<= tc;j++) {
				if(i == fr -1 && j == fc-1) {
					System.out.printf("%6s","");
				}
				else if(i == fr-1) {
					System.out.printf("%6d",j);
				}
				else if(j == fc-1) {
					System.out.printf("%6d",i);
				}
				else
					System.out.printf("%6d",table[i-1][j-1]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	
}
