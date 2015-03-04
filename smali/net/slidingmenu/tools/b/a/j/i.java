package net.slidingmenu.tools.b.a.j; class i { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/a/j/i;
a=0;// .super Landroid/view/GestureDetector$SimpleOnGestureListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:F
a=0;// 
a=0;// .field private d:F
a=0;// 
a=0;// .field private e:F
a=0;// 
a=0;// .field private f:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lnet/slidingmenu/tools/b/a/j/d;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/a/j/i;->a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/j/i;);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->c:F
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->d:F
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->e:F
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->f:F
a=0;// 
a=0;//     iput p2, p0, Lnet/slidingmenu/tools/b/a/j/i;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDoubleTap(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDoubleTap(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/high16 v2, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->c:F
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/j/i;->e:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     cmpg-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->d:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/j/i;->f:F
a=0;// 
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     cmpg-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/j/d;->d(Lnet/slidingmenu/tools/b/a/j/d;)Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->b:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->c:F
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->d:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->e:F
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->f:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     :try_start_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/j/d;->d(Lnet/slidingmenu/tools/b/a/j/d;)Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lnet/slidingmenu/tools/b/a/j/j;->g()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/j/d;->d(Lnet/slidingmenu/tools/b/a/j/d;)Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lnet/slidingmenu/tools/b/a/j/j;->i()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDown(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onLongPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onLongPress(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onShowPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onShowPress(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/j/d;->d(Lnet/slidingmenu/tools/b/a/j/d;)Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->b:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     :try_start_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/j/d;->d(Lnet/slidingmenu/tools/b/a/j/d;)Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lnet/slidingmenu/tools/b/a/j/j;->e()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/i;->a:Lnet/slidingmenu/tools/b/a/j/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/j/d;->d(Lnet/slidingmenu/tools/b/a/j/d;)Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lnet/slidingmenu/tools/b/a/j/j;->h()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onSingleTapUp(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
