package SphinxDemo.sphinx4.edu.cmu.sphinx.decoder;

import SphinxDemo.sphinx4.edu.cmu.sphinx.util.props.Configurable;

/**
 * Some API-elements shared by components which are able to produce <code>Result</code>s.
 *
 * @see SphinxDemo.sphinx4.edu.cmu.sphinx.result.Result
 */
public interface ResultProducer extends Configurable {

    /** Registers a new listener for <code>Result</code>.
     * @param resultListener*/
    void addResultListener(ResultListener resultListener);


    /** Removes a listener from this <code>ResultProducer</code>-instance.
     * @param resultListener*/
    void removeResultListener(ResultListener resultListener);
}
