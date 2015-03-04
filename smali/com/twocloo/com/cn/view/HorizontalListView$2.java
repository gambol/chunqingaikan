package com.twocloo.com.cn.view; class HorizontalListView$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/HorizontalListView$2;
a=0;// .super Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// .source "HorizontalListView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/HorizontalListView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     .line 286
a=0;//     invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private isEventWithinView(Landroid/view/MotionEvent;Landroid/view/View;)Z
a=0;//     .locals 8
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     new-instance v5, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 347
a=0;//     .local v5, "viewRect":Landroid/graphics/Rect;
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     new-array v1, v6, [I
a=0;// 
a=0;//     .line 348
a=0;//     .local v1, "childPosition":[I
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p2, v1}, Landroid/view/View;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 349
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aget v2, v1, v6
a=0;// 
a=0;//     .line 350
a=0;//     .local v2, "left":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int v3, v2, v6
a=0;// 
a=0;//     .line 351
a=0;//     .local v3, "right":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget v4, v1, v6
a=0;// 
a=0;//     .line 352
a=0;//     .local v4, "top":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int v0, v4, v6
a=0;// 
a=0;//     .line 353
a=0;//     .local v0, "bottom":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v5, v2, v4, v3, v0}, Landroid/graphics/Rect;->set(IIII)V
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/graphics/Rect;->contains(II)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     return v6
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-virtual {v0, p1}, Lcom/twocloo/com/cn/view/HorizontalListView;->onDown(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 1
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Lcom/twocloo/com/cn/view/HorizontalListView;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onLongPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 8
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 331
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 332
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .local v7, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v7=(Integer);
a=0;//     if-lt v7, v6, :cond_1
a=0;// 
a=0;//     .line 343
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 333
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 334
a=0;//     .local v2, "child":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, p1, v2}, Lcom/twocloo/com/cn/view/HorizontalListView$2;->isEventWithinView(Landroid/view/MotionEvent;Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$7(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemLongClickListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$7(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemLongClickListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$5(Lcom/twocloo/com/cn/view/HorizontalListView;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     add-int/2addr v3, v7
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$5(Lcom/twocloo/com/cn/view/HorizontalListView;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     add-int/2addr v5, v7
a=0;// 
a=0;//     invoke-interface {v4, v5}, Landroid/widget/ListAdapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 336
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 332
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     add-int/lit8 v7, v7, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 4
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "distanceX"    # F
a=0;//     .param p4, "distanceY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 302
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-int v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, v0, Lcom/twocloo/com/cn/view/HorizontalListView;->mNextX:I
a=0;// 
a=0;//     .line 301
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->requestLayout()V
a=0;// 
a=0;//     .line 306
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     .line 301
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v6=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v6, v0, :cond_1
a=0;// 
a=0;//     .line 326
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// 
a=0;//     .line 312
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/view/HorizontalListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 313
a=0;//     .local v2, "child":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, p1, v2}, Lcom/twocloo/com/cn/view/HorizontalListView$2;->isEventWithinView(Landroid/view/MotionEvent;Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$4(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$4(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 316
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$5(Lcom/twocloo/com/cn/view/HorizontalListView;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     add-int/2addr v3, v6
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$5(Lcom/twocloo/com/cn/view/HorizontalListView;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     invoke-interface {v4, v5}, Landroid/widget/ListAdapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;// 
a=0;//     .line 318
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$6(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$6(Lcom/twocloo/com/cn/view/HorizontalListView;)Landroid/widget/AdapterView$OnItemSelectedListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v3}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$5(Lcom/twocloo/com/cn/view/HorizontalListView;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     add-int/2addr v3, v6
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     iget-object v4, v4, Lcom/twocloo/com/cn/view/HorizontalListView;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/view/HorizontalListView$2;->this$0:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/view/HorizontalListView;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/view/HorizontalListView;->access$5(Lcom/twocloo/com/cn/view/HorizontalListView;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     invoke-interface {v4, v5}, Landroid/widget/ListAdapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     .line 319
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemSelectedListener;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 311
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
