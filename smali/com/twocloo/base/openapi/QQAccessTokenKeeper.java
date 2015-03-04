package com.twocloo.base.openapi; class QQAccessTokenKeeper { void a() { int a;
a=0;// .class public Lcom/twocloo/base/openapi/QQAccessTokenKeeper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "QQAccessTokenKeeper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PREFERENCES_NAME:Ljava/lang/String; = "com.tencent.open"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAccessToken:Ljava/lang/String;
a=0;// 
a=0;// .field private mExpiresTime:J
a=0;// 
a=0;// .field private openId:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .param p1, "mAccessToken"    # Ljava/lang/String;
a=0;//     .param p2, "mExpiresTime"    # Ljava/lang/String;
a=0;//     .param p3, "openId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/twocloo/base/openapi/QQAccessTokenKeeper;);
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 17
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
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
a=0;//     iput-wide v0, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mExpiresTime:J
a=0;// 
a=0;//     .line 18
a=0;//     iput-object p3, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->openId:Ljava/lang/String;
a=0;// 
a=0;//     .line 19
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clear(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     const-string v2, "com.tencent.open"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 45
a=0;//     .local v1, "pref":Landroid/content/SharedPreferences;
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 46
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 47
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static keepAccessToken(Landroid/content/Context;Lcom/twocloo/base/openapi/QQAccessTokenKeeper;)V
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "token"    # Lcom/twocloo/base/openapi/QQAccessTokenKeeper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     const-string v2, "com.tencent.open"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 28
a=0;//     .local v1, "pref":Landroid/content/SharedPreferences;
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v2, "token"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->getmAccessToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 30
a=0;//     const-string v2, "expiresTime"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->getmExpiresTime()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 31
a=0;//     const-string v2, "openId"
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->getOpenId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 32
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static readAccessToken(Landroid/content/Context;)Lcom/twocloo/base/openapi/QQAccessTokenKeeper;
a=0;//     .locals 9
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     const-string v6, "com.tencent.open"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const v7, 0x8000
a=0;// 
a=0;//     #v7=(Char);
a=0;//     invoke-virtual {p0, v6, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 58
a=0;//     .local v4, "pref":Landroid/content/SharedPreferences;
a=0;//     #v4=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v6, "token"
a=0;// 
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "accessToken":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "expiresTime"
a=0;// 
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-interface {v4, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 60
a=0;//     .local v1, "expiresTime":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-string v6, "openId"
a=0;// 
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 62
a=0;//     .local v3, "openId":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/base/openapi/QQAccessTokenKeeper;);
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v0, v6, v3}, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     .local v5, "token":Lcom/twocloo/base/openapi/QQAccessTokenKeeper;
a=0;//     #v5=(Reference,Lcom/twocloo/base/openapi/QQAccessTokenKeeper;);
a=0;//     return-object v5
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getOpenId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->openId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getmAccessToken()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getmExpiresTime()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-wide v0, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mExpiresTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public isSessionValid()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->openId:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mExpiresTime:J
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
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     iget-wide v2, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mExpiresTime:J
a=0;// 
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
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setOpenId(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "openId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->openId:Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setmAccessToken(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "mAccessToken"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mAccessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setmExpiresTime(J)V
a=0;//     .locals 0
a=0;//     .param p1, "mExpiresTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput-wide p1, p0, Lcom/twocloo/base/openapi/QQAccessTokenKeeper;->mExpiresTime:J
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
}}
