package me.whiteship.demooauth2.socal.facebook;


import org.springframework.security.oauth2.common.OAuth2AccessToken;

public class FacebookUserDetails {

    public Picture picture;
    private String id;
    private String name;
    private String email;
    private long expiration;
    private String access_token;

    public void setAccessToken(OAuth2AccessToken accessToken) {
        this.access_token = accessToken.getValue();
        this.expiration = accessToken.getExpiration().getTime();
    }

    public String getImageUrl() {
        return picture.data.url;
    }

    public static class Picture {
        private Data data;

        public static class Data {
            private String url;
        }
    }

    public Picture getPicture() {
        return picture;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getExpiration() {
        return expiration;
    }

    public String getAccess_token() {
        return access_token;
    }
}
