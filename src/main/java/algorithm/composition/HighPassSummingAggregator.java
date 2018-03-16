package algorithm.composition;

/// <summary>
/// Should filter out measurements with an X or Y that are less than or equal to 2
/// You'll need to inherit and override methods from other classes in the inheritance folder
/// </summary>

import algorithm.Measurement;
import algorithm.MeasurementUtil;

import java.util.Collection;

public class HighPassSummingAggregator extends PointsAggregator {


    public HighPassSummingAggregator(Collection<Measurement> measurements) {
        super(measurements, new HighPassFilter(), new SummingStrategy());

    }

}
