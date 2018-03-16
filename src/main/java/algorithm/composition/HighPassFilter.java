package algorithm.composition;

import algorithm.Measurement;
import algorithm.MeasurementUtil;

import java.util.Collection;

/// <summary>
/// Should filter out measurements with an X or Y that are less than or equal to 2
/// You'll need to implement IMeasureFilter to do the job
/// </summary>
///
public class HighPassFilter implements IMeasurementFilter {


    @Override
    public Collection<Measurement> filter(Collection<Measurement> measurements) {
        return MeasurementUtil.WhereMoreThanXandY(measurements,2,15);
    }
}
