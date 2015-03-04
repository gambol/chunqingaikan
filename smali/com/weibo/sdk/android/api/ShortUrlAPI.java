package com.weibo.sdk.android.api; class ShortUrlAPI { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/api/ShortUrlAPI;
a=0;// .super Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .source "ShortUrlAPI.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SERVER_URL_PRIX:Ljava/lang/String; = "https://api.weibo.com/2/short_url"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;//     .locals 0
a=0;//     .param p1, "accessToken"    # Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-direct {p0, p1}, Lcom/weibo/sdk/android/api/WeiboAPI;-><init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/ShortUrlAPI;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clicks([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "url_short"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 61
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     array-length v1, p1
a=0;// 
a=0;//     .line 63
a=0;//     .local v1, "length":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "length":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v3, "https://api.weibo.com/2/short_url/clicks.json"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3, v2, v4, p2}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// 
a=0;//     .line 64
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "length":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v3, "url_short"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-object v4, p1, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public commentCounts([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "url_short"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 140
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     array-length v1, p1
a=0;// 
a=0;//     .line 142
a=0;//     .local v1, "length":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 146
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "length":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v3, "https://api.weibo.com/2/short_url/comment/counts.json"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3, v2, v4, p2}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "length":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v3, "url_short"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-object v4, p1, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public comments(Ljava/lang/String;JJIILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "url_short"    # Ljava/lang/String;
a=0;//     .param p2, "since_id"    # J
a=0;//     .param p4, "max_id"    # J
a=0;//     .param p6, "count"    # I
a=0;//     .param p7, "page"    # I
a=0;//     .param p8, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 162
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "url_short"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 163
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 164
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 165
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 166
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 167
a=0;//     const-string v1, "https://api.weibo.com/2/short_url/comment/comments.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p8}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public expand([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "url_short"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     array-length v1, p1
a=0;// 
a=0;//     .line 45
a=0;//     .local v1, "length":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "length":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v3, "https://api.weibo.com/2/short_url/expand.json"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3, v2, v4, p2}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// 
a=0;//     .line 46
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "length":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v3, "url_short"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-object v4, p1, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public locations(Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "url_short"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "url_short"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 91
a=0;//     const-string v1, "https://api.weibo.com/2/short_url/locations.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p2}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public referers(Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "url_short"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "url_short"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     const-string v1, "https://api.weibo.com/2/short_url/referers.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p2}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shareCounts([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "url_short"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 102
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     array-length v1, p1
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "length":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "length":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v3, "https://api.weibo.com/2/short_url/share/counts.json"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3, v2, v4, p2}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// 
a=0;//     .line 105
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "length":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v3, "url_short"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-object v4, p1, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public shareStatuses(Ljava/lang/String;JJIILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "url_short"    # Ljava/lang/String;
a=0;//     .param p2, "since_id"    # J
a=0;//     .param p4, "max_id"    # J
a=0;//     .param p6, "count"    # I
a=0;//     .param p7, "page"    # I
a=0;//     .param p8, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "url_short"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 125
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 126
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 127
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 128
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 129
a=0;//     const-string v1, "https://api.weibo.com/2/short_url/share/statuses.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p8}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shorten([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "url_long"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 26
a=0;//     array-length v1, p1
a=0;// 
a=0;//     .line 27
a=0;//     .local v1, "length":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 32
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "length":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v3, "https://api.weibo.com/2/short_url/shorten.json"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3, v2, v4, p2}, Lcom/weibo/sdk/android/api/ShortUrlAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// 
a=0;//     .line 28
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "length":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v3, "url_long"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-object v4, p1, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 27
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
