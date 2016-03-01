import java.util.List;


public class SearchResult {
    float score;
    List<Position> boardAfterTestMoves;
    public SearchResult(float score) { this.score = score; }
    public SearchResult(float score, List<Position> positions) {
    	this.score = score;
    	boardAfterTestMoves = positions;
    }
}
