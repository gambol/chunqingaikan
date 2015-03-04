package com.twocloo.com.cn.activitys; class ReadbookDown { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// .super Lcom/twocloo/com/cn/activitys/BaseReadBook;
a=0;// .source "ReadbookDown.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private beg:I
a=0;// 
a=0;// .field private bookFile:Ljava/lang/String;
a=0;// 
a=0;// .field private curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;// .field private dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private file:Ljava/io/File;
a=0;// 
a=0;// .field private finishFlag:I
a=0;// 
a=0;// .field private isV:I
a=0;// 
a=0;// .field private mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field private netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private sqmap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private txMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private txid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 42
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;-><init>()V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->beg:I
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->isV:I
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 52
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 54
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 57
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 42
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/ReadbookDown;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->downbook()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->hasBookMark()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addMk()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BookMark;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BookMark;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BookMark;-><init>()V
a=0;// 
a=0;//     .line 428
a=0;//     .local v0, "bf":Lcom/twocloo/com/cn/beans/BookMark;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BookMark;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setTextid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setTexttitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 431
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->getJJ()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setTextjj(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 432
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/beans/BookMark;->setTime(J)V
a=0;// 
a=0;//     .line 433
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v1, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setLocation(I)V
a=0;// 
a=0;//     .line 434
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v1, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/BookMark;->setLength(I)V
a=0;// 
a=0;//     .line 435
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBookMark(Lcom/twocloo/com/cn/beans/BookMark;I)Ljava/lang/String;
a=0;// 
a=0;//     .line 436
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private downbook()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 369
a=0;//     #v9=(Null);
a=0;//     const-string v6, "0"
a=0;// 
a=0;//     .line 370
a=0;//     .local v6, "uid":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 371
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 373
a=0;//     :cond_0
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 375
a=0;//     const-string v7, "\u8bf7\u5148\u5c06\u672c\u4e66\u52a0\u5165\u4e66\u67b6\u540e\uff0c\u624d\u53ef\u4ee5\u4e0b\u8f7d"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v9}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 395
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 377
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Boolean);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 378
a=0;//     .local v1, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 379
a=0;//     const-string v7, "\u8fdb\u5165\u540e\u53f0\u4e0b\u8f7d..."
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v7, v9}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/db/DBAdapter;->queryOneBook(Ljava/lang/String;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .line 381
a=0;//     .local v0, "bf":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/BFBook;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 382
a=0;//     .local v5, "title":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "book_text_"
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, ".txt"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 383
a=0;//     .local v4, "filename":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v8, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_BOOK:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "/"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v2, v7, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 384
a=0;//     .local v2, "dir":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 387
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Hashtable;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 388
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 390
a=0;//     :cond_3
a=0;//     new-instance v3, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v3, p0, v7, v5}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 391
a=0;//     .local v3, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 392
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v7, v8, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private hasBookMark()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 102
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doinit()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setJumpLis()V
a=0;// 
a=0;//     .line 122
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmCurPageBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmCurPageBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/view/PageWidget;->setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 131
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/PageFlipController;->getInstance()Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Lcom/twocloo/com/cn/common/PageFlipController;->initPage(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// 
a=0;//     .line 140
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Conflicted);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getLen()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 135
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 136
a=0;//     .local v0, "e1":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v1, "\u83b7\u53d6\u7535\u5b50\u4e66\u6709\u9519"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 114
a=0;//     .end local v0    # "e1":Ljava/io/IOException;
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Conflicted);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 115
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAddMark()Landroid/widget/ImageView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 615
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAid()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimationInShare()Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 759
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationInShare:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimationOutShare()Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 767
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationOutShare:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimationin()Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 723
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationin:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimationins()Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 695
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationins:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimationout()Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 715
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationout:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAnimationouts()Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 731
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationouts:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBeg()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 631
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->beg:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBookFile()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 639
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->bookFile:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 591
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDbAdapter()Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 647
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFile()Ljava/io/File;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 575
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->file:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFinishFlag()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->finishFlag:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected getIntentParams(Landroid/content/Intent;)V
a=0;//     .locals 2
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 547
a=0;//     #v1=(Null);
a=0;//     const-string v0, "beg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setBeg(I)V
a=0;// 
a=0;//     .line 548
a=0;//     const-string v0, "isVip"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setIsV(I)V
a=0;// 
a=0;//     .line 549
a=0;//     const-string v0, "finishFlag"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 550
a=0;//     const-string v0, "aid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setAid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 551
a=0;//     const-string v0, "bookFile"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 552
a=0;//     const-string v0, "textid"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setTxid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 556
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getIsV()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 699
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->isV:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getJpTex()Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 671
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->jpTex:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMul()Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 599
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getNowbgid()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 655
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->nowbgid:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRbtn4()Landroid/widget/RadioButton;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 663
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dayOrNightBtn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RadioButton;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getReadjpseek()Landroid/widget/SeekBar;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 679
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SeekBar;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRl()Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 623
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSqmap()Ljava/util/HashMap;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 583
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTextId()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 739
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTxMap()Ljava/util/HashMap;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 607
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTxid()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 707
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getYy2()Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 687
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->yy2:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected goBfMLActivity()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 778
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/BfMLActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 779
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "aid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 780
a=0;//     const-string v1, "nowtxid"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 781
a=0;//     const-string v1, "curf"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getCurF()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 782
a=0;//     const-string v1, "imgFile"
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "imgFile"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 783
a=0;//     const-string v1, "WEB"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 785
a=0;//     const/16 v1, 0xde
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->startActivityForResult(Landroid/content/Intent;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 789
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 786
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 6
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 399
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eq p2, v2, :cond_0
a=0;// 
a=0;//     .line 421
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 403
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const/16 v2, 0xde
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     .line 404
a=0;//     sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v3, "!!!!!!!go on reading!!!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 406
a=0;//     const-string v2, "txid"
a=0;// 
a=0;//     invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txid:Ljava/lang/String;
a=0;// 
a=0;//     .line 407
a=0;//     const-string v2, "beg"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p3, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 408
a=0;//     .local v0, "b":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txMap:Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     iput-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 410
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 412
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->file:Ljava/io/File;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getPosi()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getLen()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v3, v0, v4, v5}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;III)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 416
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->refresh()V
a=0;// 
a=0;//     .line 420
a=0;//     .end local v0    # "b":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 413
a=0;//     .restart local v0    # "b":I
a=0;//     :catch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);v3=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 414
a=0;//     .local v1, "e":Ljava/io/IOException;
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 9
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 245
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SeekBar;);
a=0;//     invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 248
a=0;//     .local v8, "v1":I
a=0;//     #v8=(Integer);
a=0;//     if-gtz v8, :cond_1
a=0;// 
a=0;//     .line 249
a=0;//     const-string v0, "\u6700\u5c0f\u5b57\u4f53\u4e86\uff01"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 363
a=0;//     .end local v8    # "v1":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 254
a=0;//     .restart local v8    # "v1":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/SeekBar;);v1=(Integer);v2=(Uninit);v4=(Null);v5=(PosByte);v6=(Uninit);v7=(Uninit);v8=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     add-int/lit8 v1, v8, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V
a=0;// 
a=0;//     .line 257
a=0;//     add-int/lit8 v0, v8, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/LocalStore;->setFontsize(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     add-int/lit8 v1, v8, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->setFontSize(I)V
a=0;// 
a=0;//     .line 259
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->refresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     .end local v8    # "v1":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 263
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getFontsize(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 264
a=0;//     .restart local v8    # "v1":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt v8, v0, :cond_3
a=0;// 
a=0;//     .line 265
a=0;//     const-string v0, "\u6700\u5927\u5b57\u4f53\u4e86\uff01"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_3
a=0;//     #v0=(PosByte);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizeplus:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadTextSizedecrease:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     .line 273
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readTextsizeseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     add-int/lit8 v1, v8, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V
a=0;// 
a=0;//     .line 274
a=0;//     add-int/lit8 v0, v8, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/LocalStore;->setFontsize(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     add-int/lit8 v1, v8, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->setFontSize(I)V
a=0;// 
a=0;//     .line 276
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->refresh()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 294
a=0;//     .end local v8    # "v1":I
a=0;//     :cond_4
a=0;//     #v0=(Integer);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->iv_back:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageButton;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 296
a=0;//     const-string v0, "single"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->goback()V
a=0;// 
a=0;//     .line 300
a=0;//     :cond_5
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->goback()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 308
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1}, Landroid/widget/ImageView;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_7
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v2, v2, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteOneMark(Ljava/lang/String;I)J
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 314
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->refresh()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnBM:Landroid/widget/Button;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_9
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v5, :cond_8
a=0;// 
a=0;//     .line 319
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMk()V
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v4, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 330
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->refresh()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v2, v2, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteOneMark(Ljava/lang/String;I)J
a=0;// 
a=0;//     .line 326
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4, p0}, Lcom/twocloo/com/cn/db/DBAdapter;->queryAllBookP(Ljava/lang/String;ILandroid/app/Activity;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 328
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 331
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->downAlllayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 332
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->doGone()V
a=0;// 
a=0;//     .line 333
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 334
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, v0, v4}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     const-string v0, "WIFI"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCurrentNetType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getisWifiAlarm(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_b
a=0;// 
a=0;//     .line 341
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     const-string v2, "\u5f53\u524d\u662f\u975ewifi\u7f51\u7edc\uff0c\u662f\u5426\u4e0b\u8f7d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "\u662f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u5426"
a=0;// 
a=0;//     .line 342
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/ReadbookDown$1;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/ReadbookDown$1;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown$1;-><init>(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// 
a=0;//     .line 349
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown$1;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/ReadbookDown$2;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/ReadbookDown$2;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown$2;-><init>(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown$2;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 341
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->netTypedialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 357
a=0;//     :cond_b
a=0;//     #v0=(Integer);v2=(Uninit);v4=(Null);v5=(PosByte);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->downbook()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 360
a=0;//     :cond_c
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->downbook()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-super {p0, p1}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 62
a=0;//     sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     const-string v1, "ReadBookDown-->onCreate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v0, Lcom/twocloo/com/cn/task/ReadBookInitTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/task/ReadBookInitTask;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/task/ReadBookInitTask;-><init>(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/task/ReadBookInitTask;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Void;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/task/ReadBookInitTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 521
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 523
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->goback()V
a=0;// 
a=0;//     .line 524
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 526
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-super {p0, p1, p2}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onPause()V
a=0;// 
a=0;//     .line 514
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->saveLastRead()V
a=0;// 
a=0;//     .line 516
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     invoke-super {p0}, Lcom/twocloo/com/cn/activitys/BaseReadBook;->onResume()V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->autoOrderlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 87
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->autoOrderlayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public saveLastRead()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 481
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->file:Ljava/io/File;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->file:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     :try_start_0
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {v6, v7}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 484
a=0;//     .local v3, "index":I
a=0;//     #v3=(Integer);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 485
a=0;//     .local v1, "db":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/LastReadTable;->open()V
a=0;// 
a=0;//     .line 486
a=0;//     new-instance v4, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-direct {v4}, Lcom/twocloo/com/cn/beans/RDBook;-><init>()V
a=0;// 
a=0;//     .line 487
a=0;//     .local v4, "lastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setArticleId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 488
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget v6, v6, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setPosi(I)V
a=0;// 
a=0;//     .line 489
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->isV:I
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setIsVip(I)V
a=0;// 
a=0;//     .line 490
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setTextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->file:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setBookFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 492
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->finishFlag:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setFinishflag(I)V
a=0;// 
a=0;//     .line 493
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v6, v3
a=0;// 
a=0;//     add-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setIndex_(I)V
a=0;// 
a=0;//     .line 494
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setBookName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 495
a=0;//     invoke-virtual {v1, v4}, Lcom/twocloo/com/cn/db/LastReadTable;->insertLastRead(Lcom/twocloo/com/cn/beans/RDBook;)J
a=0;// 
a=0;//     .line 496
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/LastReadTable;->close()V
a=0;// 
a=0;//     .line 497
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/Vector;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 498
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 499
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 500
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/util/Vector;->indexOf(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 501
a=0;//     .local v5, "temp_index":I
a=0;//     #v5=(Integer);
a=0;//     if-ltz v5, :cond_0
a=0;// 
a=0;//     .line 502
a=0;//     sget-object v6, Lcom/twocloo/com/cn/fragment/BookShelfFragment;->list:Ljava/util/Vector;
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     check-cast v6, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int/2addr v8, v3
a=0;// 
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "\u7ae0\u672a\u8bfb"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setLastIndex(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 509
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v1    # "db":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     .end local v3    # "index":I
a=0;//     .end local v4    # "lastBook":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .end local v5    # "temp_index":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 505
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 506
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAddMark(Landroid/widget/ImageView;)V
a=0;//     .locals 0
a=0;//     .param p1, "addMark"    # Landroid/widget/ImageView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 619
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 620
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAid(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "aid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 563
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 564
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnimationInShare(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animationInShare"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 763
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationInShare:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 764
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnimationOutShare(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animationOutShare"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 771
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationOutShare:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 772
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnimationin(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animationin"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationin:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 728
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnimationout(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animationout"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 719
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationout:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 720
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAnimationouts(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animationouts"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 735
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->animationouts:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 736
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBeg(I)V
a=0;//     .locals 0
a=0;//     .param p1, "beg"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 635
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->beg:I
a=0;// 
a=0;//     .line 636
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBookFile(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "bookFile"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 643
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->bookFile:Ljava/lang/String;
a=0;// 
a=0;//     .line 644
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCurChapterinfo(Lcom/twocloo/com/cn/beans/Chapterinfo;)V
a=0;//     .locals 0
a=0;//     .param p1, "curChapterinfo"    # Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->curChapterinfo:Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 596
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDbAdapter(Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;//     .locals 0
a=0;//     .param p1, "dbAdapter"    # Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 651
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dbAdapter:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     .line 652
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFile(Ljava/io/File;)V
a=0;//     .locals 0
a=0;//     .param p1, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 579
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->file:Ljava/io/File;
a=0;// 
a=0;//     .line 580
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setFinishFlag(I)V
a=0;//     .locals 0
a=0;//     .param p1, "finishFlag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 571
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->finishFlag:I
a=0;// 
a=0;//     .line 572
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIsV(I)V
a=0;//     .locals 0
a=0;//     .param p1, "isV"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 703
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->isV:I
a=0;// 
a=0;//     .line 704
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setJpTex(Landroid/widget/TextView;)V
a=0;//     .locals 0
a=0;//     .param p1, "jpTex"    # Landroid/widget/TextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 675
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->jpTex:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 676
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setJumpLis()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SeekBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/ReadbookDown$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/ReadbookDown$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown$3;-><init>(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown$3;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
a=0;// 
a=0;//     .line 457
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadjp1:Landroid/widget/Button;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 458
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadjp1:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/ReadbookDown$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/ReadbookDown$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown$4;-><init>(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown$4;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 466
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadjp2:Landroid/widget/Button;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->btnReadjp2:Landroid/widget/Button;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/ReadbookDown$5;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/ReadbookDown$5;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/ReadbookDown$5;-><init>(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown$5;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 475
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMul(Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;//     .locals 0
a=0;//     .param p1, "mul"    # Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 603
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 604
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNowbgid(I)V
a=0;//     .locals 0
a=0;//     .param p1, "nowbgid"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 659
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->nowbgid:I
a=0;// 
a=0;//     .line 660
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRbtn4(Landroid/widget/RadioButton;)V
a=0;//     .locals 0
a=0;//     .param p1, "rbtn4"    # Landroid/widget/RadioButton;
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->dayOrNightBtn:Landroid/widget/RadioButton;
a=0;// 
a=0;//     .line 668
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setReadjpseek(Landroid/widget/SeekBar;)V
a=0;//     .locals 0
a=0;//     .param p1, "readjpseek"    # Landroid/widget/SeekBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 683
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readjpseek:Landroid/widget/SeekBar;
a=0;// 
a=0;//     .line 684
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRl(Landroid/widget/RelativeLayout;)V
a=0;//     .locals 0
a=0;//     .param p1, "rl"    # Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 627
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->readbookLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 628
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSqmap(Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 587
a=0;//     .local p1, "sqmap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->sqmap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 588
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTxMap()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 533
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 534
a=0;//     .local v1, "clist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 535
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 536
a=0;//     .local v2, "i":I
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 542
a=0;//     .end local v2    # "i":I
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 536
a=0;//     .restart local v2    # "i":I
a=0;//     :cond_1
a=0;//     #v2=(Integer);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 537
a=0;//     .local v0, "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v0, v2}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setCurF(I)V
a=0;// 
a=0;//     .line 538
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     .line 539
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTxMap(Ljava/util/HashMap;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 611
a=0;//     .local p1, "txMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 612
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTxid(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "txid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 711
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->txid:Ljava/lang/String;
a=0;// 
a=0;//     .line 712
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setYy2(Landroid/widget/RelativeLayout;)V
a=0;//     .locals 0
a=0;//     .param p1, "yy2"    # Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 691
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/ReadbookDown;->yy2:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 692
a=0;//     return-void
a=0;// .end method
}}
