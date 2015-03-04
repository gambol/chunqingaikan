package com.weibo.sdk.android.api; class StatusesAPI { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/api/StatusesAPI;
a=0;// .super Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .source "StatusesAPI.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SERVER_URL_PRIX:Ljava/lang/String; = "https://api.weibo.com/2/statuses"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;//     .locals 0
a=0;//     .param p1, "accessToken"    # Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0, p1}, Lcom/weibo/sdk/android/api/WeiboAPI;-><init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/StatusesAPI;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bilateralTimeline(JJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "base_app"    # Z
a=0;//     .param p8, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p9, "trim_user"    # Z
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 434
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 435
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 436
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 437
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 438
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 439
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 440
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 444
a=0;//     :goto_0
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 445
a=0;//     if-eqz p9, :cond_1
a=0;// 
a=0;//     .line 446
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 450
a=0;//     :goto_1
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/bilateral_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 452
a=0;//     return-void
a=0;// 
a=0;//     .line 442
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 448
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public count([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "ids"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v1}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 614
a=0;//     .local v1, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 615
a=0;//     .local v2, "strb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-lt v3, v4, :cond_0
a=0;// 
a=0;//     .line 618
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 619
a=0;//     const-string v3, "ids"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 620
a=0;//     const-string v3, "https://api.weibo.com/2/statuses/count.json"
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v1, v4, p2}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 621
a=0;//     return-void
a=0;// 
a=0;//     .line 615
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     aget-object v0, p1, v3
a=0;// 
a=0;//     .line 616
a=0;//     .local v0, "id":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ","
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 615
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public destroy(JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # J
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 647
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 648
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 649
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/destroy.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 650
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public emotions(Lcom/weibo/sdk/android/api/WeiboAPI$EMOTION_TYPE;Lcom/weibo/sdk/android/api/WeiboAPI$LANGUAGE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "type"    # Lcom/weibo/sdk/android/api/WeiboAPI$EMOTION_TYPE;
a=0;//     .param p2, "language"    # Lcom/weibo/sdk/android/api/WeiboAPI$LANGUAGE;
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 726
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 727
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/weibo/sdk/android/api/WeiboAPI$EMOTION_TYPE;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 728
a=0;//     const-string v1, "language"
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/weibo/sdk/android/api/WeiboAPI$LANGUAGE;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 729
a=0;//     const-string v1, "https://api.weibo.com/2/emotions.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 730
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public friendsTimeline(JJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "base_app"    # Z
a=0;//     .param p8, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p9, "trim_user"    # Z
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 57
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 58
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 59
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 60
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 65
a=0;//     :goto_0
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 66
a=0;//     if-eqz p9, :cond_1
a=0;// 
a=0;//     .line 67
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 71
a=0;//     :goto_1
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/friends_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public friendsTimelineIds(JJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "base_app"    # Z
a=0;//     .param p8, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
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
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 86
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 87
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 88
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 89
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 94
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 95
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/friends_timeline/ids.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p9}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// 
a=0;//     .line 92
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
a=0;// .method public homeTimeline(JJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "base_app"    # Z
a=0;//     .param p8, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p9, "trim_user"    # Z
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 113
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 114
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 115
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 116
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 117
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 122
a=0;//     :goto_0
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 123
a=0;//     if-eqz p9, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 128
a=0;//     :goto_1
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/home_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public hotCommentsDaily(IZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "count"    # I
a=0;//     .param p2, "base_app"    # Z
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 576
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 577
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 578
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 579
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 583
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/hot/comments_daily.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 585
a=0;//     return-void
a=0;// 
a=0;//     .line 581
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
a=0;// .method public hotCommentsWeekly(IZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "count"    # I
a=0;//     .param p2, "base_app"    # Z
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 596
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 597
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 598
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 602
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/hot/comments_weekly.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 604
a=0;//     return-void
a=0;// 
a=0;//     .line 600
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
a=0;// .method public hotRepostDaily(IZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "count"    # I
a=0;//     .param p2, "base_app"    # Z
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 540
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 541
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 542
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 546
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/hot/repost_daily.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 547
a=0;//     return-void
a=0;// 
a=0;//     .line 544
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
a=0;// .method public hotRepostWeekly(IZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "count"    # I
a=0;//     .param p2, "base_app"    # Z
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 558
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 559
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 564
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/hot/repost_weekly.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 566
a=0;//     return-void
a=0;// 
a=0;//     .line 562
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
a=0;// .method public mentions(JJIILcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;Lcom/weibo/sdk/android/api/WeiboAPI$TYPE_FILTER;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "filter_by_author"    # Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;
a=0;//     .param p8, "filter_by_source"    # Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;
a=0;//     .param p9, "filter_by_type"    # Lcom/weibo/sdk/android/api/WeiboAPI$TYPE_FILTER;
a=0;//     .param p10, "trim_user"    # Z
a=0;//     .param p11, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 378
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 379
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 380
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 381
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 382
a=0;//     const-string v1, "filter_by_author"
a=0;// 
a=0;//     invoke-virtual {p7}, Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 383
a=0;//     const-string v1, "filter_by_source"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 384
a=0;//     const-string v1, "filter_by_type"
a=0;// 
a=0;//     invoke-virtual {p9}, Lcom/weibo/sdk/android/api/WeiboAPI$TYPE_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 385
a=0;//     if-eqz p10, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 390
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/mentions.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p11}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 391
a=0;//     return-void
a=0;// 
a=0;//     .line 388
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public mentionsIds(JJIILcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;Lcom/weibo/sdk/android/api/WeiboAPI$TYPE_FILTER;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "filter_by_author"    # Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;
a=0;//     .param p8, "filter_by_source"    # Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;
a=0;//     .param p9, "filter_by_type"    # Lcom/weibo/sdk/android/api/WeiboAPI$TYPE_FILTER;
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 408
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 409
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 410
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 411
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 412
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 413
a=0;//     const-string v1, "filter_by_author"
a=0;// 
a=0;//     invoke-virtual {p7}, Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 414
a=0;//     const-string v1, "filter_by_source"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 415
a=0;//     const-string v1, "filter_by_type"
a=0;// 
a=0;//     invoke-virtual {p9}, Lcom/weibo/sdk/android/api/WeiboAPI$TYPE_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 416
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/mentions/ids.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 417
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public publicTimeline(IIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "count"    # I
a=0;//     .param p2, "page"    # I
a=0;//     .param p3, "base_app"    # Z
a=0;//     .param p4, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 32
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 33
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 38
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/public_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p4}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// 
a=0;//     .line 36
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
a=0;// .method public queryID([Ljava/lang/String;Lcom/weibo/sdk/android/api/WeiboAPI$TYPE;ZZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 9
a=0;//     .param p1, "mids"    # [Ljava/lang/String;
a=0;//     .param p2, "type"    # Lcom/weibo/sdk/android/api/WeiboAPI$TYPE;
a=0;//     .param p3, "inbox"    # Z
a=0;//     .param p4, "isBase62"    # Z
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 502
a=0;//     #v4=(Null);
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v1}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 503
a=0;//     .local v1, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 504
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v8, v3, :cond_1
a=0;// 
a=0;//     .line 505
a=0;//     const-string v3, "mid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-object v5, p1, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v3, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 517
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v3, "type"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lcom/weibo/sdk/android/api/WeiboAPI$TYPE;->ordinal()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v1, v3, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 518
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     .line 519
a=0;//     const-string v3, "inbox"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 523
a=0;//     :goto_1
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     .line 524
a=0;//     const-string v3, "isBase62"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 528
a=0;//     :goto_2
a=0;//     const-string v3, "https://api.weibo.com/2/statuses/queryid.json"
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3, v1, v4, p5}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 529
a=0;//     return-void
a=0;// 
a=0;//     .line 507
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Integer);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v3, "is_batch"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 508
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 509
a=0;//     .local v2, "strb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v3=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v3, v5, :cond_2
a=0;// 
a=0;//     .line 512
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 513
a=0;//     const-string v3, "mid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 509
a=0;//     :cond_2
a=0;//     #v3=(Integer);v5=(Integer);
a=0;//     aget-object v0, p1, v3
a=0;// 
a=0;//     .line 510
a=0;//     .local v0, "mid":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, ","
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 509
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 521
a=0;//     .end local v0    # "mid":Ljava/lang/String;
a=0;//     .end local v2    # "strb":Ljava/lang/StringBuilder;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v3, "inbox"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 526
a=0;//     :cond_4
a=0;//     const-string v3, "isBase62"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public queryMID([JLcom/weibo/sdk/android/api/WeiboAPI$TYPE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 8
a=0;//     .param p1, "ids"    # [J
a=0;//     .param p2, "type"    # Lcom/weibo/sdk/android/api/WeiboAPI$TYPE;
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 474
a=0;//     #v4=(Null);
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 475
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     array-length v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v6, v5, :cond_0
a=0;// 
a=0;//     .line 476
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aget-wide v6, p1, v4
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v2, v5, v6, v7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 487
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v4, "type"
a=0;// 
a=0;//     invoke-virtual {p2}, Lcom/weibo/sdk/android/api/WeiboAPI$TYPE;->ordinal()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 488
a=0;//     const-string v4, "https://api.weibo.com/2/statuses/querymid.json"
a=0;// 
a=0;//     const-string v5, "GET"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4, v2, v5, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 489
a=0;//     return-void
a=0;// 
a=0;//     .line 478
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Null);v5=(Integer);v6=(One);v7=(Uninit);
a=0;//     const-string v5, "is_batch"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 479
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 480
a=0;//     .local v3, "strb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v5, p1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v4, v5, :cond_1
a=0;// 
a=0;//     .line 483
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 484
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 480
a=0;//     :cond_1
a=0;//     #v4=(Integer);v5=(Integer);
a=0;//     aget-wide v0, p1, v4
a=0;// 
a=0;//     .line 481
a=0;//     .local v0, "id":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, ","
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 480
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public repost(JLjava/lang/String;Lcom/weibo/sdk/android/api/WeiboAPI$COMMENTS_TYPE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # J
a=0;//     .param p3, "status"    # Ljava/lang/String;
a=0;//     .param p4, "is_comment"    # Lcom/weibo/sdk/android/api/WeiboAPI$COMMENTS_TYPE;
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 633
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 634
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 635
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 636
a=0;//     const-string v1, "is_comment"
a=0;// 
a=0;//     invoke-virtual {p4}, Lcom/weibo/sdk/android/api/WeiboAPI$COMMENTS_TYPE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 637
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/repost.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 638
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public repostByMe(JJIILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 354
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 355
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 356
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 357
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 358
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/repost_by_me.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p7}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 359
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public repostTimeline(JJJIILcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # J
a=0;//     .param p3, "since_id"    # J
a=0;//     .param p5, "max_id"    # J
a=0;//     .param p7, "count"    # I
a=0;//     .param p8, "page"    # I
a=0;//     .param p9, "filter_by_author"    # Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 309
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 310
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 311
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 312
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 313
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 314
a=0;//     const-string v1, "filter_by_author"
a=0;// 
a=0;//     invoke-virtual {p9}, Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 315
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/repost_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 316
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public repostTimelineIds(JJJIILcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # J
a=0;//     .param p3, "since_id"    # J
a=0;//     .param p5, "max_id"    # J
a=0;//     .param p7, "count"    # I
a=0;//     .param p8, "page"    # I
a=0;//     .param p9, "filter_by_author"    # Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 331
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 332
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 333
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 334
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 335
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 336
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 337
a=0;//     const-string v1, "filter_by_author"
a=0;// 
a=0;//     invoke-virtual {p9}, Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 338
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/repost_timeline/ids.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 340
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # J
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 462
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 463
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 464
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public update(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "content"    # Ljava/lang/String;
a=0;//     .param p2, "lat"    # Ljava/lang/String;
a=0;//     .param p3, "lon"    # Ljava/lang/String;
a=0;//     .param p4, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 661
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 662
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 663
a=0;//     invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 664
a=0;//     const-string v1, "long"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 666
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 667
a=0;//     const-string v1, "lat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 669
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/update.json"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p4}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 670
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public upload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "content"    # Ljava/lang/String;
a=0;//     .param p2, "file"    # Ljava/lang/String;
a=0;//     .param p3, "lat"    # Ljava/lang/String;
a=0;//     .param p4, "lon"    # Ljava/lang/String;
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 682
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 683
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 684
a=0;//     const-string v1, "pic"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 685
a=0;//     invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 686
a=0;//     const-string v1, "long"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 688
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 689
a=0;//     const-string v1, "lat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 692
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/upload.json"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 693
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public uploadUrlText(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "status"    # Ljava/lang/String;
a=0;//     .param p2, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p3, "lat"    # Ljava/lang/String;
a=0;//     .param p4, "lon"    # Ljava/lang/String;
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 706
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 707
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 708
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 709
a=0;//     invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 710
a=0;//     const-string v1, "long"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 712
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 713
a=0;//     const-string v1, "lat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 715
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/upload_url_text.json"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 716
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public userTimeline(JJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 5
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "base_app"    # Z
a=0;//     .param p8, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p9, "trim_user"    # Z
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 216
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 217
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 218
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 219
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 220
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 221
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 222
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 226
a=0;//     :goto_0
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 227
a=0;//     if-eqz p9, :cond_1
a=0;// 
a=0;//     .line 228
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 232
a=0;//     :goto_1
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/user_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public userTimeline(JJJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "since_id"    # J
a=0;//     .param p5, "max_id"    # J
a=0;//     .param p7, "count"    # I
a=0;//     .param p8, "page"    # I
a=0;//     .param p9, "base_app"    # Z
a=0;//     .param p10, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p11, "trim_user"    # Z
a=0;//     .param p12, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 147
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 148
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 149
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 150
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 151
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 152
a=0;//     if-eqz p9, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 157
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p10}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 158
a=0;//     if-eqz p11, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 163
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/user_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p12}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 164
a=0;//     return-void
a=0;// 
a=0;//     .line 155
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
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public userTimeline(Ljava/lang/String;JJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;ZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "screen_name"    # Ljava/lang/String;
a=0;//     .param p2, "since_id"    # J
a=0;//     .param p4, "max_id"    # J
a=0;//     .param p6, "count"    # I
a=0;//     .param p7, "page"    # I
a=0;//     .param p8, "base_app"    # Z
a=0;//     .param p9, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p10, "trim_user"    # Z
a=0;//     .param p11, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "screen_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 184
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 185
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 186
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 187
a=0;//     if-eqz p8, :cond_0
a=0;// 
a=0;//     .line 188
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 192
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p9}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 193
a=0;//     if-eqz p10, :cond_1
a=0;// 
a=0;//     .line 194
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 198
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/user_timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p11}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 199
a=0;//     return-void
a=0;// 
a=0;//     .line 190
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
a=0;// 
a=0;//     .line 196
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public userTimelineIds(JJJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "since_id"    # J
a=0;//     .param p5, "max_id"    # J
a=0;//     .param p7, "count"    # I
a=0;//     .param p8, "page"    # I
a=0;//     .param p9, "base_app"    # Z
a=0;//     .param p10, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p11, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 250
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 251
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 252
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 253
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 254
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 255
a=0;//     if-eqz p9, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 260
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p10}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 261
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/user_timeline/ids.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p11}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 263
a=0;//     return-void
a=0;// 
a=0;//     .line 258
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
a=0;// .method public userTimelineIds(Ljava/lang/String;JJIIZLcom/weibo/sdk/android/api/WeiboAPI$FEATURE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "screen_name"    # Ljava/lang/String;
a=0;//     .param p2, "since_id"    # J
a=0;//     .param p4, "max_id"    # J
a=0;//     .param p6, "count"    # I
a=0;//     .param p7, "page"    # I
a=0;//     .param p8, "base_app"    # Z
a=0;//     .param p9, "feature"    # Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 280
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "screen_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 281
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 282
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 283
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 284
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 285
a=0;//     if-eqz p8, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     const-string v1, "base_app"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 290
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "feature"
a=0;// 
a=0;//     invoke-virtual {p9}, Lcom/weibo/sdk/android/api/WeiboAPI$FEATURE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 291
a=0;//     const-string v1, "https://api.weibo.com/2/statuses/user_timeline/ids.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/StatusesAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 293
a=0;//     return-void
a=0;// 
a=0;//     .line 288
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
