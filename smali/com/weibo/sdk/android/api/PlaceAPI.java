package com.weibo.sdk.android.api; class PlaceAPI { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/api/PlaceAPI;
a=0;// .super Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .source "PlaceAPI.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SERVER_URL_PRIX:Ljava/lang/String; = "https://api.weibo.com/2/place"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;//     .locals 0
a=0;//     .param p1, "accessToken"    # Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0, p1}, Lcom/weibo/sdk/android/api/WeiboAPI;-><init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/PlaceAPI;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public friendsTimeline(JJIIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "only_attentions"    # Z
a=0;//     .param p8, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 33
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 34
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 35
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 36
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/friends_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p8}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public nearbyPhotos(Ljava/lang/String;Ljava/lang/String;IJJLcom/weibo/sdk/android/api/WeiboAPI$SORT3;IIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "lat"    # Ljava/lang/String;
a=0;//     .param p2, "lon"    # Ljava/lang/String;
a=0;//     .param p3, "range"    # I
a=0;//     .param p4, "starttime"    # J
a=0;//     .param p6, "endtime"    # J
a=0;//     .param p8, "sort"    # Lcom/weibo/sdk/android/api/WeiboAPI$SORT3;
a=0;//     .param p9, "count"    # I
a=0;//     .param p10, "page"    # I
a=0;//     .param p11, "offset"    # Z
a=0;//     .param p12, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 449
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "lat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 450
a=0;//     const-string v1, "long"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 451
a=0;//     const-string v1, "range"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 452
a=0;//     const-string v1, "starttime"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 453
a=0;//     const-string v1, "endtime"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 454
a=0;//     const-string v1, "sort"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$SORT3;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 455
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p9}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 456
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p10}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 457
a=0;//     if-eqz p11, :cond_0
a=0;// 
a=0;//     .line 458
a=0;//     const-string v1, "offset"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 462
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/nearby/photos.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p12}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 463
a=0;//     return-void
a=0;// 
a=0;//     .line 460
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "offset"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public nearbyPois(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "lat"    # Ljava/lang/String;
a=0;//     .param p2, "lon"    # Ljava/lang/String;
a=0;//     .param p3, "range"    # I
a=0;//     .param p4, "q"    # Ljava/lang/String;
a=0;//     .param p5, "category"    # Ljava/lang/String;
a=0;//     .param p6, "count"    # I
a=0;//     .param p7, "page"    # I
a=0;//     .param p8, "offset"    # Z
a=0;//     .param p9, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 384
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "lat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 385
a=0;//     const-string v1, "long"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 386
a=0;//     const-string v1, "range"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 387
a=0;//     const-string v1, "q"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 388
a=0;//     const-string v1, "category"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 389
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 390
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 391
a=0;//     if-eqz p8, :cond_0
a=0;// 
a=0;//     .line 392
a=0;//     const-string v1, "offset"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 396
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/nearby/pois.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p9}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 397
a=0;//     return-void
a=0;// 
a=0;//     .line 394
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "offset"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public nearbyTimeline(Ljava/lang/String;Ljava/lang/String;IJJLcom/weibo/sdk/android/api/WeiboAPI$SORT3;IIZZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 4
a=0;//     .param p1, "lat"    # Ljava/lang/String;
a=0;//     .param p2, "lon"    # Ljava/lang/String;
a=0;//     .param p3, "range"    # I
a=0;//     .param p4, "starttime"    # J
a=0;//     .param p6, "endtime"    # J
a=0;//     .param p8, "sort"    # Lcom/weibo/sdk/android/api/WeiboAPI$SORT3;
a=0;//     .param p9, "count"    # I
a=0;//     .param p10, "page"    # I
a=0;//     .param p11, "base_app"    # Z
a=0;//     .param p12, "offset"    # Z
a=0;//     .param p13, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v1}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v2, "lat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     const-string v2, "long"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     const-string v2, "range"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 120
a=0;//     const-string v2, "starttime"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 121
a=0;//     const-string v2, "endtime"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p6, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 122
a=0;//     const-string v2, "sort"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$SORT3;->ordinal()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 123
a=0;//     const-string v2, "count"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p9}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 124
a=0;//     const-string v2, "page"
a=0;// 
a=0;//     invoke-virtual {v1, v2, p10}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 125
a=0;//     if-eqz p11, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     const-string v2, "base_app"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 130
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     if-eqz p12, :cond_1
a=0;// 
a=0;//     .line 131
a=0;//     const-string v2, "offset"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 135
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     const-string v2, "https://api.weibo.com/2/place/nearby_timeline.json"
a=0;// 
a=0;//     const-string v3, "GET"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p13
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/net/RequestListener;);
a=0;//     invoke-virtual {p0, v2, v1, v3, v0}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// 
a=0;//     .line 128
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     const-string v2, "base_app"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     const-string v2, "offset"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public nearbyUsers(Ljava/lang/String;Ljava/lang/String;IJJLcom/weibo/sdk/android/api/WeiboAPI$SORT3;IIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "lat"    # Ljava/lang/String;
a=0;//     .param p2, "lon"    # Ljava/lang/String;
a=0;//     .param p3, "range"    # I
a=0;//     .param p4, "starttime"    # J
a=0;//     .param p6, "endtime"    # J
a=0;//     .param p8, "sort"    # Lcom/weibo/sdk/android/api/WeiboAPI$SORT3;
a=0;//     .param p9, "count"    # I
a=0;//     .param p10, "page"    # I
a=0;//     .param p11, "offset"    # Z
a=0;//     .param p12, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 416
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "lat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 417
a=0;//     const-string v1, "long"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 418
a=0;//     const-string v1, "range"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 419
a=0;//     const-string v1, "starttime"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 420
a=0;//     const-string v1, "endtime"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 421
a=0;//     const-string v1, "sort"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$SORT3;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 422
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p9}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 423
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p10}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 424
a=0;//     if-eqz p11, :cond_0
a=0;// 
a=0;//     .line 425
a=0;//     const-string v1, "offset"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 429
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/nearby/users.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p12}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 430
a=0;//     return-void
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "offset"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poiTimeline(Ljava/lang/String;JJIIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "since_id"    # J
a=0;//     .param p4, "max_id"    # J
a=0;//     .param p6, "count"    # I
a=0;//     .param p7, "page"    # I
a=0;//     .param p8, "base_app"    # Z
a=0;//     .param p9, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "poiid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 87
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 88
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 89
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 90
a=0;//     if-eqz p8, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 95
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/poi_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p9}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisAddCheckin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "status"    # Ljava/lang/String;
a=0;//     .param p3, "pic"    # Ljava/lang/String;
a=0;//     .param p4, "isPublic"    # Z
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 477
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "poiid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 478
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 479
a=0;//     const-string v1, "pic"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 480
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 481
a=0;//     const-string v1, "public"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 485
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/add_checkin.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 487
a=0;//     return-void
a=0;// 
a=0;//     .line 483
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "public"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisAddPhoto(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "status"    # Ljava/lang/String;
a=0;//     .param p3, "pic"    # Ljava/lang/String;
a=0;//     .param p4, "isPublic"    # Z
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 501
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "poiid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 502
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 503
a=0;//     const-string v1, "pic"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 504
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 505
a=0;//     const-string v1, "public"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 509
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/add_photo.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 510
a=0;//     return-void
a=0;// 
a=0;//     .line 507
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "public"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisAddTip(Ljava/lang/String;Ljava/lang/String;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "status"    # Ljava/lang/String;
a=0;//     .param p3, "isPublic"    # Z
a=0;//     .param p4, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 523
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "poiid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 524
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 525
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 526
a=0;//     const-string v1, "public"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 530
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/add_tip.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p4}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 531
a=0;//     return-void
a=0;// 
a=0;//     .line 528
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "public"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisCategory(IZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "pid"    # I
a=0;//     .param p2, "returnALL"    # Z
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 358
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 359
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "pid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 360
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 361
a=0;//     const-string v1, "flag"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 365
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/category.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 366
a=0;//     return-void
a=0;// 
a=0;//     .line 363
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "flag"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisPhotos(Ljava/lang/String;IILcom/weibo/sdk/android/api/WeiboAPI$SORT2;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "page"    # I
a=0;//     .param p4, "sort"    # Lcom/weibo/sdk/android/api/WeiboAPI$SORT2;
a=0;//     .param p5, "base_app"    # Z
a=0;//     .param p6, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 291
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 292
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 293
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 294
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 295
a=0;//     const-string v1, "sort"
a=0;// 
a=0;//     invoke-virtual {p4}, Lcom/weibo/sdk/android/api/WeiboAPI$SORT2;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 296
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 301
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/photos.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p6}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 302
a=0;//     return-void
a=0;// 
a=0;//     .line 299
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisSearch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "keyword"    # Ljava/lang/String;
a=0;//     .param p2, "city"    # Ljava/lang/String;
a=0;//     .param p3, "category"    # Ljava/lang/String;
a=0;//     .param p4, "count"    # I
a=0;//     .param p5, "page"    # I
a=0;//     .param p6, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 342
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "keyword"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 343
a=0;//     const-string v1, "city"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 344
a=0;//     const-string v1, "category"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 345
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 346
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 347
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/search.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p6}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 348
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public poisShow(Ljava/lang/String;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "base_app"    # Z
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 247
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "poiid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 248
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 249
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 253
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 254
a=0;//     return-void
a=0;// 
a=0;//     .line 251
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisTips(Ljava/lang/String;IILcom/weibo/sdk/android/api/WeiboAPI$SORT2;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "page"    # I
a=0;//     .param p4, "sort"    # Lcom/weibo/sdk/android/api/WeiboAPI$SORT2;
a=0;//     .param p5, "base_app"    # Z
a=0;//     .param p6, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 317
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "poiid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 318
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 319
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 320
a=0;//     const-string v1, "sort"
a=0;// 
a=0;//     invoke-virtual {p4}, Lcom/weibo/sdk/android/api/WeiboAPI$SORT2;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 321
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 326
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/tips.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p6}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 327
a=0;//     return-void
a=0;// 
a=0;//     .line 324
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public poisUsers(Ljava/lang/String;IIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "poiid"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "page"    # I
a=0;//     .param p4, "base_app"    # Z
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "poiid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 269
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 270
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 271
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 272
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 276
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/pois/users.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 277
a=0;//     return-void
a=0;// 
a=0;//     .line 274
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public statusesShow(JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # J
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 147
a=0;//     const-string v1, "https://api.weibo.com/2/place/statuses/show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public userTimeline(JJJIIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "since_id"    # J
a=0;//     .param p5, "max_id"    # J
a=0;//     .param p7, "count"    # I
a=0;//     .param p8, "page"    # I
a=0;//     .param p9, "base_app"    # Z
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 59
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 60
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 61
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 62
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 63
a=0;//     if-eqz p9, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/user_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public usersCheckins(JIIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "count"    # I
a=0;//     .param p4, "page"    # I
a=0;//     .param p5, "base_app"    # Z
a=0;//     .param p6, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 181
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 182
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 183
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 188
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/users/checkins.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p6}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public usersPhotos(JIIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "count"    # I
a=0;//     .param p4, "page"    # I
a=0;//     .param p5, "base_app"    # Z
a=0;//     .param p6, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 204
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 205
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 206
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 207
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 211
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/users/photos.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p6}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// 
a=0;//     .line 209
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public usersShow(JZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "base_app"    # Z
a=0;//     .param p4, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 160
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/users/show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p4}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public usersTips(JIIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "count"    # I
a=0;//     .param p4, "page"    # I
a=0;//     .param p5, "base_app"    # Z
a=0;//     .param p6, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 226
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 227
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 228
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 229
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 234
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/place/users/tips.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p6}, Lcom/weibo/sdk/android/api/PlaceAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 235
a=0;//     return-void
a=0;// 
a=0;//     .line 232
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
