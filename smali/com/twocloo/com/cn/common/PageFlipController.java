package com.twocloo.com.cn.common; class PageFlipController { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PageFlipController.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "WrongCall"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/common/PageFlipController$TouchPageFlipListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static instance:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/common/PageFlipController;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/common/PageFlipController;->instance:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/common/PageFlipController;Lcom/twocloo/com/cn/activitys/ReadbookDown;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     invoke-direct {p0, p1, p2}, Lcom/twocloo/com/cn/common/PageFlipController;->showDL(Lcom/twocloo/com/cn/activitys/ReadbookDown;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/common/PageFlipController;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/PageFlipController;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/common/PageFlipController;Lcom/twocloo/com/cn/activitys/ReadbookDown;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/common/PageFlipController;->doNextPage(Lcom/twocloo/com/cn/activitys/ReadbookDown;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private doNextPage(Lcom/twocloo/com/cn/activitys/ReadbookDown;)Z
a=0;//     .locals 20
a=0;//     .param p1, "touchPageFlipContext"    # Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 210
a=0;//     .local v4, "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmNextPageCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 213
a=0;//     .local v16, "mNextPageCanvas":Landroid/graphics/Canvas;
a=0;//     #v16=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getTxMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .line 214
a=0;//     .local v19, "txMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v19=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAddMark()Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 215
a=0;//     .local v5, "addMark":Landroid/widget/ImageView;
a=0;//     #v5=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 216
a=0;//     .local v7, "animationout3":Landroid/view/animation/AlphaAnimation;
a=0;//     #v7=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 218
a=0;//     .local v6, "animationin2":Landroid/view/animation/Animation;
a=0;//     #v6=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 219
a=0;//     .local v13, "file":Ljava/io/File;
a=0;//     #v13=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 221
a=0;//     .local v9, "aid":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getFinishFlag()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 223
a=0;//     .local v14, "finishFlag":I
a=0;//     :try_start_0
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/view/BookPageFactory;->nextPage()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 234
a=0;//     :goto_0
a=0;//     #v12=(Conflicted);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/view/BookPageFactory;->islastPage()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 236
a=0;//     .local v11, "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextvip()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     .line 237
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v18, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v18=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 242
a=0;//     .local v18, "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);v18=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual/range {v18 .. v18}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 243
a=0;//     const-string v2, "-1"
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 244
a=0;//     .local v17, "recodeIds":Ljava/lang/String;
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v18}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 245
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 246
a=0;//     #v18=(Null);
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 247
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lcom/twocloo/com/cn/common/PageFlipController;->showDL(Lcom/twocloo/com/cn/activitys/ReadbookDown;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 266
a=0;//     .end local v4    # "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     .end local v5    # "addMark":Landroid/widget/ImageView;
a=0;//     .end local v6    # "animationin2":Landroid/view/animation/Animation;
a=0;//     .end local v7    # "animationout3":Landroid/view/animation/AlphaAnimation;
a=0;//     .end local v17    # "recodeIds":Ljava/lang/String;
a=0;//     .end local v18    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 304
a=0;//     .end local v11    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 225
a=0;//     .restart local v4    # "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     .restart local v5    # "addMark":Landroid/widget/ImageView;
a=0;//     .restart local v6    # "animationin2":Landroid/view/animation/Animation;
a=0;//     .restart local v7    # "animationout3":Landroid/view/animation/AlphaAnimation;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Reference,Landroid/view/animation/Animation;);v8=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     move-exception v12
a=0;// 
a=0;//     .line 226
a=0;//     .local v12, "e1":Ljava/io/IOException;
a=0;//     #v12=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v12}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 251
a=0;//     .end local v12    # "e1":Ljava/io/IOException;
a=0;//     .restart local v11    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .restart local v17    # "recodeIds":Ljava/lang/String;
a=0;//     .restart local v18    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v11=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);v12=(Conflicted);v17=(Reference,Ljava/lang/String;);v18=(Null);
a=0;//     new-instance v15, Landroid/content/Intent;
a=0;// 
a=0;//     #v15=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v15, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 252
a=0;//     .local v15, "intent":Landroid/content/Intent;
a=0;//     #v15=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "textid"
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v15, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 253
a=0;//     const-string v2, "isVip"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v15, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 254
a=0;//     const-string v2, "aid"
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v15, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 255
a=0;//     const-string v2, "title"
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v15, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 256
a=0;//     const/high16 v2, 0x4000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v15, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 257
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->finish()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 261
a=0;//     .end local v15    # "intent":Landroid/content/Intent;
a=0;//     .end local v17    # "recodeIds":Ljava/lang/String;
a=0;//     .end local v18    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Lcom/twocloo/com/cn/beans/User;);v3=(One);v15=(Uninit);v17=(Uninit);v18=(Uninit);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     iput-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 263
a=0;//     new-instance v2, Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/common/PageFlipController;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .end local v4    # "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .end local v5    # "addMark":Landroid/widget/ImageView;
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextvip()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 264
a=0;//     .end local v6    # "animationin2":Landroid/view/animation/Animation;
a=0;//     #v6=(Integer);
a=0;//     new-instance v8, Landroid/os/Handler;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v8}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Landroid/os/Handler;);
a=0;//     move-object/from16 v7, p1
a=0;// 
a=0;//     .line 263
a=0;//     invoke-direct/range {v2 .. v8}, Lcom/twocloo/com/cn/view/VipChapterOrder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 268
a=0;//     .restart local v4    # "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     .restart local v5    # "addMark":Landroid/widget/ImageView;
a=0;//     .restart local v6    # "animationin2":Landroid/view/animation/Animation;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Integer);v3=(Conflicted);v6=(Reference,Landroid/view/animation/Animation;);v8=(Uninit);
a=0;//     if-eqz v11, :cond_5
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 271
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 272
a=0;//     .local v10, "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     if-eqz v10, :cond_4
a=0;// 
a=0;//     .line 274
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setCurChapterinfo(Lcom/twocloo/com/cn/beans/Chapterinfo;)V
a=0;// 
a=0;//     .line 275
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 277
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getPosi()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getLen()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v4, v13, v2, v3, v8}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;III)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 294
a=0;//     .end local v10    # "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v11    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 295
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getSqmap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/HashMap;);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     .line 294
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcom/twocloo/com/cn/common/PageFlipController;->hasBookMark(Lcom/twocloo/com/cn/beans/Chapterinfo;Lcom/twocloo/com/cn/view/BookPageFactory;Landroid/widget/ImageView;Landroid/view/animation/Animation;Landroid/view/animation/AlphaAnimation;Ljava/util/HashMap;)V
a=0;// 
a=0;//     .line 304
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 278
a=0;//     .restart local v10    # "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .restart local v11    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :catch_1
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);v3=(Conflicted);v8=(Conflicted);v10=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);v11=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     move-exception v12
a=0;// 
a=0;//     .line 279
a=0;//     .restart local v12    # "e1":Ljava/io/IOException;
a=0;//     #v12=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v12}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 283
a=0;//     .end local v12    # "e1":Ljava/io/IOException;
a=0;//     :cond_4
a=0;//     #v2=(Reference,Ljava/lang/String;);v8=(Uninit);v12=(Conflicted);
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v14, v9, v2}, Lcom/twocloo/com/cn/utils/CommonUtils;->doReadLastPage(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 284
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 289
a=0;//     .end local v10    # "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v2=(Conflicted);v10=(Uninit);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getMul()Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v11}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 289
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-static {v0, v14, v2, v3}, Lcom/twocloo/com/cn/utils/CommonUtils;->doReadLastPage(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 291
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance()Lcom/twocloo/com/cn/common/PageFlipController;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     sget-object v0, Lcom/twocloo/com/cn/common/PageFlipController;->instance:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private hasBookMark(Lcom/twocloo/com/cn/beans/Chapterinfo;Lcom/twocloo/com/cn/view/BookPageFactory;Landroid/widget/ImageView;Landroid/view/animation/Animation;Landroid/view/animation/AlphaAnimation;Ljava/util/HashMap;)V
a=0;//     .locals 2
a=0;//     .param p1, "curChapterinfo"    # Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .param p2, "pagefactory"    # Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     .param p3, "addMark"    # Landroid/widget/ImageView;
a=0;//     .param p4, "animationin2"    # Landroid/view/animation/Animation;
a=0;//     .param p5, "animationout3"    # Landroid/view/animation/AlphaAnimation;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/twocloo/com/cn/beans/Chapterinfo;",
a=0;//             "Lcom/twocloo/com/cn/view/BookPageFactory;",
a=0;//             "Landroid/widget/ImageView;",
a=0;//             "Landroid/view/animation/Animation;",
a=0;//             "Landroid/view/animation/AlphaAnimation;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 365
a=0;//     .local p6, "sqmap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p2, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p6, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 366
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 367
a=0;//     invoke-virtual {p3, p4}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 374
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 369
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p3}, Landroid/widget/ImageView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 370
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {p3, p5}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private showDL(Lcom/twocloo/com/cn/activitys/ReadbookDown;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "act"    # Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;//     .param p2, "textid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     const-string v0, "ReadbookDown"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->goToLogin(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public doPrePage(Lcom/twocloo/com/cn/activitys/ReadbookDown;)Z
a=0;//     .locals 14
a=0;//     .param p1, "touchPageFlipContext"    # Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 311
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 312
a=0;//     .local v2, "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmNextPageCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 315
a=0;//     .local v11, "mNextPageCanvas":Landroid/graphics/Canvas;
a=0;//     #v11=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getTxMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 316
a=0;//     .local v12, "txMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     #v12=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAddMark()Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 317
a=0;//     .local v3, "addMark":Landroid/widget/ImageView;
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationout3()Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 318
a=0;//     .local v5, "animationout3":Landroid/view/animation/AlphaAnimation;
a=0;//     #v5=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 320
a=0;//     .local v4, "animationin2":Landroid/view/animation/Animation;
a=0;//     #v4=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 324
a=0;//     .local v10, "file":Ljava/io/File;
a=0;//     :try_start_0
a=0;//     #v10=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->prePage()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 328
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->isfirstPage()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 329
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 330
a=0;//     .local v8, "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getPreid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 331
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getPreid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v12, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 332
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getPreid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 333
a=0;//     .local v7, "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {p1, v7}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->setCurChapterinfo(Lcom/twocloo/com/cn/beans/Chapterinfo;)V
a=0;// 
a=0;//     .line 336
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/view/BookPageFactory;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 338
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getPosi()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getLen()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v2, v10, v0, v1, v6}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;III)V
a=0;// 
a=0;//     .line 339
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->last()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 349
a=0;//     .end local v7    # "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v8    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 350
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getSqmap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 349
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/com/cn/common/PageFlipController;->hasBookMark(Lcom/twocloo/com/cn/beans/Chapterinfo;Lcom/twocloo/com/cn/view/BookPageFactory;Landroid/widget/ImageView;Landroid/view/animation/Animation;Landroid/view/animation/AlphaAnimation;Ljava/util/HashMap;)V
a=0;// 
a=0;//     move v0, v13
a=0;// 
a=0;//     .line 356
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 325
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 326
a=0;//     .local v9, "e1":Ljava/io/IOException;
a=0;//     #v9=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v9}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 340
a=0;//     .end local v9    # "e1":Ljava/io/IOException;
a=0;//     .restart local v7    # "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .restart local v8    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :catch_1
a=0;//     #v0=(Null);v1=(Conflicted);v6=(Conflicted);v7=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);v8=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 341
a=0;//     .restart local v9    # "e1":Ljava/io/IOException;
a=0;//     #v9=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v9}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 346
a=0;//     .end local v7    # "cinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v9    # "e1":Ljava/io/IOException;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public handler(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;//     .locals 10
a=0;//     .param p1, "touchPageFlipContext"    # Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmPageWidget()Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "mPageWidget":Lcom/twocloo/com/cn/view/PageWidget;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 60
a=0;//     .local v3, "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmCurPageCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 61
a=0;//     .local v4, "mCurPageCanvas":Landroid/graphics/Canvas;
a=0;//     #v4=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmCurPageBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 62
a=0;//     .local v7, "mCurPageBitmap":Landroid/graphics/Bitmap;
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmNextPageBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 63
a=0;//     .local v8, "mNextPageBitmap":Landroid/graphics/Bitmap;
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmNextPageCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 64
a=0;//     .local v6, "mNextPageCanvas":Landroid/graphics/Canvas;
a=0;//     #v6=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getMul()Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 67
a=0;//     .local v9, "mul":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/PageFlipController$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/PageFlipController$1;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-direct/range {v0 .. v9}, Lcom/twocloo/com/cn/common/PageFlipController$1;-><init>(Lcom/twocloo/com/cn/common/PageFlipController;Lcom/twocloo/com/cn/view/PageWidget;Lcom/twocloo/com/cn/view/BookPageFactory;Landroid/graphics/Canvas;Lcom/twocloo/com/cn/activitys/ReadbookDown;Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController$1;);
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/view/PageWidget;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public initPage(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;//     .locals 8
a=0;//     .param p1, "touchPageFlipContext"    # Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 189
a=0;//     .local v4, "pagefactory":Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 190
a=0;//     .local v0, "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 191
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmNextPageCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 192
a=0;//     .local v3, "mNextPageCanvas":Landroid/graphics/Canvas;
a=0;//     #v3=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getmCurPageCanvas()Landroid/graphics/Canvas;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 194
a=0;//     .local v2, "mCurPageCanvas":Landroid/graphics/Canvas;
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getBeg()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getPosi()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getLen()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v1, v5, v6, v7}, Lcom/twocloo/com/cn/view/BookPageFactory;->openbook(Ljava/io/File;III)V
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getSubhead()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/view/BookPageFactory;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 196
a=0;//     invoke-virtual {v4, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {v4, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 201
a=0;//     return-void
a=0;// .end method
}}
