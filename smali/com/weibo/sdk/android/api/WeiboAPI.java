package com.weibo.sdk.android.api; class WeiboAPI { void a() { int a;
a=0;// .class public abstract Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .super Ljava/lang/Object;
a=0;// .source "WeiboAPI.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$CAPITAL;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$COMMENTS_TYPE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$COUNT_TYPE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$EMOTION_TYPE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$FRIEND_TYPE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$LANGUAGE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$RANGE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$SCHOOL_TYPE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$SORT;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$SORT2;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$SORT3;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$STATUSES_TYPE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$TYPE;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$TYPE_FILTER;,
a=0;//         Lcom/weibo/sdk/android/api/WeiboAPI$USER_CATEGORY;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final API_SERVER:Ljava/lang/String; = "https://api.weibo.com/2"
a=0;// 
a=0;// .field public static final HTTPMETHOD_GET:Ljava/lang/String; = "GET"
a=0;// 
a=0;// .field public static final HTTPMETHOD_POST:Ljava/lang/String; = "POST"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private accessToken:Ljava/lang/String;
a=0;// 
a=0;// .field private oAuth2accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;//     .locals 1
a=0;//     .param p1, "oauth2AccessToken"    # Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/WeiboAPI;);
a=0;//     iput-object p1, p0, Lcom/weibo/sdk/android/api/WeiboAPI;->oAuth2accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/api/WeiboAPI;->oAuth2accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/api/WeiboAPI;->oAuth2accessToken:Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/weibo/sdk/android/Oauth2AccessToken;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/api/WeiboAPI;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 2
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "params"    # Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     .param p3, "httpMethod"    # Ljava/lang/String;
a=0;//     .param p4, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     const-string v0, "access_token"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/weibo/sdk/android/api/WeiboAPI;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 141
a=0;//     invoke-static {p1, p2, p3, p4}, Lcom/weibo/sdk/android/net/AsyncWeiboRunner;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 142
a=0;//     return-void
a=0;// .end method
}}
