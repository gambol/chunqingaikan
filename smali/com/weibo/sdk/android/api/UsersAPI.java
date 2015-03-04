package com.weibo.sdk.android.api; class UsersAPI { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/api/UsersAPI;
a=0;// .super Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .source "UsersAPI.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SERVER_URL_PRIX:Ljava/lang/String; = "https://api.weibo.com/2/users"
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
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/UsersAPI;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public counts([JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 8
a=0;//     .param p1, "uids"    # [J
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     .local v3, "strb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v4, v5, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 62
a=0;//     const-string v4, "uids"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     const-string v4, "https://api.weibo.com/2/users/counts.json"
a=0;// 
a=0;//     const-string v5, "GET"
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v5, p2}, Lcom/weibo/sdk/android/api/UsersAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// 
a=0;//     .line 58
a=0;//     :cond_0
a=0;//     #v4=(Integer);v5=(Integer);
a=0;//     aget-wide v0, p1, v4
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "cid":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ","
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 58
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public domainShow(Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "domain"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "domain"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 47
a=0;//     const-string v1, "https://api.weibo.com/2/users/domain_show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p2}, Lcom/weibo/sdk/android/api/UsersAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "uid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 25
a=0;//     const-string v1, "https://api.weibo.com/2/users/show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/UsersAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 26
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "screen_name"    # Ljava/lang/String;
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 35
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "screen_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     const-string v1, "https://api.weibo.com/2/users/show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p2}, Lcom/weibo/sdk/android/api/UsersAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
}}
