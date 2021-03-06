package lt.itakademija.repository;

import org.springframework.stereotype.Component;

/**
 * Represents sequence number generator.
 * 
 * @author mariusg
 */
@Component
public interface SequenceNumberGenerator {

    /**
     * Returns the next number in a sequence.
     * <p>
     * First number in a sequence is 1.
     *
     * @return next sequence number.
     */
	
    Long getNext();

}
