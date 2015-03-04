package com.twocloo.base.openapi; class AlipayAccessTokenKeeper { void a() { int a;
a=0;// .class public Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AlipayAccessTokenKeeper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PREFERENCES_NAME:Ljava/lang/String; = "com.alipay.open"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private accessToken:Ljava/lang/String;
a=0;// 
a=0;// .field private accessTokenExpiresTime:J
a=0;// 
a=0;// .field private refreshToken:Ljava/lang/String;
a=0;// 
a=0;// .field private refreshTokenExpiresTime:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;JLjava/lang/String;J)V
a=0;//     .locals 6
a=0;//     .param p1, "accessToken"    # Ljava/lang/String;
a=0;//     .param p2, "accessTokenExpiresTime"    # J
a=0;//     .param p4, "refreshToken"    # Ljava/lang/String;
a=0;//     .param p5, "refreshTokenExpiresTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     .line 23
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;);
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 26
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     mul-long v2, p2, v4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessTokenExpiresTime:J
a=0;// 
a=0;//     .line 28
a=0;//     iput-object p4, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     mul-long v2, p5, v4
a=0;// 
a=0;//     add-long/2addr v0, v2
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshTokenExpiresTime:J
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static clear(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     const-string v2, "com.alipay.open"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "pref":Landroid/content/SharedPreferences;
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 50
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static keepAccessToken(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "accessToken"    # Ljava/lang/String;
a=0;//     .param p2, "accessTokenExpiresTime"    # Ljava/lang/String;
a=0;//     .param p3, "refreshToken"    # Ljava/lang/String;
a=0;//     .param p4, "refreshTokenExpiresTime"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     const-string v2, "com.alipay.open"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 62
a=0;//     .local v1, "pref":Landroid/content/SharedPreferences;
a=0;//     #v1=(Reference,Landroid/content/SharedPreferences;);
a=0;//     invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "editor":Landroid/content/SharedPreferences$Editor;
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences$Editor;);
a=0;//     const-string v2, "accessToken"
a=0;// 
a=0;//     invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 65
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     const-string v2, "accessTokenExpiresTime"
a=0;// 
a=0;//     invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const-string v2, "refreshToken"
a=0;// 
a=0;//     invoke-interface {v0, v2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 69
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     const-string v2, "refreshTokenExpiresTime"
a=0;// 
a=0;//     invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static readAccessToken(Landroid/content/Context;)Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;
a=0;//     .locals 12
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v10, 0x0
a=0;// 
a=0;//     .line 80
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const-string v8, "com.alipay.open"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const v9, 0x8000
a=0;// 
a=0;//     #v9=(Char);
a=0;//     invoke-virtual {p0, v8, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 82
a=0;//     .local v7, "pref":Landroid/content/SharedPreferences;
a=0;//     #v7=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v8, "accessToken"
a=0;// 
a=0;//     const-string v9, ""
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "accessToken":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "accessTokenExpiresTime"
a=0;// 
a=0;//     invoke-interface {v7, v8, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 84
a=0;//     .local v2, "accessTokenExpiresTime":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-string v8, "refreshToken"
a=0;// 
a=0;//     const-string v9, ""
a=0;// 
a=0;//     invoke-interface {v7, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 85
a=0;//     .local v4, "refreshToken":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "refreshTokenExpiresTime"
a=0;// 
a=0;//     invoke-interface {v7, v8, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 87
a=0;//     .local v5, "refreshTokenExpiresTime":J
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     new-instance v0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;-><init>(Ljava/lang/String;JLjava/lang/String;J)V
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "token":Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;
a=0;//     #v0=(Reference,Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getAccessToken()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAccessTokenExpiresTime()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-wide v0, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessTokenExpiresTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getRefreshToken()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshToken:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRefreshTokenExpiresTime()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-wide v0, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshTokenExpiresTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public isSessionValid()Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 37
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     iget-wide v4, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessTokenExpiresTime:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v4, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     iget-wide v6, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessTokenExpiresTime:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 38
a=0;//     .local v0, "v1":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshToken:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     iget-wide v4, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshTokenExpiresTime:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v4, v4, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     iget-wide v6, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshTokenExpiresTime:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v4, v4, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "v2":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);v5=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .end local v0    # "v1":Z
a=0;//     .end local v1    # "v2":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 37
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "v1":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 38
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v1    # "v2":Z
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 40
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public setAccessToken(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "accessToken"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAccessTokenExpiresTime(J)V
a=0;//     .locals 0
a=0;//     .param p1, "accessTokenExpiresTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iput-wide p1, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->accessTokenExpiresTime:J
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshToken(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "refreshToken"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iput-object p1, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshToken:Ljava/lang/String;
a=0;// 
a=0;//     .line 132
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshTokenExpiresTime(J)V
a=0;//     .locals 0
a=0;//     .param p1, "refreshTokenExpiresTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     iput-wide p1, p0, Lcom/twocloo/base/openapi/AlipayAccessTokenKeeper;->refreshTokenExpiresTime:J
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
}}
