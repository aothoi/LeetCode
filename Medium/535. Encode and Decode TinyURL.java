//Runtime: 2ms && Memory: 41.7 MB

public class Codec {
    Map<String, String> map = new HashMap<>();
    int lastKey = 0;

    public String encode(String longUrl) {
        String key = "http://tinyurl.com/"+Integer.toString(++lastKey);
        map.put(key, longUrl);
        return key;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
