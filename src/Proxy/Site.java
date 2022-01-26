package Proxy;

public class Site implements ISite{
    @Override
    public String getPage(int num) {
        return "Это страница сайта " + num;
    }
}
