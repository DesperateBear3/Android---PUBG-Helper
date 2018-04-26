package top.bear3.pubg_helper;

/**
 * author : TT
 * e-mail : tianruofengxing@163.com
 * time   : 2018/04/26
 * desc   :
 * version: 1.0
 */
public enum Region {
    Korea("pc-krjp"),
    Japan("pc_jp"),
    NorthAmerica("pc_na"),
    Europe("pc_eu"),
    Oceania("pc-oc"),
    Kakao("pc-kakao"),
    SouthEaseAsia("pc-sea"),
    SouthAndCentralAmerica("pc-sa"),
    Asia("pc-as");

    String region;

    Region(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
}
