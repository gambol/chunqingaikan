package com.twocloo.com.cn.http; class ReadAheadLoader { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ReadAheadLoader.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;// .field private static final instance:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/http/ReadAheadLoader;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/http/ReadAheadLoader;->instance:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     .line 24
a=0;//     invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/twocloo/com/cn/http/ReadAheadLoader;->WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/http/ReadAheadLoader;Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->read(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/http/ReadAheadLoader;Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->read(Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     sget-object v0, Lcom/twocloo/com/cn/http/ReadAheadLoader;->instance:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private read(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 3
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "textId"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 192
a=0;//     .local v0, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Null);
a=0;//     invoke-static {p2}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 194
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->readSimple(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 197
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/RDBook;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->readForce(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private varargs read(Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "act"    # Landroid/app/Activity;
a=0;//     .param p3, "isVip"    # Z
a=0;//     .param p4, "textId"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Z[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 167
a=0;//     .local v0, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 169
a=0;//     .local v1, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v1=(Null);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     array-length v2, p4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->readSimple(Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private readAsyn(Landroid/app/Activity;Ljava/lang/String;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "textId"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     invoke-static {p2}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     sget-object v0, Lcom/twocloo/com/cn/http/ReadAheadLoader;->WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/ReadAheadLoader$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/ReadAheadLoader$4;);
a=0;//     invoke-direct {v1, p0, p1, p2, p3}, Lcom/twocloo/com/cn/http/ReadAheadLoader$4;-><init>(Lcom/twocloo/com/cn/http/ReadAheadLoader;Landroid/app/Activity;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader$4;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs readAsyn(Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "act"    # Landroid/app/Activity;
a=0;//     .param p3, "isVip"    # Z
a=0;//     .param p4, "textId"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     array-length v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     sget-object v6, Lcom/twocloo/com/cn/http/ReadAheadLoader;->WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/ReadAheadLoader$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/ReadAheadLoader$2;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Activity;);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/com/cn/http/ReadAheadLoader$2;-><init>(Lcom/twocloo/com/cn/http/ReadAheadLoader;Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader$2;);
a=0;//     invoke-interface {v6, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private readForce(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "textId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 246
a=0;//     .local v0, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, p2}, Lcom/twocloo/com/cn/http/HttpImpl;->prepareVipText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 248
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private readSimple(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "textId"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 229
a=0;//     .local v0, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Null);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 230
a=0;//     invoke-static {p1, p2}, Lcom/twocloo/com/cn/http/HttpImpl;->downVipText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 235
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, p2}, Lcom/twocloo/com/cn/http/HttpImpl;->downText(Landroid/app/Activity;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private varargs readSimple(Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 2
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "act"    # Landroid/app/Activity;
a=0;//     .param p3, "isVip"    # Z
a=0;//     .param p4, "textId"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Z[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 211
a=0;//     .local v0, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 212
a=0;//     .local v1, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v1=(Null);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static {p1, p2, p4}, Lcom/twocloo/com/cn/http/HttpImpl;->downVipTexts(Ljava/lang/String;Landroid/app/Activity;[Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private readSync(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 6
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "textId"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 81
a=0;//     .local v3, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/http/ReadAheadLoader;->WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/http/ReadAheadLoader$1;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/http/ReadAheadLoader$1;);
a=0;//     invoke-direct {v5, p0, p1, p2, p3}, Lcom/twocloo/com/cn/http/ReadAheadLoader$1;-><init>(Lcom/twocloo/com/cn/http/ReadAheadLoader;Landroid/app/Activity;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader$1;);
a=0;//     invoke-interface {v4, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 89
a=0;//     .local v2, "future":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     #v2=(Reference,Ljava/util/concurrent/Future;);
a=0;//     invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object v0, v4
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-object v3, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 94
a=0;//     .end local v2    # "future":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v5=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 90
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v3=(Null);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 91
a=0;//     .local v1, "e":Ljava/lang/Throwable;
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private varargs readSync(Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 12
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "act"    # Landroid/app/Activity;
a=0;//     .param p3, "isVip"    # Z
a=0;//     .param p4, "textId"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/app/Activity;",
a=0;//             "Z[",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     new-instance v9, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 121
a=0;//     .local v9, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 125
a=0;//     .local v10, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :try_start_0
a=0;//     #v10=(Null);
a=0;//     sget-object v11, Lcom/twocloo/com/cn/http/ReadAheadLoader;->WORKER:Ljava/util/concurrent/ExecutorService;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/concurrent/ExecutorService;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/ReadAheadLoader$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/ReadAheadLoader$3;);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     move-object/from16 v6, p4
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     invoke-direct/range {v1 .. v6}, Lcom/twocloo/com/cn/http/ReadAheadLoader$3;-><init>(Lcom/twocloo/com/cn/http/ReadAheadLoader;Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader$3;);
a=0;//     invoke-interface {v11, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 133
a=0;//     .local v8, "future":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;>;"
a=0;//     #v8=(Reference,Ljava/util/concurrent/Future;);
a=0;//     invoke-interface {v8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/List;
a=0;// 
a=0;//     move-object v9, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 139
a=0;//     .end local v8    # "future":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Conflicted);
a=0;//     return-object v9
a=0;// 
a=0;//     .line 135
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v7=(Uninit);
a=0;//     move-exception v7
a=0;// 
a=0;//     .line 136
a=0;//     .local v7, "e":Ljava/lang/Throwable;
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v7}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public execute(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;//     .param p2, "textId"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->readSync(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "rdBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public execute(Lcom/twocloo/com/cn/threads/GetTextThread;Ljava/lang/String;Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 5
a=0;//     .param p1, "gt"    # Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;//     .param p2, "articid"    # Ljava/lang/String;
a=0;//     .param p3, "readbook"    # Lcom/twocloo/com/cn/activitys/Readbook;
a=0;//     .param p4, "currentTextId"    # Ljava/lang/String;
a=0;//     .param p5, "isVip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p4, v3, v4
a=0;// 
a=0;//     invoke-direct {p0, p2, p3, p5, v3}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->readSync(Ljava/lang/String;Landroid/app/Activity;Z[Ljava/lang/String;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 36
a=0;//     .local v1, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 38
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {p1, v0}, Lcom/twocloo/com/cn/threads/GetTextThread;->setRdBook(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     .line 52
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 38
a=0;//     .restart local v0    # "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_1
a=0;//     #v0=(Null);v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .line 39
a=0;//     .local v2, "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 41
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .end local v2    # "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Conflicted);v4=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
