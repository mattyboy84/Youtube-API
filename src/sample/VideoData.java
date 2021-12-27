package sample;

import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class VideoData {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    String id;
    String title;
    String description;
    String thumbnailURL;
    ImageView thumbnail;
    int views;
    int likes;
    int comments;
    //
    Text titleTXT =new Text();
    Text viewsTXT=new Text();
    Text likesTXT=new Text();
    Text commentsTXT=new Text();
    //
    Vecc2f position;

    public VideoData(ArrayList<VideoData> data, String id, String title, String desc, int viewCount, int likeCount, int commentCount) {
        this.id = id;
        this.title = title;
        this.description = desc;
        this.thumbnailURL = "https://i.ytimg.com/vi/" + this.id + "/mqdefault.jpg";
        this.thumbnail = new ImageView(thumbnailURL);
        //
        this.views = viewCount;
        this.likes = likeCount;
        this.comments = commentCount;
        //
        this.titleTXT.setText(this.title);
        this.viewsTXT.setText("Number of Views: " + this.views);
        this.likesTXT.setText("Number of Likes: " + this.likes);
        this.commentsTXT.setText("Number of Comments: " + this.comments);
        //
        //
    }

    public VideoData(ArrayList<VideoData> data, String id, String title, String desc) {
        this.id = id;
        this.title = title;
        this.description = desc;
        this.thumbnailURL = "https://i.ytimg.com/vi/" + this.id + "/mqdefault.jpg";
        this.thumbnail = new ImageView(thumbnailURL);
        //
        this.titleTXT.setText(this.title);
        this.viewsTXT.setText("Number of Views: " + this.views);
        this.likesTXT.setText("Number of Likes: " + this.likes);
        this.commentsTXT.setText("Number of Comments: " + this.comments);
        //
        //
    }

    public void output() {
        System.out.print(ANSI_YELLOW_BACKGROUND + "Title: " + this.title + ANSI_RESET);
        System.out.print(" " + ANSI_BLUE_BACKGROUND + "Views: " + this.views + ANSI_RESET);
        System.out.print(" " + ANSI_GREEN_BACKGROUND + "Likes: " + this.likes + ANSI_RESET);
        System.out.print(" " + ANSI_PURPLE_BACKGROUND + "Comments: " + this.comments + ANSI_RESET);
        System.out.println("");
    }
}