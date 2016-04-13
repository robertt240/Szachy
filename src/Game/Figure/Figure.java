package Game.Figure;

import javafx.util.Pair;

import java.util.List;

/**
 * Created by dominikolczyk on 13.04.2016.
 */
public interface Figure {
	String color;
	Integer value;
	List<Pair<Integer,Integer>> possibleMoves(Pair<Integer,Integer>);
}
