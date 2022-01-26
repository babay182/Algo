package Proxy;

import java.util.HashMap;
import java.util.Map;

public class SiteProxy implements ISite{
    private ISite site;
    private Map<Integer, String> cash;

    public SiteProxy(ISite site) {
        this.site = site;
        cash = new HashMap<>();
    }

    @Override
    public String getPage(int num) {
        String page;
        if(cash.containsKey(num)){
            page = cash.get(num);
            page = "from cash " + page;
        }else {
            page = site.getPage(num);
            cash.put(num, page);
        }
        return page;
    }
}
