package com.tencent.a.b; class l { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/l;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcom/tencent/a/b/l;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/tencent/a/b/l;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcom/tencent/a/b/l;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     sget-object v0, Lcom/tencent/a/b/l;->b:Lcom/tencent/a/b/l;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/l;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 21
a=0;//     new-instance v0, Lcom/tencent/a/b/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/a/b/l;);
a=0;//     invoke-direct {v0}, Lcom/tencent/a/b/l;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/l;);
a=0;//     sput-object v0, Lcom/tencent/a/b/l;->b:Lcom/tencent/a/b/l;
a=0;// 
a=0;//     .line 23
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/tencent/a/b/l;->b:Lcom/tencent/a/b/l;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static b()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->a()Lcom/tencent/a/b/l;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/l;);
a=0;//     iget-object v0, v0, Lcom/tencent/a/b/l;->a:Landroid/content/Context;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static c()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 81
a=0;//     :try_start_0
a=0;//     #v1=(One);
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->a()Lcom/tencent/a/b/l;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/l;);
a=0;//     iget-object v0, v0, Lcom/tencent/a/b/l;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 82
a=0;//     const-string v2, "connectivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 81
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcom/tencent/a/b/l;->a()Lcom/tencent/a/b/l;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/a/b/l;);
a=0;//     iget-object v0, v0, Lcom/tencent/a/b/l;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 123
a=0;//     const-string v1, "connectivity"
a=0;// 
a=0;//     .line 122
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 124
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/l;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/l;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
