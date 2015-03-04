package com.weibo.sdk.android; class Oauth2AccessToken { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Oauth2AccessToken.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAccessToken:Ljava/lang/String;
a=0;// 
a=0;// .field private mExpiresTime:J
a=0;// 
a=0;// .field private mRefreshToken:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 15
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mRefreshToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 16
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "responsetext"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 15
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iput-object v1, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mRefreshToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 16
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     .line 32
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     const-string v1, "{"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     :try_start_0
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "json":Lorg/json/JSONObject;
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "access_token"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "expires_in"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setExpiresIn(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 38
a=0;//     const-string v1, "refresh_token"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setRefreshToken(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 44
a=0;//     .end local v0    # "json":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 39
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "accessToken"    # Ljava/lang/String;
a=0;//     .param p2, "expires_in"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/Oauth2AccessToken;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 15
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mRefreshToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 16
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p1, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 52
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long/2addr v2, v4
a=0;// 
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getExpiresTime()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-wide v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getRefreshToken()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mRefreshToken:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getToken()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isSessionValid()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v2, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     .line 59
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setExpiresIn(Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "expiresIn"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     mul-long/2addr v2, v4
a=0;// 
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/weibo/sdk/android/Oauth2AccessToken;->setExpiresTime(J)V
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setExpiresTime(J)V
a=0;//     .locals 0
a=0;//     .param p1, "mExpiresTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iput-wide p1, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mExpiresTime:J
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshToken(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "mRefreshToken"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iput-object p1, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mRefreshToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setToken(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "mToken"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iput-object p1, p0, Lcom/weibo/sdk/android/Oauth2AccessToken;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
}}
