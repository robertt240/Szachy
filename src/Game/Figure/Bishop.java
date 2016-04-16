package Game.Figure;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dominikolczyk on 13.04.2016.
 */
public class Bishop extends Figure {
	Integer value = 3;

	public Bishop(String figureColor) {
		this.color = figureColor;
	}

	List<Pair<Integer, Integer>> possibleMoves(Pair<Integer, Integer> position) {
		List<Pair<Integer, Integer>> candidates = new ArrayList<Pair<Integer, Integer>>();
		for (int i = 0; i < 8; i++) {
			candidates.add(new Pair<Integer,Integer>(position.getKey()+i,position.getValue()+i));
			candidates.add(new Pair<Integer,Integer>(position.getKey()-i,position.getValue()+i));
			candidates.add(new Pair<Integer,Integer>(position.getKey()+i,position.getValue()-i));
			candidates.add(new Pair<Integer,Integer>(position.getKey()-i,position.getValue()-i));
		}
		for(Pair<Integer,Integer> move: candidates) {
			if(move.getKey()>7 || move.getValue()>7) {
				candidates.remove(move);
			}
		}
		return candidates;
	}
}
