package com.tencent.stat; class NetworkMonitor { void a() { int a;
a=0;// .class public Lcom/tencent/stat/NetworkMonitor;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:J
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/NetworkMonitor;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/stat/NetworkMonitor;->a:J
a=0;// 
a=0;//     iput v2, p0, Lcom/tencent/stat/NetworkMonitor;->b:I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput v2, p0, Lcom/tencent/stat/NetworkMonitor;->d:I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDomain()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMillisecondsConsume()J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lcom/tencent/stat/NetworkMonitor;->a:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getPort()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/NetworkMonitor;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRemoteIp()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getStatusCode()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/NetworkMonitor;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setDomain(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMillisecondsConsume(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-wide p1, p0, Lcom/tencent/stat/NetworkMonitor;->a:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPort(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/tencent/stat/NetworkMonitor;->d:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRemoteIp(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStatusCode(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/tencent/stat/NetworkMonitor;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toJSONObject()Lorg/json/JSONObject;
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "tm"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v2, p0, Lcom/tencent/stat/NetworkMonitor;->a:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "st"
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/stat/NetworkMonitor;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "dm"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/NetworkMonitor;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     const-string v1, "pt"
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/stat/NetworkMonitor;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v1, "rip"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/NetworkMonitor;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const-string v1, "ts"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONException;);
a=0;//     goto :goto_0
a=0;// .end method
}}
