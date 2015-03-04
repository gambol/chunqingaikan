package com.tencent.connect.auth; class QQToken { void a() { int a;
a=0;// .class public Lcom/tencent/connect/auth/QQToken;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final AUTH_QQ:I = 0x2
a=0;// 
a=0;// .field public static final AUTH_QZONE:I = 0x3
a=0;// 
a=0;// .field public static final AUTH_WEB:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/lang/String;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 11
a=0;//     #p0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/tencent/connect/auth/QQToken;->d:I
a=0;// 
a=0;//     .line 12
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/connect/auth/QQToken;->e:J
a=0;// 
a=0;//     .line 15
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/QQToken;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 16
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getAccessToken()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQToken;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAppId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQToken;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAuthSource()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget v0, p0, Lcom/tencent/connect/auth/QQToken;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getExpireTimeInSecond()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-wide v0, p0, Lcom/tencent/connect/auth/QQToken;->e:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getOpenId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQToken;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isSessionValid()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lcom/tencent/connect/auth/QQToken;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Lcom/tencent/connect/auth/QQToken;->e:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/NumberFormatException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/QQToken;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/connect/auth/QQToken;->e:J
a=0;// 
a=0;//     .line 38
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 39
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
a=0;//     iput-wide v0, p0, Lcom/tencent/connect/auth/QQToken;->e:J
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAppId(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/QQToken;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 28
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAuthSource(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iput p1, p0, Lcom/tencent/connect/auth/QQToken;->d:I
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOpenId(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput-object p1, p0, Lcom/tencent/connect/auth/QQToken;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
}}
