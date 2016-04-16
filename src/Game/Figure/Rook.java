package Game.Figure;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dominikolczyk on 13.04.2016.
 */
public class Rook extends Figure {

	Integer value = 5;

	public Rook(String figureColor){
		this.color = figureColor;
	}
	List<Pair<Integer,Integer>> possibleMoves(Pair<Integer,Integer> position) {
		List<Pair<Integer,Integer>> moves = new ArrayList<Pair<Integer, Integer>>();
		for(int i=0;i<8;i++) {
			moves.add(new Pair<Integer,Integer>(i,position.getValue()));
			moves.add(new Pair<Integer,Integer>(position.getValue(),i));
			moves.remove(position);
		}
		return moves;
	}

}
