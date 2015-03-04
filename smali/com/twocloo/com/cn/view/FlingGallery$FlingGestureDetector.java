package com.twocloo.com.cn.view; class FlingGallery$FlingGestureDetector { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;
a=0;// .super Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// .source "FlingGallery.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "FlingGestureDetector"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/twocloo/com/cn/view/FlingGallery;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/com/cn/view/FlingGallery;Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;-><init>(Lcom/twocloo/com/cn/view/FlingGallery;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 569
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v0, v2}, Lcom/twocloo/com/cn/view/FlingGallery;->access$10(Lcom/twocloo/com/cn/view/FlingGallery;Z)V
a=0;// 
a=0;//     .line 572
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->access$11(Lcom/twocloo/com/cn/view/FlingGallery;I)V
a=0;// 
a=0;//     .line 573
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 4
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, 0x43c80000    # 400.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v2, 0x42f00000    # 120.0f
a=0;// 
a=0;//     .line 627
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/high16 v1, 0x437a0000    # 250.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpg-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 629
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 630
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 632
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/FlingGallery;->movePrevious()V
a=0;// 
a=0;//     .line 635
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 636
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 638
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/FlingGallery;->moveNext()V
a=0;// 
a=0;//     .line 642
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onLongPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 2
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 649
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->access$11(Lcom/twocloo/com/cn/view/FlingGallery;I)V
a=0;// 
a=0;//     .line 650
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/view/FlingGallery;->processGesture()V
a=0;// 
a=0;//     .line 651
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 10
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "distanceX"    # F
a=0;//     .param p4, "distanceY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_5
a=0;// 
a=0;//     .line 582
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$9(Lcom/twocloo/com/cn/view/FlingGallery;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/com/cn/view/FlingGallery;->access$10(Lcom/twocloo/com/cn/view/FlingGallery;Z)V
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/com/cn/view/FlingGallery;->access$12(Lcom/twocloo/com/cn/view/FlingGallery;Z)V
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/com/cn/view/FlingGallery;->access$11(Lcom/twocloo/com/cn/view/FlingGallery;I)V
a=0;// 
a=0;//     .line 590
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-static {v6, v7, v8}, Lcom/twocloo/com/cn/view/FlingGallery;->access$13(Lcom/twocloo/com/cn/view/FlingGallery;J)V
a=0;// 
a=0;//     .line 591
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/view/FlingGallery;->access$14(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aget-object v7, v7, v8
a=0;// 
a=0;//     .line 592
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->getCurrentOffset()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     .line 591
a=0;//     #v7=(Float);
a=0;//     invoke-static {v6, v7}, Lcom/twocloo/com/cn/view/FlingGallery;->access$15(Lcom/twocloo/com/cn/view/FlingGallery;F)V
a=0;// 
a=0;//     .line 595
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$16(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     .line 596
a=0;//     #v6=(Float);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/view/FlingGallery;->access$5(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     const/high16 v8, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-float/2addr v7, v8
a=0;// 
a=0;//     .line 595
a=0;//     div-float v2, v6, v7
a=0;// 
a=0;//     .line 597
a=0;//     .local v2, "maxVelocity":F
a=0;//     #v2=(Float);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     .line 598
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/view/FlingGallery;->access$17(Lcom/twocloo/com/cn/view/FlingGallery;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     .line 597
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     sub-long v4, v6, v8
a=0;// 
a=0;//     .line 599
a=0;//     .local v4, "timestampDelta":J
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     long-to-float v6, v4
a=0;// 
a=0;//     #v6=(Float);
a=0;//     const/high16 v7, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     div-float/2addr v6, v7
a=0;// 
a=0;//     mul-float v1, v2, v6
a=0;// 
a=0;//     .line 600
a=0;//     .local v1, "maxScrollDelta":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     sub-float v0, v6, v7
a=0;// 
a=0;//     .line 602
a=0;//     .local v0, "currentScrollDelta":F
a=0;//     #v0=(Float);
a=0;//     const/high16 v6, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v6, v1
a=0;// 
a=0;//     #v6=(Float);
a=0;//     cmpg-float v6, v0, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_1
a=0;// 
a=0;//     .line 603
a=0;//     const/high16 v6, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float v0, v1, v6
a=0;// 
a=0;//     .line 604
a=0;//     :cond_1
a=0;//     cmpl-float v6, v0, v1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-lez v6, :cond_2
a=0;// 
a=0;//     .line 605
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 606
a=0;//     :cond_2
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$18(Lcom/twocloo/com/cn/view/FlingGallery;)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     add-float/2addr v6, v0
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 610
a=0;//     .local v3, "scrollOffset":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$16(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v3, v6, :cond_3
a=0;// 
a=0;//     .line 611
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$16(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 612
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$16(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-int/lit8 v6, v6, -0x1
a=0;// 
a=0;//     if-gt v3, v6, :cond_4
a=0;// 
a=0;//     .line 613
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$16(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-int/lit8 v3, v6, -0x1
a=0;// 
a=0;//     .line 615
a=0;//     :cond_4
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     aget-object v6, v6, v7
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/view/FlingGallery;->access$14(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v3, v7, v8}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 616
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget-object v6, v6, v7
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/view/FlingGallery;->access$14(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v3, v7, v8}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 617
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/view/FlingGallery;->access$4(Lcom/twocloo/com/cn/view/FlingGallery;)[Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     aget-object v6, v6, v7
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/view/FlingGallery;->access$14(Lcom/twocloo/com/cn/view/FlingGallery;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v3, v7, v8}, Lcom/twocloo/com/cn/view/FlingGallery$FlingGalleryView;->setOffset(III)V
a=0;// 
a=0;//     .line 620
a=0;//     .end local v0    # "currentScrollDelta":F
a=0;//     .end local v1    # "maxScrollDelta":F
a=0;//     .end local v2    # "maxVelocity":F
a=0;//     .end local v3    # "scrollOffset":I
a=0;//     .end local v4    # "timestampDelta":J
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(PosByte);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     return v6
a=0;// .end method
a=0;// 
a=0;// .method public onShowPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 656
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSingleTapUp(Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 662
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/FlingGallery$FlingGestureDetector;->this$0:Lcom/twocloo/com/cn/view/FlingGallery;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/FlingGallery;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/view/FlingGallery;->access$11(Lcom/twocloo/com/cn/view/FlingGallery;I)V
a=0;// 
a=0;//     .line 663
a=0;//     return v1
a=0;// .end method
}}
