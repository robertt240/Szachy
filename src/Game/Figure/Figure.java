package Game.Figure;

import javafx.util.Pair;

import java.util.List;

/**
 * Created by dominikolczyk on 13.04.2016.
 */
public abstract class Figure {
	String color;
	Integer value;
	abstract List<Pair<Integer,Integer>> possibleMoves(Pair<Integer,Integer> position);
}
