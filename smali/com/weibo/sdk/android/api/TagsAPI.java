package com.weibo.sdk.android.api; class TagsAPI { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/api/TagsAPI;
a=0;// .super Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .source "TagsAPI.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SERVER_URL_PRIX:Ljava/lang/String; = "https://api.weibo.com/2/tags"
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
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/TagsAPI;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public create([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "tags"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 67
a=0;//     .local v1, "strb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-lt v3, v4, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 71
a=0;//     const-string v3, "tags"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     const-string v3, "https://api.weibo.com/2/tags/create.json"
a=0;// 
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0, v4, p2}, Lcom/weibo/sdk/android/api/TagsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     aget-object v2, p1, v3
a=0;// 
a=0;//     .line 68
a=0;//     .local v2, "tag":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ","
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 67
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public destroy(JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "tag_id"    # J
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "tag_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 83
a=0;//     const-string v1, "https://api.weibo.com/2/tags/destroy.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/TagsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 84
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public destroyBatch([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "ids"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     new-instance v1, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v1}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     .local v1, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v1=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 94
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
a=0;//     .line 97
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 98
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
a=0;//     .line 99
a=0;//     const-string v3, "https://api.weibo.com/2/tags/destroy_batch.json"
a=0;// 
a=0;//     const-string v4, "POST"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v1, v4, p2}, Lcom/weibo/sdk/android/api/TagsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 100
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     aget-object v0, p1, v3
a=0;// 
a=0;//     .line 95
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
a=0;//     .line 94
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public suggestions(ILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "count"    # I
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 56
a=0;//     const-string v1, "https://api.weibo.com/2/tags/suggestions.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p2}, Lcom/weibo/sdk/android/api/TagsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tags(JIILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "count"    # I
a=0;//     .param p4, "page"    # I
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 27
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 28
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 29
a=0;//     const-string v1, "https://api.weibo.com/2/tags.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/TagsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tagsBatch([Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 7
a=0;//     .param p1, "uids"    # [Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 39
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "strb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v4, p1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-lt v3, v4, :cond_0
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 44
a=0;//     const-string v3, "uids"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     const-string v3, "https://api.weibo.com/2/tags/tags_batch.json"
a=0;// 
a=0;//     const-string v4, "GET"
a=0;// 
a=0;//     invoke-virtual {p0, v3, v0, v4, p2}, Lcom/weibo/sdk/android/api/TagsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     aget-object v2, p1, v3
a=0;// 
a=0;//     .line 41
a=0;//     .local v2, "uid":Ljava/lang/String;
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, ","
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 40
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
