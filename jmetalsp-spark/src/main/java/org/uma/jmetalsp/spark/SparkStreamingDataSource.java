package org.uma.jmetalsp.spark;

import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.uma.jmetalsp.StreamingDataSource;
import org.uma.jmetalsp.UpdateData;
import org.uma.jmetalsp.perception.Observable;

/**
 * @author Antonio J. Nebro <antonio@lcc.uma.es>
 */
public interface SparkStreamingDataSource<D extends UpdateData, O extends Observable<D>> extends StreamingDataSource<D, O> {
	void setStreamingContext(JavaStreamingContext streamingContext) ;
}
