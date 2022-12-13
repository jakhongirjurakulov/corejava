public class Browser {
    public void navigate (String address) {
        String ip = findIpAddress(address);
        String html = sendHttpAddress(ip);
        System.out.println(html);
    }

//    These were public - Reducing Coupling

    private String sendHttpAddress(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}