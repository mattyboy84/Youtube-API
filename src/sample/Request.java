package sample;

public class Request {

    public static StringBuilder request;

    public Request(String type) {
        request = new StringBuilder("https://www.googleapis.com/youtube/v3/" + type + "?key=AIzaSyBFtKAemvrKpAKZbBEvJtFo0pC7tQP_d8E");
    }

    public Request setChannelID(String channelID) {
        request.append("&channelId=");
        request.append(channelID);
        return this;
    }

    public Request setMaxResults(int maxResults) {
        request.append("&maxResults=");
        request.append(maxResults);
        return this;
    }

    public Request setOrder(String date) {
        request.append("&order=");
        request.append(date);
        return this;
    }

    public Request setPageToken(String token) {
        if (token != null && !token.equals("")) {
            request.append("&pageToken=");
            request.append(token);
        }
        return this;
    }

    public Request setPart(String snippet) {
        request.append("&part=");
        request.append(snippet);
        return this;
    }

    public String toString() {
        return request.toString();
    }

    public Request setVideoID(String ID) {
        request.append("&id=");
        request.append(ID);
        return this;
    }

    public void setPlaylistID(String asString) {
    }

    public Request setType(String type) {
        request.append("&type=");
        request.append(type);
        return this;
    }
}