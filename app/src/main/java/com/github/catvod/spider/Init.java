package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.SpiderDebug;

public class Init {
    public static void init(Context context) {
        SpiderDebug.log("自定义爬虫代码加载成功！");
        Notify.show("🐯遥遥领先专用资源！资源来源于网络免费爬取。🐯");
    }
}
