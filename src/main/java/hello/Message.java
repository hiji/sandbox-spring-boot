package hello;

/**
 * Created by hijiri on 2017/05/11.
 */
public class Message {

    Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    static class Data {

        Trade trade;

        public Trade getTrade() {
            return trade;
        }

        public void setTrade(Trade trade) {
            this.trade = trade;
        }
    }

    static class Trade {
        String otherHeader;

        public String getOtherHeader() {
            return otherHeader;
        }

        public void setOtherHeader(String otherHeader) {
            this.otherHeader = otherHeader;
        }

    }
}
