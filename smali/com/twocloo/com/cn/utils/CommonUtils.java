package com.twocloo.com.cn.utils; class CommonUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/CommonUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "CommonUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static BOOK_PAY_TYPE_MSG_END:Ljava/lang/String;
a=0;// 
a=0;// .field private static map:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static wl:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     const-string v0, "2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/CommonUtils;->BOOK_PAY_TYPE_MSG_END:Ljava/lang/String;
a=0;// 
a=0;//     .line 1142
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/CommonUtils;->map:Ljava/util/Map;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/CommonUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addAutoOrder(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "aId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 605
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/AutoOrderTable;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/AutoOrderTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 606
a=0;//     .local v0, "autoOrderTable":Lcom/twocloo/com/cn/db/AutoOrderTable;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/AutoOrderTable;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/AutoOrderTable;->open()V
a=0;// 
a=0;//     .line 607
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/db/AutoOrderTable;->insertAutoOrder(Ljava/lang/String;)J
a=0;// 
a=0;//     .line 608
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/AutoOrderTable;->close()V
a=0;// 
a=0;//     .line 609
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addBookAndDown(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "articleId"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "iconUrl"    # Ljava/lang/String;
a=0;//     .param p4, "finishflag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 440
a=0;//     invoke-static {p0, p1, p2, p3, p4}, Lcom/twocloo/com/cn/utils/CommonUtils;->addBookToBF(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 442
a=0;//     .local v1, "isSuccess":Z
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 443
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 444
a=0;//     .local v0, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/http/DownFile;->start()V
a=0;// 
a=0;//     .line 445
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v2, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 448
a=0;//     .end local v0    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static addBookAndDown(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "articleId"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "iconUrl"    # Ljava/lang/String;
a=0;//     .param p4, "finishflag"    # I
a=0;//     .param p5, "isFromFence"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 461
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {p0 .. p5}, Lcom/twocloo/com/cn/utils/CommonUtils;->addBookToBF(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 462
a=0;//     .local v2, "isSuccess":Z
a=0;//     #v2=(Boolean);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "7pYwmBnsHh4t6ZSK"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 464
a=0;//     .local v3, "token":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 465
a=0;//     .local v0, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 466
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 467
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "\u8bf7\u767b\u5f55"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v5, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 486
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 470
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 471
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/DownFile;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-direct {v1, p0, p1, p2, v3}, Lcom/twocloo/com/cn/http/DownFile;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 472
a=0;//     .local v1, "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/DownFile;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/http/DownFile;->start(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 473
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/HCData;->downingBook:Ljava/util/Hashtable;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Hashtable;);
a=0;//     invoke-virtual {v5, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 475
a=0;//     .end local v1    # "downFile":Lcom/twocloo/com/cn/http/DownFile;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     .line 476
a=0;//     .local v4, "uidd":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 477
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 480
a=0;//     :cond_4
a=0;//     invoke-virtual {v0, p1, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 481
a=0;//     invoke-virtual {v0, p1, v4, v7}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static addBookToBF(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "articleId"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "iconUrl"    # Ljava/lang/String;
a=0;//     .param p4, "finishflag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 347
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 350
a=0;//     .local v1, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 351
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .local v2, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 353
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     .line 354
a=0;//     .local v3, "uid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 355
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 358
a=0;//     :cond_0
a=0;//     invoke-virtual {v2, p1}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     .line 359
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 360
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 362
a=0;//     invoke-virtual {v0, p3}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 363
a=0;//     invoke-virtual {v0, p2}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 364
a=0;//     invoke-virtual {v0, p4}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 369
a=0;//     invoke-virtual {v2, p1, v3}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookGx(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 370
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, p1, v3, v4}, Lcom/twocloo/com/cn/db/DBAdapter;->insertGx(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 373
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     const-string v4, "\u52a0\u5165\u4e66\u67b6\u6210\u529f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {p0, v4, v5}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 382
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 383
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 374
a=0;//     :cond_2
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 378
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Boolean);v5=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 377
a=0;//     :cond_4
a=0;//     :try_start_2
a=0;//     #v0=(Uninit);v4=(Null);v5=(Boolean);v6=(Uninit);
a=0;//     const-string v5, "\u5df2\u52a0\u5165\u4e66\u67b6"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {p0, v5, v6}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 382
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 383
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 381
a=0;//     .end local v2    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .end local v3    # "uid":Ljava/lang/String;
a=0;//     .restart local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 382
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v3=(Conflicted);v4=(Reference,Ljava/lang/Throwable;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 383
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 384
a=0;//     :cond_5
a=0;//     throw v4
a=0;// 
a=0;//     .line 381
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v2    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :catchall_1
a=0;//     #v1=(Null);v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v4=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static addBookToBF(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "articleId"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "iconUrl"    # Ljava/lang/String;
a=0;//     .param p4, "finishflag"    # I
a=0;//     .param p5, "isFromFence"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 389
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 392
a=0;//     .local v1, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 393
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .local v2, "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->open()V
a=0;// 
a=0;//     .line 395
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     .line 396
a=0;//     .local v3, "uid":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 397
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 400
a=0;//     :cond_0
a=0;//     invoke-virtual {v2, p1}, Lcom/twocloo/com/cn/db/DBAdapter;->exitBookBF1(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 401
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 402
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 404
a=0;//     invoke-virtual {v0, p3}, Lcom/twocloo/com/cn/beans/BFBook;->setImgFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v0, p2}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 406
a=0;//     invoke-virtual {v0, p4}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 407
a=0;//     const-string v4, "fromFenCe"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/BFBook;->setIsFromWeb(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 408
a=0;//     invoke-virtual {v0, v3}, Lcom/twocloo/com/cn/beans/BFBook;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/db/DBAdapter;->insertBook(Lcom/twocloo/com/cn/beans/BFBook;)Ljava/lang/String;
a=0;// 
a=0;//     .line 415
a=0;//     const-string v4, "\u52a0\u5165\u4e66\u67b6\u6210\u529f"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {p0, v4, v5}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 424
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 416
a=0;//     :cond_1
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 420
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Boolean);v5=(Reference,Ljava/lang/String;);v6=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 419
a=0;//     :cond_3
a=0;//     :try_start_2
a=0;//     #v0=(Uninit);v4=(Null);v5=(Boolean);v6=(Uninit);
a=0;//     const-string v5, "\u5df2\u52a0\u5165\u4e66\u67b6"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {p0, v5, v6}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 424
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 423
a=0;//     .end local v2    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .end local v3    # "uid":Ljava/lang/String;
a=0;//     .restart local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 424
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);v3=(Conflicted);v4=(Reference,Ljava/lang/Throwable;);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/db/DBAdapter;->close()V
a=0;// 
a=0;//     .line 426
a=0;//     :cond_4
a=0;//     throw v4
a=0;// 
a=0;//     .line 423
a=0;//     .end local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v2    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     :catchall_1
a=0;//     #v1=(Null);v2=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     move-exception v4
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .restart local v1    # "dbAdapter":Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static createCardPayNo()Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     .line 678
a=0;//     #v4=(PosByte);
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v3, "yyyyMMddHHmmss"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 679
a=0;//     .local v0, "format":Ljava/text/SimpleDateFormat;
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v3, Ljava/util/Date;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v3}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 681
a=0;//     .local v2, "time":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 683
a=0;//     .local v1, "sb":Ljava/lang/StringBuilder;
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v3, Ljava/util/Random;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v3}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 684
a=0;//     new-instance v3, Ljava/util/Random;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v3}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 685
a=0;//     new-instance v3, Ljava/util/Random;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v3}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 686
a=0;//     new-instance v3, Ljava/util/Random;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v3}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 688
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public static delCacheAfterUpbook(Lcom/twocloo/com/cn/beans/BFBook;)V
a=0;//     .locals 10
a=0;//     .param p0, "curBook"    # Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 281
a=0;//     .local v5, "v":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 282
a=0;//     .local v4, "srcid":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 283
a=0;//     .local v1, "imei":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     sget v7, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 284
a=0;//     .local v3, "pt":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 285
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "http://app.2cloo.com/book-one_book?articleid=%s&source=%s&data=json&v=%s&srcid=%s&imei=%s&pt=%s&ct=%s"
a=0;// 
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/BFBook;->getArticleid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     aput-object v9, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     aput-object v5, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     aput-object v4, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     aput-object v1, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     aput-object v3, v7, v8
a=0;// 
a=0;//     const/4 v8, 0x6
a=0;// 
a=0;//     aput-object v0, v7, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 286
a=0;//     .local v2, "onBookUrl":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "/2cloo/viewdataCache2/"
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->delCache(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 289
a=0;//     .end local v0    # "ct":Ljava/lang/String;
a=0;//     .end local v1    # "imei":Ljava/lang/String;
a=0;//     .end local v2    # "onBookUrl":Ljava/lang/String;
a=0;//     .end local v3    # "pt":Ljava/lang/String;
a=0;//     .end local v4    # "srcid":Ljava/lang/String;
a=0;//     .end local v5    # "v":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static dialogWaitUp(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 812
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u8fd4\u56de\u4e66\u57ce"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/utils/CommonUtils$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/utils/CommonUtils$1;);
a=0;//     invoke-direct {v2, p0}, Lcom/twocloo/com/cn/utils/CommonUtils$1;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/utils/CommonUtils$1;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 820
a=0;//     const-string v1, "\u53d6\u6d88"
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/com/cn/utils/CommonUtils$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/utils/CommonUtils$2;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/utils/CommonUtils$2;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/utils/CommonUtils$2;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 823
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 824
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static doReadLastPage(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "finishFlag"    # I
a=0;//     .param p2, "articleId"    # Ljava/lang/String;
a=0;//     .param p3, "chapterName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 830
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/http/HttpComm;->isNetworkAvalible(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 831
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
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
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 834
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAppName(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1203
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->app_name:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1207
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1204
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1205
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 1207
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppPackageName(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1190
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1191
a=0;//     .local v2, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1192
a=0;//     .local v1, "pi":Landroid/content/pm/PackageInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v3, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1196
a=0;//     .end local v1    # "pi":Landroid/content/pm/PackageInfo;
a=0;//     .end local v2    # "pm":Landroid/content/pm/PackageManager;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 1193
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1194
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 1196
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppStyle(Landroid/app/Activity;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1300
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 1301
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1303
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppStyle(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1307
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 1308
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1310
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppVersionCode(Landroid/content/Context;)I
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1174
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1177
a=0;//     .local v3, "versionCode":I
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1178
a=0;//     .local v2, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1179
a=0;//     .local v1, "pi":Landroid/content/pm/PackageInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1184
a=0;//     .end local v1    # "pi":Landroid/content/pm/PackageInfo;
a=0;//     .end local v2    # "pm":Landroid/content/pm/PackageManager;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 1180
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v3=(Null);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1181
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppVersionName(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1156
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1157
a=0;//     .local v3, "versionName":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 1160
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1161
a=0;//     .local v2, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1162
a=0;//     .local v1, "pi":Landroid/content/pm/PackageInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v3, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     .line 1163
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_1
a=0;// 
a=0;//     .line 1164
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     .line 1170
a=0;//     .end local v1    # "pi":Landroid/content/pm/PackageInfo;
a=0;//     .end local v2    # "pm":Landroid/content/pm/PackageManager;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 1166
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1167
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     .line 1170
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getChannel(Landroid/app/Activity;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1292
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 1293
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1295
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/16 v5, 0x80
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 722
a=0;//     .local v2, "info":Landroid/content/pm/ApplicationInfo;
a=0;//     #v2=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v4, "UMENG_CHANNEL"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 730
a=0;//     .end local v2    # "info":Landroid/content/pm/ApplicationInfo;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 726
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 727
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 730
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getChannelPartnerDrawable(Landroid/content/Context;)I
a=0;//     .locals 7
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 299
a=0;//     #v3=(Null);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 301
a=0;//     .local v2, "curChannelName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v5, Lcom/twocloo/com/cn/R$array;->channel_partner:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 304
a=0;//     .local v1, "cps":[Ljava/lang/String;
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     array-length v5, v1
a=0;// 
a=0;//     move v4, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Integer);v6=(Conflicted);
a=0;//     if-lt v4, v5, :cond_0
a=0;// 
a=0;//     .line 317
a=0;//     :goto_1
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 304
a=0;//     :cond_0
a=0;//     #v3=(Null);v4=(Integer);
a=0;//     aget-object v0, v1, v4
a=0;// 
a=0;//     .line 305
a=0;//     .local v0, "cp":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 306
a=0;//     const-string v6, "anzhi12_17_new"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 307
a=0;//     const-string v2, "anzhi"
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "welcome_"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/base/util/ResourceUtils;->getDrawableResource(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 310
a=0;//     :cond_1
a=0;//     #v3=(Null);v4=(Integer);
a=0;//     const-string v6, "by_360"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 311
a=0;//     const-string v2, "new_year"
a=0;// 
a=0;//     .line 312
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "welcome_"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/base/util/ResourceUtils;->getDrawableResource(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 304
a=0;//     :cond_2
a=0;//     #v3=(Null);v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getCurrentNetType()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_2G:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     const-string v1, "2G"
a=0;// 
a=0;//     .line 117
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_3G_OR_OTHERS:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 111
a=0;//     const-string v1, "3G"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_WIFI:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 113
a=0;//     const-string v1, "WIFI"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     sget-object v1, Lcom/twocloo/base/common/NetType;->TYPE_4G:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 115
a=0;//     const-string v1, "4G"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 117
a=0;//     :cond_3
a=0;//     #v1=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getCustomAuth(J)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "curTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 774
a=0;//     invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 775
a=0;//     .local v1, "curTimeMd5":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants;->CUSTOM_PRIVATE_KEY:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 777
a=0;//     .local v0, "auth":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static getCustomChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 742
a=0;//     :try_start_0
a=0;//     const-string v2, "UMENG_CHANNEL"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->getMetaData(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 750
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 746
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 747
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 750
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getImei(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     const-string v1, "phone"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 132
a=0;//     .local v0, "telephonyManager":Landroid/telephony/TelephonyManager;
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     const-string v1, "000000000000000"
a=0;// 
a=0;//     .line 136
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getMetaData(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 755
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/16 v5, 0x80
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 757
a=0;//     .local v1, "info":Landroid/content/pm/ApplicationInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     iget-object v3, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v3, p1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 765
a=0;//     .end local v1    # "info":Landroid/content/pm/ApplicationInfo;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/lang/Object;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 761
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 762
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 765
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getPayToken(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/Constants;->MSG_SECURE_KEY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static getPayToken(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "outtradeno"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloo/com/cn/common/Constants;->MSG_SECURE_KEY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;//     .locals 18
a=0;//     .param p0, "ctx"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1242
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 1243
a=0;//     .local v13, "v":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android"
a=0;// 
a=0;//     .line 1244
a=0;//     .local v2, "ct":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppStyle(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1245
a=0;//     .local v7, "pt":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 1247
a=0;//     .local v9, "srcid":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1248
a=0;//     .local v11, "uid":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move-object v12, v11
a=0;// 
a=0;//     .line 1250
a=0;//     .local v12, "userid":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1251
a=0;//     .local v4, "macAddress":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1252
a=0;//     .local v3, "imei":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 1253
a=0;//     .local v14, "versionName":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getModel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, " "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     const-string v17, ""
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v17}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1254
a=0;//     .local v5, "model":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getSystemRelease()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1255
a=0;//     .local v10, "systemRelease":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getScreenPix(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1256
a=0;//     .local v6, "phoneResolution":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/Util;->getSIMOperator(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1257
a=0;//     .local v1, "carrieroperator":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/LocalStore;->getActivateCode(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1259
a=0;//     .local v0, "activateCode":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "&uid="
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&userid="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&v="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&ct="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&pt="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&srcid="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 1260
a=0;//     const-string v16, "&mac_address="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&imei="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&versionname="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&model="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&pix="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 1261
a=0;//     const-string v16, "&system_release="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&op="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&activate_code="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 1259
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1262
a=0;//     .local v8, "publicArgs":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     return-object v8
a=0;// .end method
a=0;// 
a=0;// .method public static getPublicArgs(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 18
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1267
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 1268
a=0;//     .local v13, "v":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "android"
a=0;// 
a=0;//     .line 1269
a=0;//     .local v2, "ct":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppStyle(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1270
a=0;//     .local v7, "pt":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 1272
a=0;//     .local v9, "srcid":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/LocalStore;->getLastUid(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1273
a=0;//     .local v11, "uid":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move-object v12, v11
a=0;// 
a=0;//     .line 1275
a=0;//     .local v12, "userid":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/base/util/PhoneUtils;->getMacAddress(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1276
a=0;//     .local v4, "macAddress":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1277
a=0;//     .local v3, "imei":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/CommonUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 1278
a=0;//     .local v14, "versionName":Ljava/lang/String;
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getModel()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     const-string v16, " "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     const-string v17, ""
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v17}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1279
a=0;//     .local v5, "model":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getSystemRelease()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1280
a=0;//     .local v10, "systemRelease":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/utils/DisplayUtil;->getScreenPix(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1281
a=0;//     .local v6, "phoneResolution":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/Util;->getSIMOperator(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1282
a=0;//     .local v1, "carrieroperator":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/twocloo/com/cn/common/LocalStore;->getActivateCode(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1284
a=0;//     .local v0, "activateCode":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "&uid="
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&userid="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&v="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&ct="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&pt="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&srcid="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 1285
a=0;//     const-string v16, "&mac_address="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&imei="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&versionname="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&model="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&pix="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 1286
a=0;//     const-string v16, "&system_release="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&op="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "&activate_code="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 1284
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1287
a=0;//     .local v8, "publicArgs":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     return-object v8
a=0;// .end method
a=0;// 
a=0;// .method public static goBaoyue(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 510
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/BaoyueActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 511
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 514
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 513
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     const-string v1, "LOGINTAG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static goGeneralActivity(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 534
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/GeneralActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 535
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 536
a=0;//     const-string v1, "url"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 537
a=0;//     const-string v1, "from"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 538
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 539
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static goSignIn(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 494
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 495
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/SignInActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 496
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 501
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 498
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     const-string v1, "LOGINTAG"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static goToApp(Landroid/app/Activity;)V
a=0;//     .locals 0
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 596
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static goToConsume(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 524
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/RechargeWayActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 525
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 526
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/SwitchingAccountsActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 558
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "Tag"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 559
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 560
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static goToRead(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "chapter"    # Ljava/lang/String;
a=0;//     .param p3, "title"    # Ljava/lang/String;
a=0;//     .param p4, "chapterCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static goToRegist(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 568
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/RegistActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 569
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 570
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static goToUserInfo(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 586
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 587
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 588
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static isNetWorkAvailable(Landroid/app/Activity;)Z
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1843
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v2, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1844
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0, v1, v0}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1847
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isNoNeedPic(Lcom/twocloo/base/common/NetType;)Z
a=0;//     .locals 1
a=0;//     .param p0, "netType"    # Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     sget-object v0, Lcom/twocloo/base/common/NetType;->TYPE_2G:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, p0}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isShowAd()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 327
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 328
a=0;//     .local v0, "netType":Lcom/twocloo/base/common/NetType;
a=0;//     #v0=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     sget-object v3, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 335
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Boolean);v3=(Integer);
a=0;//     return v2
a=0;// 
a=0;//     .line 331
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Null);v3=(Boolean);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 332
a=0;//     .local v1, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getVipLevel()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->isBaoYue()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 335
a=0;//     :cond_2
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static keepScreenOn(Landroid/content/Context;Z)V
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "on"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1132
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 1133
a=0;//     const-string v1, "power"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/os/PowerManager;
a=0;// 
a=0;//     .line 1134
a=0;//     .local v0, "pm":Landroid/os/PowerManager;
a=0;//     const v1, 0x2000000a
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "==KeepScreenOn=="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/PowerManager$WakeLock;);
a=0;//     sput-object v1, Lcom/twocloo/com/cn/utils/CommonUtils;->wl:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     .line 1135
a=0;//     sget-object v1, Lcom/twocloo/com/cn/utils/CommonUtils;->wl:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->acquire()V
a=0;// 
a=0;//     .line 1140
a=0;//     .end local v0    # "pm":Landroid/os/PowerManager;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1136
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v1, Lcom/twocloo/com/cn/utils/CommonUtils;->wl:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/PowerManager$WakeLock;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1137
a=0;//     sget-object v1, Lcom/twocloo/com/cn/utils/CommonUtils;->wl:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V
a=0;// 
a=0;//     .line 1138
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sput-object v1, Lcom/twocloo/com/cn/utils/CommonUtils;->wl:Landroid/os/PowerManager$WakeLock;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static logInToken(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 987
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static logout(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 578
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->cleanUser()V
a=0;// 
a=0;//     .line 579
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/common/LocalStore;->setStime(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 580
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static md5(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     :try_start_0
a=0;//     const-string v3, "MD5"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 247
a=0;//     .local v0, "digest":Ljava/security/MessageDigest;
a=0;//     #v0=(Reference,Ljava/security/MessageDigest;);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 248
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 250
a=0;//     .local v2, "messageDigest":[B
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->toHexString([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 254
a=0;//     .end local v0    # "digest":Ljava/security/MessageDigest;
a=0;//     .end local v2    # "messageDigest":[B
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 251
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 252
a=0;//     .local v1, "e":Ljava/security/NoSuchAlgorithmException;
a=0;//     #v1=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 254
a=0;//     const-string v3, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static modifyiconDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;//     .locals 9
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "firstView"    # Landroid/view/View$OnClickListener;
a=0;//     .param p2, "secondView"    # Landroid/view/View$OnClickListener;
a=0;//     .param p3, "thirdView"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1772
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/ModifyUserIconDialog;);
a=0;//     sget v8, Lcom/twocloo/com/cn/R$style;->ModifyIconDialog:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v1, p0, v8}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1773
a=0;//     .local v1, "dialog":Lcom/twocloo/com/cn/view/ModifyUserIconDialog;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/ModifyUserIconDialog;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1774
a=0;//     .local v6, "window":Landroid/view/Window;
a=0;//     #v6=(Reference,Landroid/view/Window;);
a=0;//     const/16 v8, 0x50
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v6, v8}, Landroid/view/Window;->setGravity(I)V
a=0;// 
a=0;//     .line 1775
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;->show()V
a=0;// 
a=0;//     .line 1776
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1777
a=0;//     .local v7, "windowManager":Landroid/view/WindowManager;
a=0;//     #v7=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1778
a=0;//     .local v2, "display":Landroid/view/Display;
a=0;//     #v2=(Reference,Landroid/view/Display;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v8}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1779
a=0;//     .local v3, "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v3=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-virtual {v2}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iput v8, v3, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     .line 1780
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v8, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     .line 1782
a=0;//     sget v8, Lcom/twocloo/com/cn/R$id;->takephotobtn:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/Button;
a=0;// 
a=0;//     .line 1783
a=0;//     .local v5, "takephotoBtn":Landroid/widget/Button;
a=0;//     sget v8, Lcom/twocloo/com/cn/R$id;->photoalbumbtn:I
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/Button;
a=0;// 
a=0;//     .line 1784
a=0;//     .local v4, "photoAlbumBtn":Landroid/widget/Button;
a=0;//     sget v8, Lcom/twocloo/com/cn/R$id;->cancebtn:I
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/view/ModifyUserIconDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     .line 1785
a=0;//     .local v0, "cancleBtn":Landroid/widget/Button;
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 1786
a=0;//     invoke-virtual {v5, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1788
a=0;//     :cond_0
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1789
a=0;//     invoke-virtual {v4, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1791
a=0;//     :cond_1
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1792
a=0;//     invoke-virtual {v0, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1793
a=0;//     :cond_2
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;//     .locals 13
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "showTwoButton"    # Z
a=0;//     .param p4, "ensureTv"    # Ljava/lang/String;
a=0;//     .param p5, "cancelTv"    # Ljava/lang/String;
a=0;//     .param p6, "pl"    # Landroid/view/View$OnClickListener;
a=0;//     .param p7, "nl"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1668
a=0;//     new-instance v2, Lcom/twocloo/com/cn/view/MyDialog;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/view/MyDialog;);
a=0;//     sget v12, Lcom/twocloo/com/cn/R$style;->MyDialog:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-direct {v2, p0, v12}, Lcom/twocloo/com/cn/view/MyDialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1669
a=0;//     .local v2, "dialog":Lcom/twocloo/com/cn/view/MyDialog;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/MyDialog;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/view/MyDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1671
a=0;//     .local v10, "window":Landroid/view/Window;
a=0;//     #v10=(Reference,Landroid/view/Window;);
a=0;//     const/16 v12, 0x11
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v10, v12}, Landroid/view/Window;->setGravity(I)V
a=0;// 
a=0;//     .line 1672
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/view/MyDialog;->show()V
a=0;// 
a=0;//     .line 1673
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1674
a=0;//     .local v11, "windowManager":Landroid/view/WindowManager;
a=0;//     #v11=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v11}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1675
a=0;//     .local v4, "display":Landroid/view/Display;
a=0;//     #v4=(Reference,Landroid/view/Display;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/view/MyDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v12}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1676
a=0;//     .local v6, "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v6=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-virtual {v4}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit16 v12, v12, -0xc8
a=0;// 
a=0;//     iput v12, v6, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     .line 1677
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/view/MyDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v12, v6}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     .line 1678
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->confirmbutton:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v2, v12}, Lcom/twocloo/com/cn/view/MyDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/Button;
a=0;// 
a=0;//     .line 1679
a=0;//     .local v5, "ensure":Landroid/widget/Button;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->cancelbutton:I
a=0;// 
a=0;//     invoke-virtual {v2, v12}, Lcom/twocloo/com/cn/view/MyDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     .line 1680
a=0;//     .local v1, "cancel":Landroid/widget/Button;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->title:I
a=0;// 
a=0;//     invoke-virtual {v2, v12}, Lcom/twocloo/com/cn/view/MyDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     check-cast v8, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1681
a=0;//     .local v8, "titleV":Landroid/widget/TextView;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->contents:I
a=0;// 
a=0;//     invoke-virtual {v2, v12}, Lcom/twocloo/com/cn/view/MyDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1682
a=0;//     .local v7, "msgV":Landroid/widget/TextView;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->titlelayout:I
a=0;// 
a=0;//     invoke-virtual {v2, v12}, Lcom/twocloo/com/cn/view/MyDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     check-cast v9, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 1683
a=0;//     .local v9, "titlelayout":Landroid/widget/LinearLayout;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->dialoglayout:I
a=0;// 
a=0;//     invoke-virtual {v2, v12}, Lcom/twocloo/com/cn/view/MyDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 1684
a=0;//     .local v3, "dialoglayout":Landroid/widget/LinearLayout;
a=0;//     invoke-static {p0, v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->setYuepiaoAndTuijianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1685
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/com/cn/utils/CommonUtils;->setDialogBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1686
a=0;//     invoke-static {p0, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTabButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1687
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTabButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1689
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     .line 1690
a=0;//     const/16 v12, 0x8
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v1, v12}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 1693
a=0;//     :cond_0
a=0;//     #v12=(Integer);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 1694
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1696
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p5, :cond_2
a=0;// 
a=0;//     .line 1697
a=0;//     move-object/from16 v0, p5
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1700
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 1701
a=0;//     invoke-virtual {v8, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1704
a=0;//     :cond_3
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     .line 1705
a=0;//     invoke-virtual {v7, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1708
a=0;//     :cond_4
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     .line 1709
a=0;//     move-object/from16 v0, p6
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v5, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1711
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 1712
a=0;//     move-object/from16 v0, p7
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1714
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static myPopupWindow(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/widget/PopupWindow;
a=0;//     .locals 9
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "pl"    # Landroid/view/View$OnClickListener;
a=0;//     .param p5, "nl"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1808
a=0;//     invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v7, Lcom/twocloo/com/cn/R$layout;->dialog_layout:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v6, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1809
a=0;//     .local v3, "popview":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     new-instance v4, Landroid/widget/PopupWindow;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/PopupWindow;);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v7, -0x2
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-direct {v4, v3, v6, v7, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V
a=0;// 
a=0;//     .line 1810
a=0;//     .local v4, "popwin":Landroid/widget/PopupWindow;
a=0;//     #v4=(Reference,Landroid/widget/PopupWindow;);
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->confirmbutton:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/Button;
a=0;// 
a=0;//     .line 1811
a=0;//     .local v1, "ensure":Landroid/widget/Button;
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->cancelbutton:I
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     .line 1812
a=0;//     .local v0, "cacel":Landroid/widget/Button;
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->title:I
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1813
a=0;//     .local v5, "titleTv":Landroid/widget/TextView;
a=0;//     sget v6, Lcom/twocloo/com/cn/R$id;->contents:I
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1816
a=0;//     .local v2, "msgTv":Landroid/widget/TextView;
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 1817
a=0;//     invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1820
a=0;//     :cond_0
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 1821
a=0;//     invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 1823
a=0;//     :cond_1
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1824
a=0;//     invoke-virtual {v1, p4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1826
a=0;//     :cond_2
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1827
a=0;//     invoke-virtual {v0, p5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1829
a=0;//     :cond_3
a=0;//     new-instance v6, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-direct {v6}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {v4, v6}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1832
a=0;//     const/16 v6, 0x50
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v4, p1, v6, v7, v8}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
a=0;// 
a=0;//     .line 1833
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method public static openLoginCallBack(Landroid/app/Activity;Lcom/twocloo/com/cn/beans/User;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;//     .locals 6
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "user"    # Lcom/twocloo/com/cn/beans/User;
a=0;//     .param p2, "loginType"    # Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1001
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v3, Lcom/twocloo/com/cn/beans/User;->LOGIN_SUCCESS:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/User;->getCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 1004
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v3, p2}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     .line 1007
a=0;//     invoke-static {p1}, Lcom/twocloo/com/cn/activitys/BookApp;->setUser(Lcom/twocloo/com/cn/beans/User;)V
a=0;// 
a=0;//     .line 1010
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getfirstload(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "1"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1011
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1012
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v3, 0x4000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1013
a=0;//     invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1022
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getFirstLogin(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1023
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {p0, v3}, Lcom/twocloo/com/cn/common/LocalStore;->setFirstLogin(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1024
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 1025
a=0;//     new-instance v2, Lcom/twocloo/com/cn/threads/SendLogRegInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/threads/SendLogRegInfo;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v2, p0, v3, v4, v5}, Lcom/twocloo/com/cn/threads/SendLogRegInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 1026
a=0;//     .local v2, "sendInfo":Lcom/twocloo/com/cn/threads/SendLogRegInfo;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/threads/SendLogRegInfo;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/threads/SendLogRegInfo;->start()V
a=0;// 
a=0;//     .line 1031
a=0;//     .end local v2    # "sendInfo":Lcom/twocloo/com/cn/threads/SendLogRegInfo;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants$LoginType;->qq:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-virtual {v3, p2}, Lcom/twocloo/com/cn/common/Constants$LoginType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 1032
a=0;//     const-string v3, "QQ\u767b\u9646\u6210\u529f\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p0, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 1046
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1015
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Uninit);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1016
a=0;//     .restart local v1    # "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->main_bookcity:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1017
a=0;//     const/high16 v3, 0x4000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1018
a=0;//     invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1043
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1044
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1033
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     .restart local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/content/Intent;);v3=(Boolean);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants$LoginType;->sina:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-virtual {v3, p2}, Lcom/twocloo/com/cn/common/Constants$LoginType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 1034
a=0;//     const-string v3, "\u65b0\u6d6a\u5fae\u535a\u767b\u9646\u6210\u529f\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p0, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1035
a=0;//     :cond_4
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants$LoginType;->alipay:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-virtual {v3, p2}, Lcom/twocloo/com/cn/common/Constants$LoginType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 1036
a=0;//     const-string v3, "\u60a8\u5df2\u4f7f\u7528\u652f\u4ed8\u5b9d\u8d26\u53f7\u767b\u5f55\uff0c\u5168\u65b9\u9762\u652f\u4ed8\u4fdd\u969c\uff0c\u5b89\u5168\u65e0\u5fe7"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p0, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1037
a=0;//     :cond_5
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/common/Constants$LoginType;->wechat:Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/Constants$LoginType;);
a=0;//     invoke-virtual {v3, p2}, Lcom/twocloo/com/cn/common/Constants$LoginType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1038
a=0;//     const-string v3, "\u5fae\u4fe1\u767b\u9646\u6210\u529f\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p0, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1041
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :cond_6
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);
a=0;//     const-string v3, "\u767b\u9646\u5931\u8d25\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {p0, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/Toast;->show()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static paySuccess(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "articid"    # Ljava/lang/String;
a=0;//     .param p2, "chapterId"    # Ljava/lang/String;
a=0;//     .param p3, "title"    # Ljava/lang/String;
a=0;//     .param p4, "chapterCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     invoke-static {p0, p1, p2, p3, p4}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToRead(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static payUnCheck(Landroid/app/Activity;I)V
a=0;//     .locals 0
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "chapterId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static readOnline(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "aId"    # Ljava/lang/String;
a=0;//     .param p2, "textid"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # I
a=0;//     .param p4, "imgUrl"    # Ljava/lang/String;
a=0;//     .param p5, "title"    # Ljava/lang/String;
a=0;//     .param p6, "fcdVip"    # I
a=0;//     .param p7, "isFromWeb"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 650
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 651
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 652
a=0;//     .local v0, "db":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/LastReadTable;->open()V
a=0;// 
a=0;//     .line 653
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, p1, v3}, Lcom/twocloo/com/cn/db/LastReadTable;->queryLastBook(Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 654
a=0;//     .local v2, "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/LastReadTable;->close()V
a=0;// 
a=0;//     .line 655
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 656
a=0;//     const-string v3, "textid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 657
a=0;//     const-string v3, "isVip"
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getIsVip()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 658
a=0;//     const-string v3, "beg"
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getPosi()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 663
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v3, "imgUrl"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 664
a=0;//     const-string v3, "aid"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 665
a=0;//     const-string v3, "title"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 666
a=0;//     const-string v3, "fcdVip"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 667
a=0;//     const-string v3, "WEB"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 668
a=0;//     const/high16 v3, 0x4000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 669
a=0;//     invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 670
a=0;//     return-void
a=0;// 
a=0;//     .line 660
a=0;//     :cond_0
a=0;//     #v3=(One);v4=(Uninit);
a=0;//     const-string v3, "textid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 661
a=0;//     const-string v3, "isVip"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static readOnline(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZ)V
a=0;//     .locals 5
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "aId"    # Ljava/lang/String;
a=0;//     .param p2, "textid"    # Ljava/lang/String;
a=0;//     .param p3, "isVip"    # I
a=0;//     .param p4, "imgUrl"    # Ljava/lang/String;
a=0;//     .param p5, "title"    # Ljava/lang/String;
a=0;//     .param p6, "fcdVip"    # I
a=0;//     .param p7, "isOnlineread"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 623
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 624
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/db/LastReadTable;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/db/LastReadTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 625
a=0;//     .local v0, "db":Lcom/twocloo/com/cn/db/LastReadTable;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/LastReadTable;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/LastReadTable;->open()V
a=0;// 
a=0;//     .line 626
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v0, p1, v3}, Lcom/twocloo/com/cn/db/LastReadTable;->queryLastBook(Ljava/lang/String;I)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 627
a=0;//     .local v2, "rd":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/LastReadTable;->close()V
a=0;// 
a=0;//     .line 628
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 629
a=0;//     const-string v3, "textid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 630
a=0;//     const-string v3, "isVip"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 631
a=0;//     const-string v3, "beg"
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/RDBook;->getPosi()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 636
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v3, "isOnline"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 637
a=0;//     const-string v3, "Tag"
a=0;// 
a=0;//     const-string v4, "NovelDetailedActivity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 638
a=0;//     const-string v3, "imgUrl"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 639
a=0;//     const-string v3, "aid"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 640
a=0;//     const-string v3, "title"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 641
a=0;//     const-string v3, "fcdVip"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 642
a=0;//     const/high16 v3, 0x4000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 643
a=0;//     invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 644
a=0;//     return-void
a=0;// 
a=0;//     .line 633
a=0;//     :cond_0
a=0;//     #v3=(One);v4=(Uninit);
a=0;//     const-string v3, "textid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 634
a=0;//     const-string v3, "isVip"
a=0;// 
a=0;//     invoke-virtual {v1, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static renameTempVip(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 14
a=0;//     .param p0, "textid"    # Ljava/lang/String;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "token"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 789
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/Application;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->getCustomChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 790
a=0;//     .local v0, "channel":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/utils/CommonUtils;->getChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 791
a=0;//     .local v4, "model":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/base/util/PhoneUtils;->getPhoneImei(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 792
a=0;//     .local v3, "imei":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     sget v11, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 793
a=0;//     .local v5, "pt":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getVersionCode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 794
a=0;//     .local v9, "v":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "tokentoken"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/common/Util;->md5(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/16 v12, 0xa
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v10, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 796
a=0;//     .local v6, "textToken":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "http://app.2cloo.com/book-prepare_vip_text?textid=%s&ct=android&data=json&token=%s&pt=%s&v=%s&imei=%s&srcid=%s"
a=0;// 
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v11, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     aput-object p0, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     aput-object v6, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     aput-object v5, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     aput-object v9, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     aput-object v3, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     aput-object v0, v11, v12
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 797
a=0;//     .local v2, "fromUrl":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/util/StorageUtils;->convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 799
a=0;//     .local v1, "fromFileName":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "http://app.2cloo.com/book-vip_text?textid=%s&ct=android&data=json&uid=%s&token=%s&srcid=%s&model=%s&imei=%s&pt=%s&v=%s"
a=0;// 
a=0;//     const/16 v11, 0x8
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v11, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     aput-object p0, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     aput-object p1, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     aput-object p2, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     aput-object v0, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v4, v13}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     aput-object v13, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     .line 800
a=0;//     aput-object v3, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     aput-object v5, v11, v12
a=0;// 
a=0;//     const/4 v12, 0x7
a=0;// 
a=0;//     aput-object v9, v11, v12
a=0;// 
a=0;//     .line 799
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 801
a=0;//     .local v8, "toUrl":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/util/StorageUtils;->convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 803
a=0;//     .local v7, "toFileName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "/2cloo/viewdataCache2/"
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->getInstance(Ljava/lang/String;)Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v1, v7}, Lcom/twocloo/base/cache/viewdata/JSONObjectSDCache;->rename(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 804
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static saveLoginStatus(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 710
a=0;//     invoke-static {p0, p1}, Lcom/twocloo/com/cn/common/LocalStore;->setLastUid(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 712
a=0;//     new-instance v0, Ljava/util/Date;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v0}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     .line 713
a=0;//     .local v0, "date":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0}, Ljava/util/Date;->getMonth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/Date;->setMonth(I)V
a=0;// 
a=0;//     .line 714
a=0;//     new-instance v2, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v3, "yyyyMMdd"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 715
a=0;//     .local v1, "endTime":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/twocloo/com/cn/common/LocalStore;->setStime(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 716
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static saveLoginStatus(Landroid/content/Context;Ljava/lang/String;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;//     .locals 2
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "uid"    # Ljava/lang/String;
a=0;//     .param p2, "loginType"    # Lcom/twocloo/com/cn/common/Constants$LoginType;
a=0;// 
a=0;//     .prologue
a=0;//     .line 695
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 703
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 698
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-static {p0, p2}, Lcom/twocloo/com/cn/common/LocalStore;->setLastLoginType(Landroid/content/Context;Lcom/twocloo/com/cn/common/Constants$LoginType;)V
a=0;// 
a=0;//     .line 700
a=0;//     invoke-static {p0, p1}, Lcom/twocloo/com/cn/utils/CommonUtils;->saveLoginStatus(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 702
a=0;//     const-string v0, "login_type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lcom/twocloo/com/cn/common/Constants$LoginType;->name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1}, Lcom/twocloo/base/util/EventLogUtils;->sendEventLog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static sdCardCheck(Landroid/app/Activity;)Z
a=0;//     .locals 11
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1081
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryAvailable()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1083
a=0;//     .local v6, "cardIsAble":Z
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 1084
a=0;//     const-string v0, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u60a8\u7684\u624b\u673a\u65e0SD\u5361\u6216SD\u5361\u4e0d\u53ef\u7528\uff0c\u8bf7\u63d2\u5165SD\u5361\u6216\u786e\u8ba4\u5176\u53ef\u7528\u3002"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1, v5}, Lcom/twocloo/base/util/ViewUtils;->showDialogOnUi(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     move v0, v9
a=0;// 
a=0;//     .line 1122
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1089
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->getAvailableExternalMemorySize()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 1091
a=0;//     .local v7, "sdcardSize":J
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-wide/32 v0, 0x100000
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v7
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 1092
a=0;//     const-string v1, "\u60a8\u7684SD\u5361\u7a7a\u95f4\u4e0d\u8db31M\uff0c\u4e3a\u4e86\u4e0d\u5f71\u54cd\u60a8\u6b63\u5e38\u4f7f\u7528\u8bf7\u53ca\u65f6\u6e05\u7406\u3002"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u6e05\u7406\u6570\u636e"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u53d6\u6d88"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/utils/CommonUtils$3;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/utils/CommonUtils$3;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/utils/CommonUtils$3;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/utils/CommonUtils$3;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/twocloo/base/util/ViewUtils;->confirmOnUi(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     move v0, v9
a=0;// 
a=0;//     .line 1101
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1104
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-wide/32 v0, 0x300000
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     cmp-long v0, v0, v7
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_2
a=0;// 
a=0;//     .line 1105
a=0;//     const-string v1, "\u60a8\u7684SD\u5361\u7a7a\u95f4\u4e0d\u8db33M\uff0c\u4e3a\u4e86\u4e0d\u5f71\u54cd\u60a8\u6b63\u5e38\u4f7f\u7528\u8bf7\u53ca\u65f6\u6e05\u7406\u3002"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u6e05\u7406\u6570\u636e"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u53d6\u6d88"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/utils/CommonUtils$4;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/utils/CommonUtils$4;);
a=0;//     invoke-direct {v4, p0}, Lcom/twocloo/com/cn/utils/CommonUtils$4;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/utils/CommonUtils$4;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static/range {v0 .. v5}, Lcom/twocloo/base/util/ViewUtils;->confirmOnUi(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 1114
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1117
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-wide/32 v0, 0x500000
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     cmp-long v0, v0, v7
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_3
a=0;// 
a=0;//     .line 1118
a=0;//     const-string v0, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u60a8\u7684SD\u5361\u7a7a\u95f4\u4e0d\u8db35M\uff0c\u4e3a\u4e86\u4e0d\u5f71\u54cd\u60a8\u6b63\u5e38\u4f7f\u7528\u8bf7\u624b\u52a8\u53ca\u65f6\u6e05\u7406\u3002"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v1, v5}, Lcom/twocloo/base/util/ViewUtils;->showDialogOnUi(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 1119
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Byte);v1=(LongHi);
a=0;//     move v0, v10
a=0;// 
a=0;//     .line 1122
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1345
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1346
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->night_mode_bg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1350
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1348
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->main_normal_bg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setBackgroundByDayOrNightWithDrawable(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1508
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1509
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->read_menu_bg:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1513
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1511
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->menu_bottom_bg:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1440
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1441
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->button_night_model_light_click_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1445
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1443
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->button_light_click_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setDialogBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1631
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1632
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->relativelayout_night_normal_bg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1636
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1634
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->white:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setEditTextColor(Landroid/app/Activity;Landroid/widget/EditText;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/widget/EditText;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1606
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1607
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->night_textcolor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/EditText;->setTextColor(I)V
a=0;// 
a=0;//     .line 1611
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1609
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/EditText;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1453
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1454
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->book_grade_line_black:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1458
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1456
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->line_s:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setGrayTextColor(Landroid/app/Activity;Landroid/widget/TextView;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/widget/TextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1563
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1564
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->pinglun_night_text:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 1568
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1566
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->gray_text:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1405
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1406
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->relativelayout_night_model_click_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1410
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1408
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->relativelayout_click_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setMainTopBackGrundLayout(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const v3, -0x178e74
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const v2, -0xc44d6a
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1578
a=0;//     #v1=(One);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 1579
a=0;//     const v0, -0xd8d7d3
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1597
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 1581
a=0;//     :cond_1
a=0;//     #v1=(One);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getFristInstall2(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 1582
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 1583
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1585
a=0;//     :cond_2
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1588
a=0;//     :cond_3
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMianTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 1589
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1590
a=0;//     :cond_4
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMianTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1591
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1461
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1462
a=0;//     const v0, -0xc3c3c4
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1466
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1464
a=0;//     :cond_0
a=0;//     const v0, -0x70708
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setNewflagBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1535
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1536
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->newflagbg_night:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1540
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1538
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->newflagbg_day:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setNightSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1469
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1470
a=0;//     const v0, -0xebebec    # -1.9683E38f
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1474
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1472
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->jiange:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setPinglunBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1379
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1380
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->pinglun_night_mode_bg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1384
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1382
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->white:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setPinglunTopicBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1392
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1393
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->pinglun_night_mode_bg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1397
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1395
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->main_normal_bg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setRedButtonbackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1549
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1550
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->login_button_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1554
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1552
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->login_button_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setTabButtonBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1618
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1619
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->tab_button_black_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1623
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1621
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->tab_button_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setTitleItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1426
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1427
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->relativelayout_night_model_click_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1431
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1429
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$color;->main_normal_bg:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setTitlebarBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1319
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1320
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->title_bg_night:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1324
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1322
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->title_bg:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1353
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1354
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getNightTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1358
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1356
a=0;//     :cond_0
a=0;//     const v0, -0x131314
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setUserCenterTitlebarBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const v2, -0xa0a0b
a=0;// 
a=0;//     .line 1332
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1333
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1337
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1335
a=0;//     :cond_0
a=0;//     invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1413
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1414
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->relativelayout_seletor:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1418
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1416
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->relativelayout_click_selector:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setVerticlelineBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1495
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1496
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->verticalline_bg_black:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1500
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1498
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->verticalline:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1366
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1367
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->night_mode_bg:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 1371
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1369
a=0;//     :cond_0
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$color;->white:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setYuepiaoAndTuijianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1521
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1522
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->yuepiao_tuijian_night_bg:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1526
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1524
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->yuepiao_tuijian_day_bg:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setxuxianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1482
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 1483
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->xuxian_black:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 1487
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1485
a=0;//     :cond_0
a=0;//     sget v0, Lcom/twocloo/com/cn/R$drawable;->xuxian:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static share(Landroid/app/Activity;)V
a=0;//     .locals 4
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1640
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 1641
a=0;//     .local v0, "sendIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.SEND"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1642
a=0;//     const-string v1, "text/*"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1643
a=0;//     const-string v1, "android.intent.extra.TEXT"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->share:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1644
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1645
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static shareForSina(Lcom/twocloo/base/openapi/QZoneAble;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "act"    # Lcom/twocloo/base/openapi/QZoneAble;
a=0;//     .param p1, "content"    # Ljava/lang/String;
a=0;//     .param p2, "bookId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 938
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static shareForSinaLogin(Lcom/twocloo/base/openapi/QZoneAble;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p0, "act"    # Lcom/twocloo/base/openapi/QZoneAble;
a=0;//     .param p1, "content"    # Ljava/lang/String;
a=0;//     .param p2, "imageUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 951
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static shareString(Ljava/lang/String;Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1649
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 1650
a=0;//     .local v0, "sendIntent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.SEND"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1651
a=0;//     const-string v1, "text/*"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1652
a=0;//     const-string v1, "android.intent.extra.TEXT"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1653
a=0;//     invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 1654
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static sharelistDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;//     .locals 13
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "firstView"    # Landroid/view/View$OnClickListener;
a=0;//     .param p2, "secondView"    # Landroid/view/View$OnClickListener;
a=0;//     .param p3, "thirdView"    # Landroid/view/View$OnClickListener;
a=0;//     .param p4, "fourthView"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1728
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/ShareDialog;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/ShareDialog;);
a=0;//     sget v12, Lcom/twocloo/com/cn/R$style;->ShareDialog:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-direct {v1, p0, v12}, Lcom/twocloo/com/cn/view/ShareDialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 1729
a=0;//     .local v1, "dialog":Lcom/twocloo/com/cn/view/ShareDialog;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/ShareDialog;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ShareDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1730
a=0;//     .local v10, "window":Landroid/view/Window;
a=0;//     #v10=(Reference,Landroid/view/Window;);
a=0;//     const/16 v12, 0x50
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     invoke-virtual {v10, v12}, Landroid/view/Window;->setGravity(I)V
a=0;// 
a=0;//     .line 1731
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ShareDialog;->show()V
a=0;// 
a=0;//     .line 1732
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1733
a=0;//     .local v11, "windowManager":Landroid/view/WindowManager;
a=0;//     #v11=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v11}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1734
a=0;//     .local v2, "display":Landroid/view/Display;
a=0;//     #v2=(Reference,Landroid/view/Display;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ShareDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v12}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1735
a=0;//     .local v3, "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v3=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-virtual {v2}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     iput v12, v3, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     .line 1736
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/ShareDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v12, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     .line 1738
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->sharelistlayout:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v1, v12}, Lcom/twocloo/com/cn/view/ShareDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 1739
a=0;//     .local v5, "sharelayout":Landroid/widget/LinearLayout;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->titlelayout:I
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Lcom/twocloo/com/cn/view/ShareDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 1740
a=0;//     .local v7, "titlelayout":Landroid/widget/LinearLayout;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->share_sina:I
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Lcom/twocloo/com/cn/view/ShareDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     check-cast v6, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1741
a=0;//     .local v6, "sinaImg":Landroid/widget/TextView;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->share_qq:I
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Lcom/twocloo/com/cn/view/ShareDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1742
a=0;//     .local v4, "qqImg":Landroid/widget/TextView;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->share_wechatpengyouquan:I
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Lcom/twocloo/com/cn/view/ShareDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     check-cast v9, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1743
a=0;//     .local v9, "wechatmomentsImg":Landroid/widget/TextView;
a=0;//     sget v12, Lcom/twocloo/com/cn/R$id;->share_wechatsession:I
a=0;// 
a=0;//     invoke-virtual {v1, v12}, Lcom/twocloo/com/cn/view/ShareDialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     check-cast v8, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 1745
a=0;//     .local v8, "wechatfriendsImg":Landroid/widget/TextView;
a=0;//     invoke-static {p0, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->setDialogBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1746
a=0;//     invoke-static {p0, v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->setYuepiaoAndTuijianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1748
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 1749
a=0;//     invoke-virtual {v6, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1751
a=0;//     :cond_0
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1752
a=0;//     invoke-virtual {v4, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1754
a=0;//     :cond_1
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     .line 1755
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v9, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1756
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 1757
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v8, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 1758
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private static toHexString([B)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "bytes"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     .line 261
a=0;//     #v3=(PosByte);
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 262
a=0;//     .local v1, "sb":Ljava/lang/StringBuffer;
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 266
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit16 v2, v2, 0xf0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 264
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Character;->forDigit(II)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 262
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static webViewSetting(Lcom/twocloo/com/cn/beans/WebView;Landroid/app/Activity;)V
a=0;//     .locals 3
a=0;//     .param p0, "webView"    # Lcom/twocloo/com/cn/beans/WebView;
a=0;//     .param p1, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1215
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
a=0;// 
a=0;//     .line 1216
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V
a=0;// 
a=0;//     .line 1217
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
a=0;// 
a=0;//     .line 1219
a=0;//     sget-object v0, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/base/util/NetUtils;->checkNet()Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/common/NetType;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/common/NetType;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1220
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     .line 1226
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p1, p0}, Lcom/twocloo/com/cn/common/JavaScript;->newInstance(Landroid/app/Activity;Landroid/webkit/WebView;)Lcom/twocloo/com/cn/common/JavaScript;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "twocloo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/beans/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1227
a=0;//     return-void
a=0;// 
a=0;//     .line 1222
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/beans/WebView;->getSettings()Landroid/webkit/WebSettings;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebSettings;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
