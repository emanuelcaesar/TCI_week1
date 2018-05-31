import java.util.ArrayList;

/**
 * very simple implementation of the BasicStatisticInterface
 */
public class BasicStatistic implements BasicStatisticInterface {

    private ArrayList<Double> itemsData = new ArrayList<>();

    @Override
    public void addDoubleToData(Double valueToAdd){
        itemsData.add(valueToAdd);
    }

    @Override
    public void clearData(){
        itemsData.clear();
    };
	
    @Override
    public int numberOfDataItems(){
        return itemsData.size();
    }

    @Override
    public Double sum(){
        double rv = 0.0;
        for(int i = 0; i<itemsData.size(); i++){
            rv = rv + itemsData.get(i);
        }
        return rv;
    }

    @Override
    public Double highestValue() throws NoDataItemsException {
        double rv = 0.0;
        return rv;
    }

    @Override
    public Double getMean() throws NoDataItemsException {
        double rv = 0.0;
        if(numberOfDataItems() !=0) {
            rv = sum() / numberOfDataItems();
        } else {
            throw new NoDataItemsException("No Data Items");
        }
        return rv;
    }

    @Override
    public double getMedian() throws NoDataItemsException {
        double rv = 0.0;
        return rv;
    }

    @Override
    public double getStandardDeviation() throws NoDataItemsException {
        double rv = 0.0;
        return rv;
    }
}
