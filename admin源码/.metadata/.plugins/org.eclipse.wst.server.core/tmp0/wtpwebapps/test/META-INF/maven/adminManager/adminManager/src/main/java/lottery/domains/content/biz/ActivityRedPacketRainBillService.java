package lottery.domains.content.biz;

import javautils.jdbc.PageList;

public interface ActivityRedPacketRainBillService
{
    PageList find(final String p0, final String p1, final String p2, final String p3, final int p4, final int p5);
    
    double sumAmount(final String p0, final String p1, final String p2, final String p3);
}
