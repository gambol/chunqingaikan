package com.twocloo.com.cn.threads; class GetTextThread { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "GetTextThread.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private articid:Ljava/lang/String;
a=0;// 
a=0;// .field private autoOrder:Z
a=0;// 
a=0;// .field public code:I
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field public isVip:I
a=0;// 
a=0;// .field private mulu:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;// .field private readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;// .field private readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;// .field public tid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->getInstance()Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/threads/GetTextThread;->readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "textid"    # Ljava/lang/String;
a=0;//     .param p3, "code1"    # I
a=0;//     .param p4, "vip"    # I
a=0;//     .param p5, "readbook"    # Lcom/twocloo/com/cn/activitys/Readbook;
a=0;//     .param p6, "handler"    # Landroid/os/Handler;
a=0;//     .param p7, "autoOrder"    # Z
a=0;//     .param p8, "readBookShareListener"    # Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 54
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 55
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->articid:Ljava/lang/String;
a=0;// 
a=0;//     .line 56
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 57
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->code:I
a=0;// 
a=0;//     .line 59
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->isVip:I
a=0;// 
a=0;//     .line 60
a=0;//     iput-boolean p7, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->autoOrder:Z
a=0;// 
a=0;//     .line 61
a=0;//     iput-object p8, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     .line 62
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;Ljava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "textid"    # Ljava/lang/String;
a=0;//     .param p3, "code1"    # I
a=0;//     .param p4, "vip"    # I
a=0;//     .param p5, "readbook"    # Lcom/twocloo/com/cn/activitys/Readbook;
a=0;//     .param p6, "handler"    # Landroid/os/Handler;
a=0;//     .param p7, "autoOrder"    # Z
a=0;//     .param p8, "readBookShareListener"    # Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             "II",
a=0;//             "Lcom/twocloo/com/cn/activitys/Readbook;",
a=0;//             "Landroid/os/Handler;",
a=0;//             "Z",
a=0;//             "Lcom/twocloo/com/cn/common/ReadBookShareListener;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     .local p9, "mulu":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->articid:Ljava/lang/String;
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 69
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     iput p3, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->code:I
a=0;// 
a=0;//     .line 71
a=0;//     iput p4, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->isVip:I
a=0;// 
a=0;//     .line 72
a=0;//     iput-boolean p7, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->autoOrder:Z
a=0;// 
a=0;//     .line 73
a=0;//     iput-object p8, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     .line 74
a=0;//     iput-object p9, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->mulu:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/threads/GetTextThread;)Lcom/twocloo/com/cn/activitys/Readbook;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private cacheToDisk()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Constants;->getCacheFilePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     .local v0, "cacheFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/threads/GetTextThread;->getRdBook()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     if-nez v10, :cond_1
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     new-instance v11, Lcom/twocloo/com/cn/threads/GetTextThread$2;
a=0;// 
a=0;//     #v11=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread$2;);
a=0;//     invoke-direct {v11, p0}, Lcom/twocloo/com/cn/threads/GetTextThread$2;-><init>(Lcom/twocloo/com/cn/threads/GetTextThread;)V
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread$2;);
a=0;//     invoke-virtual {v10, v11}, Lcom/twocloo/com/cn/activitys/Readbook;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v11, 0xd
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v10, v11}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 218
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     .line 219
a=0;//     .local v8, "update_time":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->mulu:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v10, :cond_2
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iput-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->mulu:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 221
a=0;//     :cond_2
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->mulu:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_6
a=0;// 
a=0;//     .line 226
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "_"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "_"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, ".txt"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 227
a=0;//     .local v6, "path":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "/"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v1, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 228
a=0;//     .local v1, "dirfile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_4
a=0;// 
a=0;//     .line 229
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 231
a=0;//     :cond_4
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "/"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-direct {v3, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 232
a=0;//     .local v3, "file":Ljava/io/File;
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v10, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->setFile(Ljava/io/File;)V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_5
a=0;//     sget-object v10, Lcom/twocloo/com/cn/common/HCData;->bookMap:Ljava/util/Hashtable;
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v10, v11, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 237
a=0;//     :try_start_0
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_7
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v10=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     iget v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->code:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 250
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 251
a=0;//     .local v2, "e2":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v10, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 253
a=0;//     .end local v2    # "e2":Ljava/lang/Exception;
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v10, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     iget v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->code:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     .end local v1    # "dirfile":Ljava/io/File;
a=0;//     .end local v3    # "file":Ljava/io/File;
a=0;//     .end local v6    # "path":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v11=(Boolean);v12=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 222
a=0;//     .local v5, "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     iget-object v12, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_3
a=0;// 
a=0;//     .line 223
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getUpdate_time()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 243
a=0;//     .end local v5    # "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .restart local v1    # "dirfile":Ljava/io/File;
a=0;//     .restart local v3    # "file":Ljava/io/File;
a=0;//     .restart local v6    # "path":Ljava/lang/String;
a=0;//     :cond_7
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/File;);v3=(Reference,Ljava/io/File;);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);v10=(Boolean);v11=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 244
a=0;//     .local v7, "title":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 245
a=0;//     .local v4, "fos":Ljava/io/FileOutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     new-instance v9, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-direct {v9, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 246
a=0;//     .local v9, "writer":Ljava/io/DataOutputStream;
a=0;//     #v9=(Reference,Ljava/io/DataOutputStream;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v11, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/RDBook;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, "utf-8"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     .line 247
a=0;//     invoke-virtual {v9}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {v9}, Ljava/io/DataOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private loadCurrentChapter()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0x15
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 119
a=0;//     #v5=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 120
a=0;//     .local v6, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v6=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->isVip:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/threads/GetTextThread;->readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->execute(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->setRd(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/threads/GetTextThread;->setRdBook(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->setAId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getTextTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/common/ReadBookShareListener;->setChapterName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 164
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 166
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 197
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 124
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 125
a=0;//     .local v7, "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->articid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/activitys/Readbook;->setRd(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     .line 144
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 135
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v8=(Uninit);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     sget-object v0, Lcom/twocloo/com/cn/threads/GetTextThread;->readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->articid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->execute(Lcom/twocloo/com/cn/threads/GetTextThread;Ljava/lang/String;Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcom/twocloo/com/cn/activitys/Readbook;->setRd(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 155
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/threads/GetTextThread;->setRdBook(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     .end local v7    # "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/RDBook;->getOrderMsg()Lcom/twocloo/com/cn/beans/OrderMsg;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 173
a=0;//     iget-boolean v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->autoOrder:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 177
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v0, v9}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 180
a=0;//     :cond_7
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     .line 181
a=0;//     const-string v0, "2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->isVip:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v5, :cond_9
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/16 v1, 0x29
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 196
a=0;//     :cond_8
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/threads/GetTextThread;->cacheToDisk()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 184
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/GetTextThread$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/threads/GetTextThread$1;-><init>(Lcom/twocloo/com/cn/threads/GetTextThread;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread$1;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/activitys/Readbook;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private loadNextChapter()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 92
a=0;//     .local v6, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v6=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v0, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 113
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 98
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->isVip:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 100
a=0;//     sget-object v0, Lcom/twocloo/com/cn/threads/GetTextThread;->readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->execute(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/threads/GetTextThread;->setRdBook(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     .line 112
a=0;//     :goto_1
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/threads/GetTextThread;->cacheToDisk()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 102
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     .local v7, "rb":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->articid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     sget-object v0, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     sget-object v0, Lcom/twocloo/com/cn/threads/GetTextThread;->readAheadLoader:Lcom/twocloo/com/cn/http/ReadAheadLoader;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/ReadAheadLoader;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->articid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->readbook:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->tid:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Lcom/twocloo/com/cn/http/ReadAheadLoader;->execute(Lcom/twocloo/com/cn/threads/GetTextThread;Ljava/lang/String;Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;Z)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/threads/GetTextThread;->setRdBook(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getRdBook()Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/threads/GetTextThread;->loadCurrentChapter()V
a=0;// 
a=0;//     .line 85
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/threads/GetTextThread;->loadNextChapter()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setRdBook(Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;//     .locals 0
a=0;//     .param p1, "rdBook"    # Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/threads/GetTextThread;->rdBook:Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     .line 272
a=0;//     return-void
a=0;// .end method
}}
