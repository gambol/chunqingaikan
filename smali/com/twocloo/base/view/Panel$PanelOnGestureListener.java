package com.twocloo.base.view; class Panel$PanelOnGestureListener { void a() { int a;
a=0;// .class Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Panel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/base/view/Panel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "PanelOnGestureListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field scrollX:F
a=0;// 
a=0;// .field scrollY:F
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/view/Panel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     iput-object p1, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/view/Panel$PanelOnGestureListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 395
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollY:F
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollX:F
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v3, Lcom/twocloo/base/view/Panel$State;->READY:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-eq v0, v3, :cond_0
a=0;// 
a=0;//     .line 407
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 400
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel$State;);v2=(Null);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     sget-object v3, Lcom/twocloo/base/view/Panel$State;->ABOUT_TO_ANIMATE:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcom/twocloo/base/view/Panel;->access$17(Lcom/twocloo/base/view/Panel;Lcom/twocloo/base/view/Panel$State;)V
a=0;// 
a=0;//     .line 401
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/view/Panel;->access$0(Lcom/twocloo/base/view/Panel;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/view/Panel;->access$9(Lcom/twocloo/base/view/Panel;Z)V
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/view/Panel;->access$10(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/view/Panel;->access$0(Lcom/twocloo/base/view/Panel;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 407
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Null);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 401
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 3
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 411
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     sget-object v1, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/view/Panel;->access$17(Lcom/twocloo/base/view/Panel;Lcom/twocloo/base/view/Panel$State;)V
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/base/view/Panel;->access$1(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .end local p4    # "velocityY":F
a=0;//     :goto_0
a=0;//     invoke-static {v0, p4}, Lcom/twocloo/base/view/Panel;->access$21(Lcom/twocloo/base/view/Panel;F)V
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v1, v1, Lcom/twocloo/base/view/Panel;->startAnimation:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/view/Panel;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 414
a=0;//     return v2
a=0;// 
a=0;//     .restart local p4    # "velocityY":F
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     move p4, p3
a=0;// 
a=0;//     .line 412
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onLongPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 419
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 7
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "distanceX"    # F
a=0;//     .param p4, "distanceY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 422
a=0;//     #v5=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     sget-object v3, Lcom/twocloo/base/view/Panel$State;->TRACKING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     invoke-static {v2, v3}, Lcom/twocloo/base/view/Panel;->access$17(Lcom/twocloo/base/view/Panel;Lcom/twocloo/base/view/Panel$State;)V
a=0;// 
a=0;//     .line 423
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "tmpY":F
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 424
a=0;//     .local v0, "tmpX":F
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/base/view/Panel;->access$1(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v6, :cond_3
a=0;// 
a=0;//     .line 425
a=0;//     iget v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollY:F
a=0;// 
a=0;//     sub-float/2addr v2, p4
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollY:F
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollY:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/view/Panel;->access$4(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     neg-int v4, v4
a=0;// 
a=0;//     invoke-static {v2, v3, v4, v5}, Lcom/twocloo/base/view/Panel;->access$22(Lcom/twocloo/base/view/Panel;FII)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 439
a=0;//     :goto_0
a=0;//     #v0=(Float);v1=(Float);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/base/view/Panel;->access$14(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     cmpl-float v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/view/Panel;->access$11(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     cmpl-float v2, v1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 440
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/view/Panel;->access$16(Lcom/twocloo/base/view/Panel;F)V
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v2, v1}, Lcom/twocloo/base/view/Panel;->access$15(Lcom/twocloo/base/view/Panel;F)V
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/base/view/Panel;->invalidate()V
a=0;// 
a=0;//     .line 444
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 429
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Null);v2=(Integer);v3=(Reference,Lcom/twocloo/base/view/Panel$State;);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollY:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/view/Panel;->access$4(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v5, v4}, Lcom/twocloo/base/view/Panel;->access$22(Lcom/twocloo/base/view/Panel;FII)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 431
a=0;//     #v1=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 432
a=0;//     :cond_3
a=0;//     #v1=(Null);v2=(Integer);v3=(Reference,Lcom/twocloo/base/view/Panel$State;);v4=(Uninit);
a=0;//     iget v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollX:F
a=0;// 
a=0;//     sub-float/2addr v2, p3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollX:F
a=0;// 
a=0;//     .line 433
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v2}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_4
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollX:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/view/Panel;->access$3(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     neg-int v4, v4
a=0;// 
a=0;//     invoke-static {v2, v3, v4, v5}, Lcom/twocloo/base/view/Panel;->access$22(Lcom/twocloo/base/view/Panel;FII)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 435
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 436
a=0;//     :cond_4
a=0;//     #v0=(Null);v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollX:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/view/Panel;->access$3(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v2, v3, v5, v4}, Lcom/twocloo/base/view/Panel;->access$22(Lcom/twocloo/base/view/Panel;FII)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onShowPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 449
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSingleTapUp(Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 453
a=0;//     iget-object v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v1, v1, Lcom/twocloo/base/view/Panel;->startAnimation:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/base/view/Panel;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 454
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setScroll(II)V
a=0;//     .locals 1
a=0;//     .param p1, "initScrollX"    # I
a=0;//     .param p2, "initScrollY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 390
a=0;//     int-to-float v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollX:F
a=0;// 
a=0;//     .line 391
a=0;//     int-to-float v0, p2
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->scrollY:F
a=0;// 
a=0;//     .line 392
a=0;//     return-void
a=0;// .end method
}}
