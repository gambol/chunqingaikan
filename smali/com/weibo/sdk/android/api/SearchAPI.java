package com.weibo.sdk.android.api; class SearchAPI { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/api/SearchAPI;
a=0;// .super Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .source "SearchAPI.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SERVER_URL_PRIX:Ljava/lang/String; = "https://api.weibo.com/2/search"
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
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/SearchAPI;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public apps(Ljava/lang/String;ILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "q"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "q"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 90
a=0;//     const-string v1, "https://api.weibo.com/2/search/suggestions/apps.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/SearchAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public atUsers(Ljava/lang/String;ILcom/weibo/sdk/android/api/WeiboAPI$FRIEND_TYPE;Lcom/weibo/sdk/android/api/WeiboAPI$RANGE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "q"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "type"    # Lcom/weibo/sdk/android/api/WeiboAPI$FRIEND_TYPE;
a=0;//     .param p4, "range"    # Lcom/weibo/sdk/android/api/WeiboAPI$RANGE;
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 105
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "q"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 106
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 107
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/weibo/sdk/android/api/WeiboAPI$FRIEND_TYPE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 108
a=0;//     const-string v1, "range"
a=0;// 
a=0;//     invoke-virtual {p4}, Lcom/weibo/sdk/android/api/WeiboAPI$RANGE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 109
a=0;//     const-string v1, "https://api.weibo.com/2/search/suggestions/at_users.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/SearchAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public companies(Ljava/lang/String;ILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "q"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 73
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "q"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 75
a=0;//     const-string v1, "https://api.weibo.com/2/search/suggestions/companies.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/SearchAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public schools(Ljava/lang/String;ILcom/weibo/sdk/android/api/WeiboAPI$SCHOOL_TYPE;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "q"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "type"    # Lcom/weibo/sdk/android/api/WeiboAPI$SCHOOL_TYPE;
a=0;//     .param p4, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "q"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 58
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 59
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/weibo/sdk/android/api/WeiboAPI$SCHOOL_TYPE;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 60
a=0;//     const-string v1, "https://api.weibo.com/2/search/suggestions/schools.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p4}, Lcom/weibo/sdk/android/api/SearchAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public statuses(Ljava/lang/String;ILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "q"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "q"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 43
a=0;//     const-string v1, "https://api.weibo.com/2/search/suggestions/statuses.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/SearchAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public users(Ljava/lang/String;ILcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "q"    # Ljava/lang/String;
a=0;//     .param p2, "count"    # I
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
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
a=0;//     const-string v1, "q"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 27
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 28
a=0;//     const-string v1, "https://api.weibo.com/2/search/suggestions/users.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/SearchAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
}}
