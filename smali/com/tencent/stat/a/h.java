package com.tencent.stat.a; class h { void a() { int a;
a=0;// .class public Lcom/tencent/stat/a/h;
a=0;// .super Lcom/tencent/stat/a/e;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static l:Ljava/lang/String;
a=0;// 
a=0;// .field private static m:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/tencent/stat/a/h;->l:Ljava/lang/String;
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/a/h;->m:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;ILcom/tencent/stat/StatAppMonitor;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/stat/a/e;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/a/h;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     invoke-virtual {p3}, Lcom/tencent/stat/StatAppMonitor;->clone()Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Lcom/tencent/stat/a/f;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/a/f;->f:Lcom/tencent/stat/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lorg/json/JSONObject;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/tencent/stat/StatAppMonitor;);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "na"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/StatAppMonitor;->getInterfaceName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "rq"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/StatAppMonitor;->getReqSize()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "rp"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/StatAppMonitor;->getRespSize()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "rt"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/StatAppMonitor;->getResultType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "tm"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/StatAppMonitor;->getMillisecondsConsume()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "rc"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/StatAppMonitor;->getReturnCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "sp"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->a:Lcom/tencent/stat/StatAppMonitor;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/StatAppMonitor;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/stat/StatAppMonitor;->getSampling()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/a/h;->m:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/a/h;->k:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->r(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/a/h;->m:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v0, "av"
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/a/h;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/a/h;->l:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/a/h;->k:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->m(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/a/h;->l:Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v0, "op"
a=0;// 
a=0;//     sget-object v1, Lcom/tencent/stat/a/h;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "cn"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/h;->k:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/stat/common/k;->p(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
}}
