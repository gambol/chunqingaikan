package com.tencent.open; class TaskGuide$e { void a() { int a;
a=0;// .class Lcom/tencent/open/TaskGuide$e;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/TaskGuide;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "e"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:I
a=0;// 
a=0;// .field final synthetic b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/open/TaskGuide;Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 464
a=0;//     iput-object p1, p0, Lcom/tencent/open/TaskGuide$e;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     .line 465
a=0;//     invoke-direct {p0, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 469
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$e;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/open/TaskGuide$e;->a:I
a=0;// 
a=0;//     .line 467
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 477
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "XXXX"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "onInterceptTouchEvent-- action = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "currentY = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 478
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$e;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     const/16 v2, 0xbb8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {v1, v2}, Lcom/tencent/open/TaskGuide;->e(Lcom/tencent/open/TaskGuide;I)V
a=0;// 
a=0;//     .line 479
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 491
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 481
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/open/TaskGuide$e;->a:I
a=0;// 
a=0;//     .line 482
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 485
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/tencent/open/TaskGuide$e;->a:I
a=0;// 
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 486
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$e;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->q(Lcom/tencent/open/TaskGuide;)V
a=0;// 
a=0;//     .line 487
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 479
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 499
a=0;//     invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 501
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 502
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "XXXX"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, " onTouchEvent-----startY = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v3, p0, Lcom/tencent/open/TaskGuide$e;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "currentY = "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 505
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 521
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     .line 507
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/open/TaskGuide$e;->a:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 513
a=0;//     :pswitch_2
a=0;//     iget v1, p0, Lcom/tencent/open/TaskGuide$e;->a:I
a=0;// 
a=0;//     sub-int v0, v1, v0
a=0;// 
a=0;//     invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 514
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$e;->b:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->q(Lcom/tencent/open/TaskGuide;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 505
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
