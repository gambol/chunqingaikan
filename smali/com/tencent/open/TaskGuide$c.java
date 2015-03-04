package com.tencent.open; class TaskGuide$c { void a() { int a;
a=0;// .class Lcom/tencent/open/TaskGuide$c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/open/TaskGuide;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "c"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Z
a=0;// 
a=0;// .field b:F
a=0;// 
a=0;// .field final synthetic c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/open/TaskGuide;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 533
a=0;//     iput-object p1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 531
a=0;//     #p0=(Reference,Lcom/tencent/open/TaskGuide$c;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/open/TaskGuide$c;->a:Z
a=0;// 
a=0;//     .line 537
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/open/TaskGuide$c;->b:F
a=0;// 
a=0;//     .line 534
a=0;//     iput-boolean p2, p0, Lcom/tencent/open/TaskGuide$c;->a:Z
a=0;// 
a=0;//     .line 535
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 541
a=0;//     #v0=(Integer);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J
a=0;// 
a=0;//     .line 542
a=0;//     iget v2, p0, Lcom/tencent/open/TaskGuide$c;->b:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     float-to-double v2, v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-wide v4, 0x3fb999999999999aL    # 0.1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-double/2addr v2, v4
a=0;// 
a=0;//     double-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lcom/tencent/open/TaskGuide$c;->b:F
a=0;// 
a=0;//     .line 544
a=0;//     iget v2, p0, Lcom/tencent/open/TaskGuide$c;->b:F
a=0;// 
a=0;//     .line 545
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v3, v2, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 548
a=0;//     :cond_0
a=0;//     cmpl-float v0, v2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 552
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v3}, Lcom/tencent/open/TaskGuide;->r(Lcom/tencent/open/TaskGuide;)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget-object v3, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/open/TaskGuide;->s(Lcom/tencent/open/TaskGuide;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     .line 553
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v3, p0, Lcom/tencent/open/TaskGuide$c;->a:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 554
a=0;//     iget-object v3, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v3}, Lcom/tencent/open/TaskGuide;->k(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v4}, Lcom/tencent/open/TaskGuide;->t(Lcom/tencent/open/TaskGuide;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v4, v2
a=0;// 
a=0;//     iput v4, v3, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;// 
a=0;//     .line 558
a=0;//     :goto_1
a=0;//     const-string v3, "TAG"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "mWinParams.y = "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/tencent/open/TaskGuide;->k(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "deltaDistence = "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 560
a=0;//     iget-object v2, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 566
a=0;//     :goto_2
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 567
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->v(Lcom/tencent/open/TaskGuide;)V
a=0;// 
a=0;//     .line 572
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 548
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(One);v2=(Integer);v3=(Byte);v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 556
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Boolean);
a=0;//     iget-object v3, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v3}, Lcom/tencent/open/TaskGuide;->k(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v4}, Lcom/tencent/open/TaskGuide;->t(Lcom/tencent/open/TaskGuide;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v4, v2
a=0;// 
a=0;//     iput v4, v3, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 563
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v4=(Reference,Ljava/lang/StringBuilder;);v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->u(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v2}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/tencent/open/TaskGuide;->k(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v1, v2, v3}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 569
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v0}, Lcom/tencent/open/TaskGuide;->x(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/open/TaskGuide$c;->c:Lcom/tencent/open/TaskGuide;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/open/TaskGuide;);
a=0;//     invoke-static {v1}, Lcom/tencent/open/TaskGuide;->w(Lcom/tencent/open/TaskGuide;)Ljava/lang/Runnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-wide/16 v2, 0x5
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
}}
