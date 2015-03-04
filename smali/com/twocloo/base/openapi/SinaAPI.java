package com.twocloo.base.openapi; class SinaAPI { void a() { int a;
a=0;// .class public Lcom/twocloo/base/openapi/SinaAPI;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SinaAPI.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private ctx:Landroid/content/Context;
a=0;// 
a=0;// .field private mWeibo:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "ctx"    # Landroid/content/Context;
a=0;//     .param p2, "appKey"    # Ljava/lang/String;
a=0;//     .param p3, "redirectUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/SinaAPI;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     .line 30
a=0;//     invoke-static {p2, p3}, Lcom/weibo/sdk/android/Weibo;->getInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/Weibo;);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/openapi/SinaAPI;->mWeibo:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     .line 31
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/base/openapi/SinaAPI;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/SinaAPI;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/base/openapi/SinaAPI;
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "appKey"    # Ljava/lang/String;
a=0;//     .param p2, "redirectUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     new-instance v0, Lcom/twocloo/base/openapi/SinaAPI;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/base/openapi/SinaAPI;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isSessionValid(Landroid/app/Activity;)Z
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/keep/AccessTokenKeeper;->readAccessToken(Landroid/content/Context;)Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 144
a=0;//     .local v0, "token":Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     invoke-virtual {v0}, Lcom/weibo/sdk/android/Oauth2AccessToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addFriend(JLjava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 8
a=0;//     .param p1, "uid"    # J
a=0;//     .param p3, "name"    # Ljava/lang/String;
a=0;//     .param p4, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/SinaAPI;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/keep/AccessTokenKeeper;->readAccessToken(Landroid/content/Context;)Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 120
a=0;//     .local v7, "token":Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;//     #v7=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     invoke-virtual {v7}, Lcom/weibo/sdk/android/Oauth2AccessToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v6, Lcom/weibo/sdk/android/api/FriendshipsAPI;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/weibo/sdk/android/api/FriendshipsAPI;);
a=0;//     invoke-direct {v6, v7}, Lcom/weibo/sdk/android/api/FriendshipsAPI;-><init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v6, "friendshipsAPI":Lcom/weibo/sdk/android/api/FriendshipsAPI;
a=0;//     #v6=(Reference,Lcom/weibo/sdk/android/api/FriendshipsAPI;);
a=0;//     invoke-virtual {v6, p1, p2, p3, p4}, Lcom/weibo/sdk/android/api/FriendshipsAPI;->create(JLjava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 134
a=0;//     .end local v6    # "friendshipsAPI":Lcom/weibo/sdk/android/api/FriendshipsAPI;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Lcom/twocloo/base/openapi/SinaAPI$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/openapi/SinaAPI$3;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/openapi/SinaAPI;);
a=0;//     move-wide v2, p1
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Lcom/weibo/sdk/android/net/RequestListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/base/openapi/SinaAPI$3;-><init>(Lcom/twocloo/base/openapi/SinaAPI;JLjava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/openapi/SinaAPI$3;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/base/openapi/SinaAPI;->login(Lcom/twocloo/base/openapi/LoginListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public login(Lcom/twocloo/base/openapi/LoginListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "loginListener"    # Lcom/twocloo/base/openapi/LoginListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/SinaAPI;->mWeibo:Lcom/weibo/sdk/android/Weibo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/Weibo;);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/openapi/SinaAPI;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v2, Lcom/twocloo/base/openapi/SinaAPI$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/openapi/SinaAPI$1;);
a=0;//     invoke-direct {v2, p0, p1}, Lcom/twocloo/base/openapi/SinaAPI$1;-><init>(Lcom/twocloo/base/openapi/SinaAPI;Lcom/twocloo/base/openapi/LoginListener;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/openapi/SinaAPI$1;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/Weibo;->authorize(Landroid/content/Context;Lcom/weibo/sdk/android/WeiboAuthListener;)V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public share(Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)Z
a=0;//     .locals 7
a=0;//     .param p1, "content"    # Ljava/lang/String;
a=0;//     .param p2, "imageUrl"    # Ljava/lang/String;
a=0;//     .param p3, "requestListener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v1, p0, Lcom/twocloo/base/openapi/SinaAPI;->ctx:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/weibo/sdk/android/keep/AccessTokenKeeper;->readAccessToken(Landroid/content/Context;)Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 85
a=0;//     .local v6, "token":Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;//     #v6=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     invoke-virtual {v6}, Lcom/weibo/sdk/android/Oauth2AccessToken;->isSessionValid()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Lcom/weibo/sdk/android/api/StatusesAPI;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/api/StatusesAPI;);
a=0;//     invoke-direct {v0, v6}, Lcom/weibo/sdk/android/api/StatusesAPI;-><init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "statusesApi":Lcom/weibo/sdk/android/api/StatusesAPI;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/api/StatusesAPI;);
a=0;//     invoke-static {p2}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 89
a=0;//     const-string v3, "0.0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "0.0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Lcom/weibo/sdk/android/net/RequestListener;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/weibo/sdk/android/api/StatusesAPI;->uploadUrlText(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 94
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 106
a=0;//     .end local v0    # "statusesApi":Lcom/weibo/sdk/android/api/StatusesAPI;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 91
a=0;//     .restart local v0    # "statusesApi":Lcom/weibo/sdk/android/api/StatusesAPI;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/api/StatusesAPI;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v1, "0.0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "0.0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1, v1, v2, p3}, Lcom/weibo/sdk/android/api/StatusesAPI;->update(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     .end local v0    # "statusesApi":Lcom/weibo/sdk/android/api/StatusesAPI;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/base/openapi/SinaAPI$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/base/openapi/SinaAPI$2;);
a=0;//     invoke-direct {v1, p0, p1, p2, p3}, Lcom/twocloo/base/openapi/SinaAPI$2;-><init>(Lcom/twocloo/base/openapi/SinaAPI;Ljava/lang/String;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/openapi/SinaAPI$2;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/base/openapi/SinaAPI;->login(Lcom/twocloo/base/openapi/LoginListener;)V
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
