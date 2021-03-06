/**
 * 
 */
package engine;

import static engine.Pieces.coords;

/**
 * @author shakir
 *
 */
public class Move {

	public int from;
	public int to;

	public Move(int from, int to) {
		this.from = from;
		this.to = to;
	}
	

	public void output() {
		System.out.println("FROM: " + coords.get(this.from) + "    " + "TO: " + coords.get(this.to));
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Move other = (Move) obj;
        
        if (this.from != other.from) {
            return false;
        }
        

        if (this.to != other.to) {
            return false;
        }

        return true;
    }
}
