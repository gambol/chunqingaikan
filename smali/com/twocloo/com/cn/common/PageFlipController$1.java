package com.twocloo.com.cn.common; class PageFlipController$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/common/PageFlipController$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PageFlipController.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/common/PageFlipController;->handler(Lcom/twocloo/com/cn/activitys/ReadbookDown;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;// .field private final synthetic val$mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private final synthetic val$mCurPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;// .field private final synthetic val$mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private final synthetic val$mNextPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;// .field private final synthetic val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;// .field private final synthetic val$mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;// .field private final synthetic val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;// .field private final synthetic val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/common/PageFlipController;Lcom/twocloo/com/cn/view/PageWidget;Lcom/twocloo/com/cn/view/BookPageFactory;Landroid/graphics/Canvas;Lcom/twocloo/com/cn/activitys/ReadbookDown;Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/twocloo/com/cn/beans/Shubenmulu;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->this$0:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mCurPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     iput-object p6, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mNextPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     iput-object p7, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iput-object p8, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iput-object p9, p0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 16
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     .local v14, "ret":Z
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/PageFlipController$1;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_9
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 73
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/view/PageWidget;->calcCornerXY(FF)V
a=0;// 
a=0;//     .line 76
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mCurPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 79
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/PageWidget;->isDragToRight()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->this$0:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/common/PageFlipController;->doPrePage(Lcom/twocloo/com/cn/activitys/ReadbookDown;)Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 82
a=0;//     .local v12, "isFirst":Z
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_7
a=0;// 
a=0;//     move v1, v14
a=0;// 
a=0;//     .line 171
a=0;//     .end local v12    # "isFirst":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Boolean);v15=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);v3=(Float);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Null);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget v1, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufEnd:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     iget v2, v2, Lcom/twocloo/com/cn/view/BookPageFactory;->m_mbBufLen:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_3
a=0;// 
a=0;//     .line 88
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     .line 97
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 98
a=0;//     .local v8, "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     iget-boolean v1, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     const-string v1, "201999"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 102
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 134
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->this$0:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/PageFlipController;->access$2(Lcom/twocloo/com/cn/common/PageFlipController;Lcom/twocloo/com/cn/activitys/ReadbookDown;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 135
a=0;//     .local v11, "isEnd":Z
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_7
a=0;// 
a=0;//     move v1, v14
a=0;// 
a=0;//     .line 136
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     .end local v8    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v11    # "isEnd":Z
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Integer);v3=(Float);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 102
a=0;//     .restart local v8    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v2=(Boolean);v3=(Conflicted);v8=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);v10=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 103
a=0;//     .local v10, "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v15, Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;// 
a=0;//     #v15=(UninitRef,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     invoke-direct {v15, v1}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 105
a=0;//     .local v15, "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     #v15=(Reference,Lcom/twocloo/com/cn/db/RecodeHistoryTable;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->open()V
a=0;// 
a=0;//     .line 106
a=0;//     const-string v1, "-1"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v15, v1, v2}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->queryRecordHistroy(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 107
a=0;//     .local v13, "recodeIds":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v15}, Lcom/twocloo/com/cn/db/RecodeHistoryTable;->close()V
a=0;// 
a=0;//     .line 108
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 109
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v13, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 110
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->this$0:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloo/com/cn/common/PageFlipController;->access$0(Lcom/twocloo/com/cn/common/PageFlipController;Lcom/twocloo/com/cn/activitys/ReadbookDown;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 111
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 117
a=0;//     .end local v10    # "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v13    # "recodeIds":Ljava/lang/String;
a=0;//     .end local v15    # "rt":Lcom/twocloo/com/cn/db/RecodeHistoryTable;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 118
a=0;//     .local v9, "e2":Ljava/lang/Exception;
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 120
a=0;//     .end local v9    # "e2":Ljava/lang/Exception;
a=0;//     :cond_5
a=0;//     #v3=(Float);v9=(Uninit);v10=(Uninit);v13=(Uninit);v15=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/BookPageFactory;);
a=0;//     iget-boolean v1, v1, Lcom/twocloo/com/cn/view/BookPageFactory;->m_islastPage:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const-string v1, "201999"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 122
a=0;//     :try_start_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/Util;->read(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getMulist()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     .line 124
a=0;//     .restart local v10    # "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getNextid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_6
a=0;// 
a=0;//     .line 125
a=0;//     new-instance v1, Lcom/twocloo/com/cn/view/VipChapterOrder;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->this$0:Lcom/twocloo/com/cn/common/PageFlipController;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/PageFlipController;->access$1(Lcom/twocloo/com/cn/common/PageFlipController;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getAid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getIs_vip()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 126
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);
a=0;//     new-instance v7, Landroid/os/Handler;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v7}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     .line 125
a=0;//     #v7=(Reference,Landroid/os/Handler;);
a=0;//     invoke-direct/range {v1 .. v7}, Lcom/twocloo/com/cn/view/VipChapterOrder;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Landroid/os/Handler;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 127
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/VipChapterOrder;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     .end local v10    # "info":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 131
a=0;//     .restart local v9    # "e2":Ljava/lang/Exception;
a=0;//     #v9=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 141
a=0;//     .end local v8    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     .end local v9    # "e2":Ljava/lang/Exception;
a=0;//     :cond_7
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/PageFlipController;);v2=(Reference,Lcom/twocloo/com/cn/activitys/ReadbookDown;);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$pagefactory:Lcom/twocloo/com/cn/view/BookPageFactory;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mNextPageCanvas:Landroid/graphics/Canvas;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/view/BookPageFactory;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 144
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mCurPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mNextPageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v1, v2, v3}, Lcom/twocloo/com/cn/view/PageWidget;->setBitmaps(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 147
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->saveLastRead()V
a=0;// 
a=0;//     .line 150
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$touchPageFlipContext:Lcom/twocloo/com/cn/activitys/ReadbookDown;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/ReadbookDown;->getCurChapterinfo()Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 151
a=0;//     .restart local v8    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     if-eqz v8, :cond_8
a=0;// 
a=0;//     .line 152
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getFcvip()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 153
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getDisplayorder()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/Chapterinfo;->getDisplayorder()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mul:Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/Shubenmulu;->getFcvip()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_8
a=0;// 
a=0;//     .line 154
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 166
a=0;//     .end local v8    # "curChapterinfo":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/view/PageWidget;->abortAnimation()V
a=0;// 
a=0;//     .line 167
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/common/PageFlipController$1;->val$mPageWidget:Lcom/twocloo/com/cn/view/PageWidget;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/view/PageWidget;->doTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     move v1, v14
a=0;// 
a=0;//     .line 169
a=0;//     #v1=(Boolean);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_9
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/PageWidget;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Null);v15=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
