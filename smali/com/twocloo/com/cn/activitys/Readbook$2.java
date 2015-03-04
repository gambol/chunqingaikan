package com.twocloo.com.cn.activitys; class Readbook$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/Readbook$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Readbook.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/Readbook;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 445
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 22
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .line 448
a=0;//     .local v19, "ret":Z
a=0;//     #v19=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_1c
a=0;// 
a=0;//     .line 449
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1a
a=0;// 
a=0;//     .line 450
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/twocloo/com/cn/view/PageWidget;->calcCornerXY(FF)V
a=0;// 
a=0;//     .line 452
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 454
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/PageWidget;->isDragToRight()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     .line 455
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$0(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$1(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;// 
a=0;//     .line 459
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->prePage()V
a=0;// 
a=0;//     .line 461
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$2(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 462
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 463
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 470
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->isfirstPage()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_18
a=0;// 
a=0;//     .line 471
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 472
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$3(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$4(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;// 
a=0;//     .line 473
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getPreVip()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v1, v3, :cond_8
a=0;// 
a=0;//     .line 475
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 476
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 480
a=0;//     .local v2, "uid":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v12, Ljava/io/File;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Constants;->getCacheFilePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v12, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 481
a=0;//     .local v12, "cacheFile":Ljava/io/File;
a=0;//     #v12=(Reference,Ljava/io/File;);
a=0;//     const-string v21, ""
a=0;// 
a=0;//     .line 482
a=0;//     .local v21, "update_time":Ljava/lang/String;
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$5(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$6(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 484
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$5(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v15=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 489
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "/"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "_"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 490
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "_"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ".txt"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 489
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$8(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/io/File;)V
a=0;// 
a=0;//     .line 491
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$9(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 492
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 493
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$10(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 494
a=0;//     new-instance v10, Ljava/lang/Thread;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v2, v3, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .end local v2    # "uid":Ljava/lang/String;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0xb
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/RDBook;->getPreVip()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v7, v7, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/Readbook;->access$11(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 495
a=0;//     #v8=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v9, v9, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-direct/range {v1 .. v9}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     .line 494
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-direct {v10, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 495
a=0;//     #v10=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 530
a=0;//     .end local v12    # "cacheFile":Ljava/io/File;
a=0;//     .end local v21    # "update_time":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v18=(Conflicted);v20=(Conflicted);v21=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 662
a=0;//     :goto_3
a=0;//     #v1=(Boolean);v3=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);v19=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 465
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Uninit);v4=(Integer);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Null);v20=(Uninit);v21=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 467
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     .line 468
a=0;//     .local v13, "e1":Ljava/io/IOException;
a=0;//     #v13=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 484
a=0;//     .end local v13    # "e1":Ljava/io/IOException;
a=0;//     .restart local v2    # "uid":Ljava/lang/String;
a=0;//     .restart local v12    # "cacheFile":Ljava/io/File;
a=0;//     .restart local v21    # "update_time":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Reference,Ljava/lang/String;);v3=(Boolean);v12=(Reference,Ljava/io/File;);v13=(Conflicted);v15=(Conflicted);v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v15, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 485
a=0;//     .local v15, "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 486
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getUpdate_time()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 497
a=0;//     .end local v15    # "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v3=(Reference,Ljava/io/File;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v15=(Conflicted);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/RDBook;->getPreVip()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v7, v7, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct/range {v1 .. v7}, Lcom/twocloo/com/cn/view/VipChapterOrder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 501
a=0;//     .end local v2    # "uid":Ljava/lang/String;
a=0;//     .end local v12    # "cacheFile":Ljava/io/File;
a=0;//     .end local v21    # "update_time":Ljava/lang/String;
a=0;//     :cond_6
a=0;//     #v2=(Uninit);v3=(One);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v12=(Uninit);v15=(Uninit);v21=(Uninit);
a=0;//     new-instance v20, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v20=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 502
a=0;//     .local v20, "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);v20=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 503
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 504
a=0;//     .local v18, "recodeIds":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 505
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     .line 506
a=0;//     #v20=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 507
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$12(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 509
a=0;//     :cond_7
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/16 v6, 0xc
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/RDBook;->getPreVip()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 510
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v9, v9, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/Readbook;->access$11(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v11, v11, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-direct/range {v3 .. v11}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     .line 509
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 510
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 514
a=0;//     .end local v18    # "recodeIds":Ljava/lang/String;
a=0;//     .end local v20    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :cond_8
a=0;//     #v1=(Integer);v3=(One);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v18=(Uninit);v20=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0xb
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v1, v3, v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$13(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     .line 515
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$14(Lcom/twocloo/com/cn/activitys/Readbook;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     .line 516
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 517
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getPreId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$10(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 518
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/16 v6, 0xb
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/RDBook;->getPreVip()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v9, v9, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/Readbook;->access$11(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 519
a=0;//     #v10=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v11, v11, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-direct/range {v3 .. v11}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     .line 518
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 519
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 521
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 524
a=0;//     :cond_a
a=0;//     #v1=(Reference,Ujava/lang/Object;);v3=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->isFromWeb:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 525
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     const-string v3, "\u5df2\u7ecf\u662f\u7b2c\u4e00\u7ae0\u4e86\uff01"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 535
a=0;//     :cond_c
a=0;//     #v1=(Boolean);v4=(Float);v13=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$0(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$1(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;// 
a=0;//     .line 540
a=0;//     :try_start_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->nextPage()V
a=0;// 
a=0;//     .line 542
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$2(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v4, v4, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufBegin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 543
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 544
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getAnimationin2()Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 551
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/BookPageFactory;->islastPage()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_18
a=0;// 
a=0;//     .line 552
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_e
a=0;// 
a=0;//     .line 553
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 546
a=0;//     :cond_d
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v4=(Integer);v13=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 548
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v13
a=0;// 
a=0;//     .line 549
a=0;//     .restart local v13    # "e1":Ljava/io/IOException;
a=0;//     #v13=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 555
a=0;//     .end local v13    # "e1":Ljava/io/IOException;
a=0;//     :cond_e
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v13=(Conflicted);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 556
a=0;//     .local v17, "j":I
a=0;//     #v17=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 557
a=0;//     .local v16, "isfind":Z
a=0;//     #v16=(Null);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     :try_start_4
a=0;//     #v1=(Conflicted);v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$5(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v1, :cond_11
a=0;// 
a=0;//     .line 563
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v16=(Boolean);
a=0;//     if-eqz v16, :cond_f
a=0;// 
a=0;//     .line 564
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     .line 565
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$5(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcom/twocloo/com/cn/beans/RDBook;->setNextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 566
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$5(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v3, v1}, Lcom/twocloo/com/cn/beans/RDBook;->setNextVip(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 572
a=0;//     :cond_f
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v14=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_17
a=0;// 
a=0;//     .line 573
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$3(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$4(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;// 
a=0;//     .line 574
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getNextVip()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v1, v3, :cond_15
a=0;// 
a=0;//     .line 576
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_13
a=0;// 
a=0;//     .line 577
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 578
a=0;//     .restart local v2    # "uid":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/RDBook;->getNextVip()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v7, v7, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-direct/range {v1 .. v7}, Lcom/twocloo/com/cn/view/VipChapterOrder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 628
a=0;//     .end local v2    # "uid":Ljava/lang/String;
a=0;//     :cond_10
a=0;//     :goto_8
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v18=(Conflicted);v20=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 558
a=0;//     :cond_11
a=0;//     :try_start_5
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v14=(Uninit);v16=(Null);v18=(Uninit);v20=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$5(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_12
a=0;// 
a=0;//     .line 559
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 560
a=0;//     #v16=(One);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 557
a=0;//     :cond_12
a=0;//     #v16=(Null);
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 568
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v16=(Boolean);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 569
a=0;//     .local v14, "e2":Ljava/lang/Exception;
a=0;//     #v14=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v14}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 580
a=0;//     .end local v14    # "e2":Ljava/lang/Exception;
a=0;//     :cond_13
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/Readbook$2;);v1=(Reference,Lcom/twocloo/com/cn/beans/User;);v3=(One);v14=(Conflicted);
a=0;//     new-instance v20, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v20=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-direct {v0, v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 581
a=0;//     .restart local v20    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);v20=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 582
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     .line 583
a=0;//     .restart local v18    # "recodeIds":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v20 .. v20}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 584
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     .line 585
a=0;//     #v20=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_14
a=0;// 
a=0;//     .line 586
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$12(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 588
a=0;//     :cond_14
a=0;//     #v1=(Boolean);
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/16 v6, 0xc
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/RDBook;->getNextVip()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     .line 589
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v9, v9, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/Readbook;->access$11(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v11, v11, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-direct/range {v3 .. v11}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     .line 588
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 589
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 595
a=0;//     .end local v18    # "recodeIds":Ljava/lang/String;
a=0;//     .end local v20    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :cond_15
a=0;//     #v1=(Integer);v3=(One);v4=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v18=(Uninit);v20=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v1, v3, v4}, Lcom/twocloo/com/cn/activitys/Readbook;->access$13(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_16
a=0;// 
a=0;//     .line 596
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     const-string v4, "\u6b63\u5728\u52a0\u8f7d,\u8bf7\u7a0d\u5019..."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$14(Lcom/twocloo/com/cn/activitys/Readbook;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     .line 597
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->addMark:Landroid/widget/ImageView;
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 598
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getNextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$10(Lcom/twocloo/com/cn/activitys/Readbook;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 602
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/threads/GetTextThread;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->access$7(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/16 v6, 0xc
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/RDBook;->getNextVip()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v9, v9, Lcom/twocloo/com/cn/activitys/Readbook;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/Readbook;->access$11(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 603
a=0;//     #v10=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v11, v11, Lcom/twocloo/com/cn/activitys/Readbook;->readBookShareListener:Lcom/twocloo/com/cn/common/ReadBookShareListener;
a=0;// 
a=0;//     invoke-direct/range {v3 .. v11}, Lcom/twocloo/com/cn/threads/GetTextThread;-><init>(Ljava/lang/String;Ljava/lang/String;IILcom/twocloo/com/cn/activitys/Readbook;Landroid/os/Handler;ZLcom/twocloo/com/cn/common/ReadBookShareListener;)V
a=0;// 
a=0;//     .line 602
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/threads/GetTextThread;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 603
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 605
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$15(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$16(Lcom/twocloo/com/cn/activitys/Readbook;I)V
a=0;// 
a=0;//     .line 612
a=0;//     :cond_16
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 623
a=0;//     :cond_17
a=0;//     #v1=(Reference,Ljava/lang/String;);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_10
a=0;// 
a=0;//     .line 624
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/beans/RDBook;->getFinishflag()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/activitys/Readbook;->getRd()Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/Readbook;->access$17(Lcom/twocloo/com/cn/activitys/Readbook;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v1, v3, v4, v5}, Lcom/twocloo/com/cn/utils/CommonUtils;->doReadLastPage(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 625
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     const-string v3, "\u4eb2\uff0c\u5df2\u7ecf\u662f\u6700\u540e\u4e00\u7ae0\u5566~"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->Toast(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 632
a=0;//     .end local v16    # "isfind":Z
a=0;//     .end local v17    # "j":I
a=0;//     :cond_18
a=0;//     #v1=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);v14=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->mNextPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 634
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/activitys/Readbook;->mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/twocloo/com/cn/view/PageWidget;->setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 637
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$18(Lcom/twocloo/com/cn/activitys/Readbook;)V
a=0;// 
a=0;//     .line 639
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$19(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$0(Lcom/twocloo/com/cn/activitys/Readbook;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v1, v3, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$20(Lcom/twocloo/com/cn/activitys/Readbook;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->aid:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v1, :cond_19
a=0;// 
a=0;//     .line 640
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v1, v3}, Lcom/twocloo/com/cn/activitys/Readbook;->access$21(Lcom/twocloo/com/cn/activitys/Readbook;Z)V
a=0;// 
a=0;//     .line 649
a=0;//     :cond_19
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$22(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1a
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->access$22(Lcom/twocloo/com/cn/activitys/Readbook;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/RDBook;->getOrder()I
a=0;// 
a=0;//     .line 654
a=0;//     :cond_1a
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/PageWidget;->abortAnimation()V
a=0;// 
a=0;//     .line 655
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     iget-object v1, v1, Lcom/twocloo/com/cn/activitys/Readbook;->mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/view/PageWidget;->doTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 656
a=0;//     #v19=(Boolean);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/common/Util;->getAndroidSDKVersion()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ge v1, v3, :cond_1b
a=0;// 
a=0;//     .line 657
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/Readbook;->getPagefactory()Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/activitys/Readbook$2;->this$0:Lcom/twocloo/com/cn/activitys/Readbook;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/Readbook;);
a=0;//     iget-object v3, v3, Lcom/twocloo/com/cn/activitys/Readbook;->mCurPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     :cond_1b
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     .line 659
a=0;//     #v1=(Boolean);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 662
a=0;//     :cond_1c
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);v3=(Uninit);v4=(Uninit);v13=(Uninit);v19=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_3
a=0;// .end method
}}
