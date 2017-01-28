package com.example.student.newsreader.concern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by ohgi on 2016/12/17.
 */

public class QiitaResponse {
    // 投稿の一意なID
    public String id;
    // 投稿のURL
    public String url;

    // 投稿のタイトル
    public String title;
    // 投稿内容を表すHTML形式の文字列
    public String rendered_body;
    // 投稿内容を表すMarkdown形式の文字列
    public String body;
    // 投稿時間
    public String created_at;

    // TODO: その他params
    //   http://qiita.com/api/v2/docs#%E6%8A%95%E7%A8%BF

    public String getTitle(){ return title; }

    public String getDesc(){
        /*
        if(body.length() > 140) {
            return body.substring(0, 140);
        }
        */
        return body;
    }

    public String getCreated_at() {
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));

        return sdf.format(created_at);
        */
        return created_at;
    }
}
