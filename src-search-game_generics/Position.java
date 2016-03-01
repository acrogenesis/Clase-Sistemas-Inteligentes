final public class Position {
    final static public int BLANK = 0;
    final static public int HUMAN = 1;
    final static public int PROGRAM = -1;
    final static public int PAWN = 1;
    final static public int KNIGHT = 2;
    final static public int BISHOP = 3;
    final static public int ROOK = 4;
    final static public int QUEEN = 5;
    final static public int KING = 9;
    int [] board = new int[120];
	
	boolean isEmpty() {
		boolean empty = true;
		for (int i=0; i<120; i++) {
			if (board[i] != 0) {
				empty = false;
				break;
			}
		}
		return empty;
	}
	 
    public String toString() {
        StringBuffer sb = new StringBuffer("[Position: ");
        for (int i=22; i<100; i++) {
            sb.append(""+board[i]+",");
        }
        sb.append("]");
        return sb.toString();
    }
}
