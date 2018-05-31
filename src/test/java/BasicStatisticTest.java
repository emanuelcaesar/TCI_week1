import org.junit.Test;

import static org.junit.Assert.*;

public class BasicStatisticTest {
    @Test
    public void NumberDataIsZeroh() {
        //arrange
        BasicStatistic bs = new BasicStatistic();
        //act
        int amount = bs.numberOfDataItems();
        //assert
        assertEquals("Data is not zero!",0,amount);
    }

    @Test
    public void ClearedDataStateShouldBeZero() {
        //arrange
        BasicStatistic bs = new BasicStatistic();
        //act
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(13.0);
        bs.addDoubleToData(15.0);
        bs.clearData();
        int amount = bs.numberOfDataItems();
        //assert
        assertEquals("Data cleared and not zero", 0, amount);
    }

    @Test
    public void AddedDataShouldnotZero() {
        //arrange
        BasicStatistic bs = new BasicStatistic();
        //act
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(13.0);
        bs.addDoubleToData(15.0);
        int amount = bs.numberOfDataItems();
        //assert
        assertNotEquals("Data added but zero", 0, amount);
    }

    @Test
    public void AfterAddingAmountCorrectAdded() {
        //arrange
        BasicStatistic bs = new BasicStatistic();
        //act
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(13.0);
        bs.addDoubleToData(15.0);
        int begin = bs.numberOfDataItems();
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(13.0);
        bs.addDoubleToData(15.0);
        int after = bs.numberOfDataItems();
        int amount = after - begin;
        //assert
        assertEquals("Data added amount incorrect", 3, amount);
    }

    @Test
    public void SumTest() {
        //arrange
        BasicStatistic bs = new BasicStatistic();
        //act
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(10.0);
        double amount = bs.sum();
        //assert
        assertEquals("Data sum not correct", 30.0, amount, 0.0);
    }

    @Test
    public void MeanTest() throws NoDataItemsException {
        //arrange
        BasicStatistic bs = new BasicStatistic();
        //act
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(10.0);
        bs.addDoubleToData(10.0);
        double amount = bs.getMean();
        //assert
        assertEquals("Mean is not incorrect", 10.0, amount, 0.0);
    }

    @Test(expected = NoDataItemsException.class)
    public void meanWithZeroData() throws NoDataItemsException {
        //arrange
        BasicStatistic bs = new BasicStatistic();

        //act
        double amount = bs.getMean();
        //assert
    }
}